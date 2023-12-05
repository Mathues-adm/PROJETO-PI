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
public class NewClass1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Criar o vetor A com 8 elementos inteiros
        int[] VetA = new int[8];

        // Criar o vetor B com o mesmo tamanho que A
        int[] VetB = new int[VetA.length];

        // Preencher o vetor B com os elementos de A multiplicados por 2
        for (int i = 0; i < VetA.length; i++)
        {   System.out.println("Digite o valor da posição: " + i);
            VetA[i] = input.nextInt();
            VetB[i] = VetA[i] * 2;
        }

        // Imprimir os vetores A e B
        System.out.println("Vetor A:");
        imprimirVetor(VetA);

        System.out.println("\nVetor B (elementos de A multiplicados por 2):");
        imprimirVetor(VetB);
    }

    // Método para imprimir um vetor
    private static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
    

    
    

