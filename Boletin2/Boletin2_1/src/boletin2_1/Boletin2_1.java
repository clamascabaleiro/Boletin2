/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;
import java.util.Scanner;
/**
 *
 * @author clamascabaleiro
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        float prezoTarifa = 0, prezoPagado = 0, descuento;
        System.out.println("Introduzca el precio de la tarifa");
        prezoTarifa = ler.nextFloat();
        System.out.println("Introduzca el precio pagado");
        prezoPagado = ler.nextFloat();
        descuento = (prezoTarifa - prezoPagado) / 100;
        System.out.println("El descuento fue de : " + descuento);
        
    }
    
}
