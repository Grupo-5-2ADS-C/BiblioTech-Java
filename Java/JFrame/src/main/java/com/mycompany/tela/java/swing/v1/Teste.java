package com.mycompany.tela.java.swing.v1;

/**
 *
 * @author viniciuspereira
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Services d = new Services();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%.2f", d.getFreqDisco()));
        }
    }
    
}
