
package desafiodiobanco;

public class Main {

    public static void main(String[] args) {
        
        Banco banco = new Banco();
        Conta conta1 = new ContaCorrente(new Cliente("Elon Musk"));
        banco.setListaDeContas(conta1);
        Conta conta2 = new ContaCorrente(new Cliente("Bill Gates"));
        banco.setListaDeContas(conta2);
        Conta conta3 = new ContaCorrente(new Cliente("Steve Jobs"));
        banco.setListaDeContas(conta3);
        
        conta1.depositar(1000);
        conta2.depositar(2000);
        conta3.depositar(3000);
        
        banco.listarContas();  
             
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        conta3.imprimirSaldo();  
        
        conta1.sacar(100);
        conta2.sacar(200);
        conta3.sacar(300);
        
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        conta3.imprimirSaldo(); 
        
        conta3.transferir(100, conta2);
        conta3.transferir(100, conta1);
        
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        conta3.imprimirSaldo(); 
        
        conta3.imprimirExtrato();

    } 
}
