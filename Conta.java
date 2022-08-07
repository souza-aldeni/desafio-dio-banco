package desafiodiobanco;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Aldeni
 */
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
       
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
        private ArrayList<Transacao> historicoTransacoes = new ArrayList<>();

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;                
                Transacao transacao = new Transacao(valor*-1, "Saque");
                historicoTransacoes.add(transacao);
	}
        public void debito(double valor) {
		saldo -= valor;                
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
                Transacao transacao = new Transacao(valor, "Deposito");
                historicoTransacoes.add(transacao);
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.debito(valor);
		contaDestino.depositar(valor);
                Transacao transacao = new Transacao(valor*-1, "Transf. p/ conta n. "+contaDestino.getNumero());
                historicoTransacoes.add(transacao);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
        
	@Override
        public void imprimirSaldo() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
        @Override
        public void imprimirExtrato() {
            
            System.out.println(String.format("Agencia: %d ", this.agencia));
            System.out.print(String.format("Numero: %d ", this.numero));
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println("===============================================");
            SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
            for (Transacao transacao: historicoTransacoes)
                if ("Saque".equals(transacao.getNome()))
                    System.out.println(formatador.format(transacao.getData())+" "+transacao.getNome()+
                            "                         "+transacao.getValor());
                else if ("Deposito".equals(transacao.getNome()))
                    System.out.println(formatador.format(transacao.getData())+" "+transacao.getNome()+
                            "                      "+transacao.getValor());
                else
                    System.out.println(formatador.format(transacao.getData())+" "+transacao.getNome()+
                            "         "+transacao.getValor());
            System.out.println("===============================================");
            System.out.println(String.format("Saldo: %.2f", this.saldo));
        }
}
