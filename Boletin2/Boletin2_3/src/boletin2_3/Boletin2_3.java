/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;
import java.util.Scanner;
/**
 *
 * @author clamascabaleiro
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner ler = new Scanner (System.in);
      //Pedimos cantidad Billetes y monedas
        int cCien = 0, cVeinte = 0, cCinco = 0, cUno = 0, cantidadTotal = 0, bCien= 0, bVeinte = 0, bCinco = 0, mUno = 0;
        
        System.out.println("Introduzca la cantidad de billetes de 100");
        cCien = ler.nextInt();
         System.out.println("Introduzca la cantidad de billetes de 20");
        cVeinte = ler.nextInt();
         System.out.println("Introduzca la cantidad de billetes de 5");
        cCinco = ler.nextInt();
         System.out.println("Introduzca la cantidad de monedas de 1");
        cUno = ler.nextInt();
        //Calculamos billetes 100
        bCien = cCien * 100;
        bVeinte = cVeinte * 20;
        bCinco = cCinco * 5;
        mUno = cUno;
        //Sumamos la cantidad y visualizamos
        cantidadTotal = bCien + bVeinte + bCinco + mUno;
        System.out.println("La cantidad total es : " + cantidadTotal + "€");
        
        
        
        
        
       
    }
    
}
