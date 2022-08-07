package desafiodiobanco;
import java.util.Date;

/**
 *
 * @author Aldeni
 */
class Transacao {
    
    private Date data; 
    private double valor;
    private String nome;

    public Transacao(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
        this.data = new Date();
    }
            
    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
