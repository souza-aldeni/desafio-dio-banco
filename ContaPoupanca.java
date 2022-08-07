package desafiodiobanco;

/**
 *
 * @author Aldeni
 */
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("=== Saldo Conta Poupança ===");
		super.imprimirSaldo();
	}

        @Override
        public void imprimirExtrato() {
            System.out.println("=== Extrato Conta Poupança ===");
            super.imprimirExtrato();
        }
}
