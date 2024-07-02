package Test;

import Banco.Banco;
import Banco.Cliente;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;


public class Main {

    
    public static void main(String[] args) {
        
        Banco b1 = new Banco();
        
        Cliente c1 = new Cliente("victor");
        Cliente c2 = new Cliente("livia");

        ContaCorrente cc1 = new ContaCorrente(c1);
        ContaPoupanca cp1 = new ContaPoupanca(c1);
        
        
        cc1.depositar(1000);
        cc1.sacar(2000);
        
        ContaCorrente cc2 = new ContaCorrente(c2);
        
        cc1.transferir(10, cc2);
        cc1.sacar(900);
        cc1.transferir(100, cc2);
        
        
        b1.adicionarCliente(cc2);
        b1.adicionarCliente(cc1);
        
        b1.listarContas();
        
        
    }
    
}
