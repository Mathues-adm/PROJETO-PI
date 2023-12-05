/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAKEOJOGO;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class MenuJogo {
    public static void main(String[] args) {
        
        
        
                int escolha;
                int cor = 0;
                int bluequestao1;
                int bluequestao2;
                int bluequestao3;
                int bluequestao4;
                int bluequestao5;
                
                int redquestao1;
                int redquestao2;
                int redquestao3;
                int redquestao4;
                int redquestao5;
                String nome;
                
                do{
            Scanner input = new Scanner (System.in);
                    System.out.println("Matrix");
            System.out.println("1 - Jogar");
            System.out.println("2 - Creditos");
            System.out.println("3 - Sair");
            escolha=input.nextInt();
            
            switch (escolha) {
            case 1:
                
                System.out.println("Seja bem vindo a Matrix jogador(a).");
                break;

     case 2:
       System.out.println("creditos");
       break;
     case 3:
       System.out.println("Até a proxima! Voltando ao menu principal..");
       break;
     }
        }while(escolha !=1 && escolha !=3 && escolha != 2);
        
                
                Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor digite o nome");
                nome = teclado.next();
                System.out.println("=========== R E G R A S ==========");
                System.out.println("Morpheus: E  um nome bonito mas.. na Matrix nada importa! Você foi escolhido para entrar na matriz\n"+
"e terar que sobreviver a ela oque é algo bem simples. Você ira passar por 3 fases:\n" +
"\n" +
"Primeira fase: Você deve escolher uma das 2 pilulas para entrar em uma matrix se não escolher \n" +
"ficará preso(a) no limbo até escolher!\n" +
"\n" +
"Segunda fase: Depois de escolher uma pilula você será transportado(a) para uma matrix no qual\n" +
"você precisa responder 5 questões  de um determinado assunto.. A matrix que escolhe! Oque \n" +
"descobrimos  e que ela sempre escolhe assuntos de calculos e Codigos! espero que saiba algo, \n" +
"pois SE ERRAR UMA QUESTAO VOCE MORRE!\n" +
"\n" +
"Terceira fase:  Depois que acertar as 5 questoes estará livre da Matrix e podera retornar ao mundo\n" +
"real. A matrix e perigosa! Não aceita vencedores então para que ela nao ache você na vida real \n" +
"iremos mudar sua identidade e sua caracteristica fisiologicas atraves de um chip cerebral antes da\n" +
"matrix scannear voce." + nome);
        
        do{
            System.out.println("Morpheus: Chega de conversa! Vamos direto ao ponto. Está preparado?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            
            escolha=teclado.nextInt();
            
            switch (escolha) {
            case 1:
                
                System.out.println("Chegou a hora de fazer sua escolha! Lembrando que após sua escolha");
                System.out.println("Iremos implantar o chip cerebral em você. Boa sorte! " + nome);
     case 2:
       System.out.println("Imaginei que fosse amarelar.. Adeus!");
       break;
     
     }
        }while(escolha !=1);
        
        if (escolha == 1)
            
                do{
                    System.out.println( "Pronto! "+nome+" Implatamos seu chip agora, não sabemos sua forma fisica como vai ser quando entrar \n"+
                            "o chip gera um código genético é aleatório então o seu novo nome será Zero! \n" +
                            "Boa sorte Zero!\n"+ "\n");
                System.out.println("escolha uma cor:");
                System.out.println("1- Vermelho");
                System.out.println("2-  azul");
                cor=teclado.nextInt();
                
              
                switch (cor) {
            case 1:
       System.out.println("Bem vindo a red Matrix " + nome);
       break;
       
            case 2:
                System.out.println("Bem vindo a blue matrix " + nome);
                break;
                }
                   
                }while(cor < 1 || cor > 2);
        
                if (cor == 1){
                    
                   
                 do{        
                System.out.println("Faça sua escolha " + nome);
               
               
                   
                    System.out.println(" pergunta 1");
                     System.out.println("");
                     System.out.println("O que o seguinte código imprime?\n" +
"\n" +
"int[] numeros = {1, 2, 3, 4, 5};\n" +
"for (int i = 0; i < numeros.length; i++) {\n" +
"    System.out.print(numeros[i] + \" \");\n" +
"}");
                    System.out.println("1) 1 2 3 4 5");
                    System.out.println("2) 5 4 3 2 1");
                    System.out.println("3) 1 3 5");
                    System.out.println("4) Erro de compilacao");
                    redquestao1 = teclado.nextInt();
                    
                    switch (redquestao1) {
            case 1:
                
                System.out.println("ACHO QUE SUBSTIMEI VOCÊ.");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("ERROU");
       break;
     }
      
        }while(redquestao1 != 1);
                
               
                do{    
                    System.out.println(" pergunta 2");
                    System.out.println("O que acontece se você tentar compilar e executar o seguinte código?\n" +
"\n" +
"public class Exemplo {\n" +
"    public static void main(String[] args) {\n" +
"        int x = 10;\n" +
"        int y = 0;\n" +
"        int resultado = x / y;\n" +
"        System.out.println(resultado);\n" +
"    }\n" +
"}");
                    System.out.println("1) O código compila e imprime 10.");
                    System.out.println("2) O código compila e imprime 0.");
                    System.out.println("3) O código compila, mas resulta em uma exceção de divisão por zero durante a execução.");
                    System.out.println("4) O código não compila devido a um erro na linha int resultado = x / y;.");
                    redquestao2 = teclado.nextInt();
                    
                    switch (redquestao2) {
            case 1:
                
                System.out.println("Errou! ");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("Seu intelecto é mais amplo do que imaginei.. continue zero vamos ver até onde você vai chegar");
         System.out.println("");
       break;
       case 4:
       System.out.println("ERROU");
       break;
     }
                    
      
        }while(redquestao2 != 3);
                
                do{
               
               
                   
                    System.out.println(" pergunta 3"+" \n" +
                            "O que o código a seguir faz?\n" +
"\n" +
"public class Main {\n" +
"    public static void main(String[] args) {\n" +
"        String[] nomes = {\"Alice\", \"Bob\", \"Charlie\"};\n" +
"        for (String nome : nomes) {\n" +
"            System.out.println(nome);\n" +
"        }\n" +
"    }\n" +
"}");
                    System.out.println("1) Imprime \"Alice\", \"Bob\" e \"Charlie\" em linhas separadas.");
                    System.out.println("2) Cria uma exceção de ArrayIndexOutOfBounds.");
                    System.out.println("3) Não compila devido a um erro no loop for-each.");
                    System.out.println("4) Imprime \"0\", \"1\" e \"2\" em linhas separadas.");
                    redquestao3 = teclado.nextInt();
                    
                    switch (redquestao3) {
            case 1:
                
                System.out.println("Zero, Zero, Zero você é realmente um cara intrigante... vamos ver se consegue acertar a proxima!.");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("ERROU");
       break;
       case 4:
       System.out.println("ERROU");
       break;
     }
      
        }while(redquestao3 != 1);
                
                                do{        
                System.out.println("Faça sua escolha " + nome);
               
               
                   
                    System.out.println(" pergunta 4 \n" + "Red Matrix: Zero.. esta é sua penultima questão estou intrigado com sua inteligencia... \n"+
                            "public class Mediana {\n" +
"    public static void main(String[] args) {\n" +
"        int[] numeros = {4, 7, 2, 9, 5, 1, 8, 3, 6};\n" +
"        int mediana = calcularMediana(numeros);\n" +
"        System.out.println(\"A mediana do array é: \" + mediana);\n" +
"    }\n" +
"\n" +
"    static int calcularMediana(int[] array) {\n" +
"        // Implemente o código para calcular a mediana do array\n" +
"        // (Dica: Ordene o array antes de calcular a mediana)\n" +
"        return 0;\n" +
"    }\n" +
"}");
                    System.out.println("1) return array[array.length / 2];");
                    System.out.println("2) Arrays.sort(array); return array[array.length / 2];");
                    System.out.println("3 return array[(array.length - 1) / 2];");
                    System.out.println("4 Arrays.sort(array); return array[(array.length - 1) / 2];");
                    redquestao4 = teclado.nextInt();
                    
                    switch (redquestao4) {
            case 1:
                
                System.out.println("Reta final Zero! sua ultima questão e irei conceder sua liberdade");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("ERROU");
       break;
       case 4:
       System.out.println("ERROU");
       break;
     }
      
        }while(redquestao4 != 1);
        
                                          do{        
                System.out.println("Faça sua escolha " + nome);
               
               
                   
                    System.out.println(" pergunta 5 \n" +
                            "public class PerguntaQuinze {\n" +
"    public static void main(String[] args) {\n" +
"        int a = 5;\n" +
"        int b = 3;\n" +
"        int resultado = multiplicacaoSoma(a, b);\n" +
"        System.out.println(\"O resultado da multiplicação e soma é: \" + resultado);\n" +
"    }\n" +
"\n" +
"    static int multiplicacaoSoma(int x, int y) {\n" +
"        return x * y + x;\n" +
"    }\n" +
"}");
                    System.out.println("1) 10");
                    System.out.println("2) 15");
                    System.out.println("3) 20");
                    System.out.println("4) 25");
                    redquestao5 = teclado.nextInt();
                    
                    switch (redquestao5) {
            case 1:
                
                System.out.println("errou");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("PARABENS VOCÊ VENCEU A MATRIX!");
       break;
     }
      
        }while(redquestao5 != 3);
                
                }else System.out.println("Parece que escolhemos outro");
                
                System.out.println("Faça sua escolha " + nome);
               
               
                   do{
                    System.out.println(" pergunta 1: Qual é o resultado da expressão \n" +
"3×(4+2)−5? ");
                    System.out.println("1) 10");
                    System.out.println("2) 15");
                    System.out.println("3) 18");
                    System.out.println("4) 21");
                    bluequestao1 = teclado.nextInt();
                    
                    switch (bluequestao1) {
            case 1:
                
                System.out.println("Errou");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("ACHO QUE SUBSTIMEI VOCE.");
       break;
       
       case 4:
       System.out.println("ERROU");
       break;
     }
      
                   }while(bluequestao1 != 18);
                
               
                do{    
                    System.out.println(" Simplifique a expressão \n" +
"8−(2×3)+5.");
                    System.out.println("1");
                    System.out.println("3");
                    System.out.println("8");
                    System.out.println("11");
                    bluequestao2 = teclado.nextInt();
                    
      
        }while(bluequestao2 != 3);
                
                do{        
                System.out.println("Faça sua escolha " + nome);
               
               
                   
                    System.out.println(" pergunta 3: Se a= 2, b=5 e c=3 qual é o valor /d" +
                            "de a x (b-c)?");
                    System.out.println("7");
                    System.out.println("10");
                    System.out.println("11");
                    System.out.println("12");
                    bluequestao3 = teclado.nextInt();
                    
                    switch (bluequestao3) {
            case 1:
                
                System.out.println("ACHO QUE SUBSTIMEI VOCÊ.");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("ERROU");
       break;
     }
      
        }while(bluequestao3 != 1);
                
                                do{        
                System.out.println("Faça sua escolha " + nome);
               
               
                   
                    System.out.println(" pergunta 4: Resolva a expressão \n" +
" 16+3×2−5.");
                    System.out.println("13");
                    System.out.println("19");
                    System.out.println("25");
                    System.out.println("29");
                    bluequestao4 = teclado.nextInt();
                    
                    switch (bluequestao4) {
            case 1:
                
                System.out.println("ACHO QUE SUBSTIMEI VOCÊ.");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("ERROU");
       break;
     }
      
        }while(bluequestao4 != 1);
        
                                          do{        
                System.out.println("Faça sua escolha " + nome);
               
               
                   
                    System.out.println(" pergunta 5: qual é o valor de 6/(2+1)");
                    System.out.println("2");
                    System.out.println("3");
                    System.out.println("4");
                    System.out.println("6");
                    bluequestao5 = teclado.nextInt();
                    
                    switch (bluequestao5) {
            case 1:
                
                System.out.println("ACHO QUE SUBSTIMEI VOCÊ.");
                break;
                
     case 2:
       System.out.println("ERROU");
       break;
     case 3:
       System.out.println("ERROU");
       break;
     }
      
        }while(bluequestao5 != 1);
                
                 
            

                
                    

                
                
               
        
                
                
            }
            }
               
                      
        
       
                        
        
    
