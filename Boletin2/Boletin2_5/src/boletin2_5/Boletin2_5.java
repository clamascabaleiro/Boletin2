/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import java.util.Scanner;
/**
 *
 * @author clamascabaleiro
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double soldo, soldoBruto, soldoLiquido, km, dias, vendas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el sueldo fijo:");
        soldo = teclado.nextDouble();
        System.out.println("Introduzca el quilometraje:");
        km = teclado.nextDouble();
        System.out.println("Introduzca el número de días de desplazamiento:");
        dias = teclado.nextDouble();
        System.out.println("Introduzca el importe de ventas:");
        vendas = teclado.nextDouble();
        soldoBruto = soldo + (km * 2) + (dias * 30) + (vendas * 5 / 100);
        soldoLiquido = soldoBruto - (soldoBruto * 18 / 100) - 36;
        System.out.println("El sueldo bruto sera de " + soldoBruto + "€");
        System.out.println("El sueldo líquido será de " + soldoLiquido + "€");
    }
    
}
