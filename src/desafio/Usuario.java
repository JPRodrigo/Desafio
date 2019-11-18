
package desafio;

public class Usuario {
    
    private String email;
    private String nome;
    private String senha;
    
   void atribuirEmail(String paramet){
       email = paramet;
   }
   void atribuirNome(String paramet){
       nome = paramet;
   }
   void atribuirSenha(String paramet){
       senha = paramet;
   }
   String pegarEmail(){
       return email;
   }
   String pegarNome(){
       return nome;
   }
   String pegarSenha(){
       return senha;
   }
    
}
