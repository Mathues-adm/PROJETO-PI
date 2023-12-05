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
public class Ado4 {
    
    public static void main(String[] args) {
        
        
        int t = tamanho();
        int[] r = criarVetor(t);
        imprimir(r);
        imprimePares(r);
        imprimeImPares(r);
      
        
        
    }
    
    public static int tamanho(){
        System.out.println("*-* Tamanho do Vetor *-*");
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int tamanho = input.nextInt();
        return tamanho;
    }
    
    public static int[] criarVetor(int tamanho){
        System.out.println("*-* Cria o Vetor *-*");
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[tamanho];
        for(int i=0; i<tamanho; i++){
            System.out.printf("vetor[%d]: \n", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
    public static void imprimir(int[] vetor){
        System.out.println("*-* Imprimir *-*");
        for(int i=0; i<vetor.length; i++){
            System.out.printf("vetor[%d]: %d \n", i, vetor[i]);
            
        }
    }
    
    
    
    public static void imprimeImPares(int[] r){
        System.out.println("*-* Elementos IMPARES *-*");
        for(int i=0; i<r.length; i++){
            if(r[i]%2 != 0){
                System.out.printf("vetor[%d]: %d\n", i, r[i]);
             
                  
        }
        

        }
    }
     public static void imprimePares(int[] v){
        System.out.println("*-* Elementos PARES *-*");
        for(int i=0; i<v.length; i++){
            if(v[i]%2 == 0){
                System.out.printf("vetor[%d]: %d\n", i, v[i]);
                
            }
        }
     }
     public static void ArmazenaPares(int[] r){
         
         
     }
     
     
    
    
    
    
            
       
        
        
    
    
    
     /**
     * TO DO
     * 1) FunÃƒÂ§ÃƒÂ£o para imprimir os nÃƒÂºmeros pares
     * 2) FunÃƒÂ§ÃƒÂ£o para imprimir os nÃƒÂºmeros ÃƒÂ­mpares
     * 3) FunÃƒÂ§ÃƒÂ£o separar em um vetor os nÃƒÂºmeros pares
     * 4) FunÃƒÂ§ÃƒÂ£o separar em um vetor os nÃƒÂºmeros ÃƒÂ­mpares
     * 5) FunÃƒÂ§ÃƒÂ£o para verificar ocorrÃƒÂªncia de um determinado nÃƒÂºmero
     * 6) FunÃƒÂ§ÃƒÂ£o para obter um nÃƒÂºmero
     * 7) FunÃ§Ã£o para verificar o nÃºmero de ocorrÃªncias no vetor
     */

}
