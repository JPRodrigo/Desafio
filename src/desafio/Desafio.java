package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        /* instanciado  Scanner */
        Scanner sca = new Scanner(System.in);
        /* instanciado  ArrayList e Class */
        ArrayList<Usuario> arryU = new ArrayList();
        ArrayList<Tarefa> arryT = new ArrayList();
        FimTarefa f = new FimTarefa();
        int escolha;

        /* Laço de recepção */
        for (int i = 0; i <= 100; i++) {

            /* perguta do menu  Menu com Opçoes *//////////////
            System.out.println("===========================");
            System.out.println(" 1 - Insira novo Usuário");
            System.out.println(" 2 - Insira nova Tarefa");
            System.out.println(" 3 - Finaliza Programa");
            System.out.println("===========================");
            System.out.print("Escolha um numero de 1 a 3: ");
            escolha = sca.nextInt();
        
        
      
            /* Condicional Validação *//////////////////
            if (escolha >= 4 || escolha <= 0) {
                System.out.println("O valor digitado é invalido. As opçoes validas são 1, 2 ou 3");
            }

        
        
            /* Condicional de escolhas Usuario */////////////////
            if (escolha == 1) {
                int y = i;
                /* Instanciando class*/
                Usuario u = new Usuario();
                /* questionario de usuario*/
                u.atribuirEmail(sca.nextLine());/* Gambiarra duvida */
                System.out.print("Digite o E-mail: ");
                u.atribuirEmail(sca.nextLine());
                System.out.print("Digite o Nome: ");
                u.atribuirNome(sca.nextLine());
                System.out.print("Digite o Senha: ");
                u.atribuirSenha(sca.nextLine());

                /* Inserindo dados no ArrayList*//////////////////////
                arryU.add(u);
                /* resultado ArrayList*/
                /*System.out.println(" O Usuario "+arryU.get(i).pegarNome()+" com o e-mail "+arryU.get(i).pegarEmail()+" e senha "+arryU.get(i).pegarSenha());*/
                System.out.println(" O Usuario " + arryU.get(y).pegarNome() + " com o e-mail " + arryU.get(y).pegarEmail() + " e senha " + arryU.get(y).pegarSenha());

            }
            /* Condicional de escolhas Tarefas *//////////////////////
            if (escolha == 2) {
                 int x = i;
                Tarefa t = new Tarefa();
                 t.atribuirTitulo(sca.nextLine());/* Gambiarra duvida */
                System.out.println("Digite A tarefa a ser realizada: ");
                t.atribuirTitulo(sca.nextLine());
                System.out.println("Digite A Data Limite separando com '/': ");
                t.dataLimite(sca.nextLine());

                /* Inserindo dados no ArrayList*//////////////////////
                arryT.add(t); /* erro quando coloquei com array  ( arryT.get(X).t.pegaTitulo() )(arryT.get(X).pegarDataLimite() )  */
                /* System.out.println("A Tarefa : " + arryT.get(x).pegaTitulo() + " tem data limite "+ arryT.get(x).pegarDataLimite()+" foi adiciona com sucesso") ;*/
                System.out.println("A Tarefa : " + t.pegaTitulo() + " tem data limite "+ t.pegarDataLimite()+" foi adiciona com sucesso") ;
              
            }

            /* Condicional de escolhas Finalizar *//////////////////////
            if (escolha == 3) {
                /* questionario da Finaliza*/
                System.out.println("Programa finalizado");
                
/* arryList não consigo colocar para funcionar  sempra da um erro. */
               /* for (int i = 0; i< arryU.size(); i++) {
                    System.out.println("==============================");
                    System.out.println("foi cadastrado Os Usuario");
                    System.out.println("O Usuario: " + arryU.get(i).pegarNome());
                    System.out.println("E-mail: " + arryU.get(i).pegarEmail());
                    System.out.println("Senha: " + arryU.get(i).pegarSenha());
                    
                    System.out.println("---------------------------------");
                    
                    System.out.println("que realizou a tarefa");
                    System.out.println("O Usuario: " + arryT.get(i).pegaTitulo());
                   System.out.println("E-mail: " + arryT.get(i).pegarDataLimite()); 
                    System.out.println("==============================");
                 }*/
                i = 100;

            }

        }

    }

}
