
package Banco;

public  abstract class Conta implements IConta {
    
    private static int agenciaPadrao = 1; 
    
    private static int sequencial = 1; 
    
    protected int agencia;
    
    protected int numero;
    
    protected Cliente cliente;
    
    protected double saldo = 0;

    @Override
    public boolean sacar(double valor) {
        
        if(saldo>= valor){
            saldo -= valor;
            System.out.println("novo saldo "+saldo);
            return true;
        }
        else{
            System.out.println("saldo insuficiente");
            return false;
        }
        
    }

    @Override
    public void depositar(double valor) {
        
        saldo += valor;
        System.out.println("novo saldo "+saldo);

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.sacar(valor)){
            
            contaDestino.depositar(valor);
            System.out.println("transferencia realizada con sucesso");
            System.out.println("novo saldo "+saldo);

        }
        
    }

    public Conta(Cliente cliente ) {
        this.agencia = Conta.agenciaPadrao;
        this.numero = sequencial++;
        this.cliente = cliente;
        
    }
    
    
    
    protected void imprimirDados(){
        
        System.out.println(String.format("Titular %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("numero %d", this.numero));
        System.out.println(String.format("saldo %.2f", this.saldo));
        
        
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

    public Cliente getCliente() {
        return cliente;
    }

    
    
    
        
}
