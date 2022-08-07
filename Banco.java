package desafiodiobanco;
import java.util.ArrayList;

/**
 *
 * @author Aldeni
 */
public class Banco {
    
    private static ArrayList<Conta> listaDeContas = new ArrayList<>();
    
    public void listarContas(){   
        System.out.println("------Lista de Clientes------");
        System.out.println("AG  C0NTA   TITULAR");
        for (Conta conta: listaDeContas)
            System.out.println(conta.getAgencia() +"   "+ conta.getNumero() +
                    "       "+ conta.cliente.getNome());
    }

    public void setListaDeContas(Conta conta) {
        listaDeContas.add(conta);
    }
}
