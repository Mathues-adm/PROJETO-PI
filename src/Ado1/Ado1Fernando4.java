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
public class Ado1Fernando4 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite um número");
            num = ent.nextDouble(); // usuario digita um número
            
            if(num >= 0){ 
                soma = num + soma; 
                cont++; 
            }
        } while(cont < 6); 
        
        System.out.println("A soma é " + soma); 
        System.out.println("A quantidade de números digitados foi " + cont); 
        System.out.println("A média é " + soma / cont); 
    }
}