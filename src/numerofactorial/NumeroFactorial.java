/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerofactorial;

/**
 *
 * @author lalej
 */

import javax.swing.*;
public class NumeroFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        int valor = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor que desea aplicar su factorial"));
        
        for(int i = 0;i < numero - 1; i++){
            for(int j = 0; j < numero - 1; j++){

                valor += (j * numero);

            }
        }
        
        System.out.println("El factorial de "+numero+" es: "+valor);

    }
    
}
