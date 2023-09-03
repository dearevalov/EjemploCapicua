/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.etitc.Programacion1.Recursibidad.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class ClaseConMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido al Programa");
        int base,  exponente;
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de base"));
        exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Exponente"));
        System.out.println("\n Resultado es : "+Potencia(base, exponente));
            
        
        
    }
    public static double Potencia(int base, int exponente){
        if(exponente==0)return 1;
        return base*Potencia(base,exponente-1);
}


}