/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Visao.JFrame2;

/**
 *
 * @author Matheus
 */
public class ModeloJFrame1 {


    public static void main(String[] args) {
        new JFrame2().setVisible(true);
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;
    
}
