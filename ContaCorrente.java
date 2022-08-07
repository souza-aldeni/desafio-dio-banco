package desafiodiobanco;

/**
 *
 * @author Aldeni
 */
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
    
        @Override
	public void imprimirSaldo() {
		System.out.println("=== Saldo Conta Corrente ===");
		super.imprimirSaldo();
	}

        @Override
        public void imprimirExtrato() {
            System.out.println("=========== Extrato Conta Corrente ============");
            super.imprimirExtrato();
        }
	  
}
