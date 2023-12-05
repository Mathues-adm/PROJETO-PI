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
public class Ado1Fernando5 {
    
public static void main(String args[]) {

    int A;
    do {
        Scanner tab = new Scanner(System.in);
        System.out.println("Informar um número:");

        A = tab.nextInt();      
            int mult = 0;
            while (mult < 10) {
                mult++;
                System.out.println(A + " * " + mult + "  = " + (A * mult));
            }
        
    } while ((A >= 2)&&(A<=1000));

} 
}
