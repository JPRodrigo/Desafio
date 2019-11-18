
package desafio;


public class Tarefa {
    
    private String titulo;
    private String data;

    void atribuirTitulo(String paramet){
        titulo = paramet;
    }
    
    String pegaTitulo(){
        return titulo;
    }
    
     void dataLimite(String paramet){
        data = paramet;
    }
    
    String pegarDataLimite(){
        return data;
    }
}
