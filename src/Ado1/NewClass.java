/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ado1;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */

public class NewClass {
    public static void main(String[] args) {
        int vetor [] = tamanhoMatriz();
        
        int matriz[][] = criarMatriz(vetor);
        
        imprimirMatriz(matriz);
        obterNumero();
        int n =obterNumero();
       int Qtde = verificarOcorrencias(n, matriz);
        System.out.println("quantidade: "+ Qtde);
        
    }
   
    public static int [] tamanhoMatriz(){
        System.out.println("*-* tanmanho matriz ");
        Scanner input = new Scanner (System.in);
        int [] vetor = new int [2];
        System.out.println("Linhas");
        vetor[0] = input.nextInt();
        System.out.println("Colunas");
        vetor[1] = input.nextInt();
        return vetor;
    
    
    }
        public static int[][] criarMatriz(int[] vetor){
            
            System.out.println("*-*Criar Matriz *-*");
            Scanner input = new Scanner (System.in);
            // instanciando matriz
            int [][] matriz = new int [vetor[0]][vetor[1]];
            for(int linha = 0; linha< vetor[0]; linha++ ){
                for(int coluna = 0; coluna< vetor[1]; coluna++ ){
                    System.out.printf("Matriz [%d][%d]: ", linha, coluna );
                    matriz [linha][coluna] = input.nextInt();
                    System.out.println("");
                }
            }
            return matriz;
            
        }
        public static void imprimirMatriz(int [][] matriz){
        
            System.out.println("*** imprimir matriz ****");
            for (int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.printf("Matriz: [%d][%d]: %d", i, j, matriz [i][j]);
                }
            }
            System.out.println("");
        }
        public static int obterNumero(){
        
            System.out.println("*** obter numero ***");
            Scanner input = new Scanner (System.in);
            System.out.println("Numeros: ");
            int n = input.nextInt();
            return n;
        }
        
        public static int verificarOcorrencias(int n, int [][] m){
            System.out.println("*** verificar ocorrencia ***");
            int cont=0;
            for(int i=0; i<m.length; i++){
                for(int j=0; j<m.length; i++){
                    if(n==m [i][j]){
                    cont++;                    
                    }
                
                }
            
            }
            return cont;
        
        }
            
            
          
        
       }
    
    

