/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner ler = new Scanner(System.in);
      //Introduce cantidad de dinero
      System.out.println("introduce la cantidad total de dinero: ");
      int dineroTotal = ler.nextInt();
      int billetes100 = dineroTotal/100, resto1 = dineroTotal%100; //Cogemos el módulo del dinero total y cogemos el resto
      int billetes20 = resto1/20, resto2 = resto1%20; //Dividimos el resto entre 20 y realizamos el modulo
      int billetes5 = resto2/5, resto3 = resto2%5; //Dividimos el resto entre 5 y realizamos el modulo
      System.out.println("Tenemos " + billetes100 + " billetes de 100€, " + billetes20 + " billetes de 20€, " + billetes5 + " billetes de 5€ y " + resto3 + " monedas de 1€");
        
    }
    
}
