
package Banco;

import java.util.ArrayList;
import java.util.List;
public class Banco {
    
   private String nome;
   
   private List<Conta> contas;

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getNome() {
       return nome;
   }

   public Banco() {
       this.contas = new ArrayList<Conta>();
   }
    
   public void  adicionarCliente(Conta conta){
        
       contas.add(conta);
        
   }
   
   public void listarContas(){
       
       for(Conta c:contas){
           
            c.imprimirDados();
           
       }
           
       
   }
   
   
    
}
