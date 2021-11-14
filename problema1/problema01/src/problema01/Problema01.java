/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    double valorTotal;
    double costoHora;
    double kilovatiosConsumidos;        
    int edad;
    double descuento;
    double porcentaje;
    porcentaje = 10;
    
    System.out.println("Ingrese el costo de un kilovatio por hora");
    costoHora = entrada.nextDouble();
    System.out.println("Ingrese el valor de los kilovatios consumidos");
    kilovatiosConsumidos = entrada.nextDouble();
    System.out.println("Ingrese el valor de la edad");
    edad = entrada.nextInt();
    
    
    valorTotal = costoHora * kilovatiosConsumidos;
    if (edad > 65);
           descuento = (valorTotal * porcentaje)/100; 
           valorTotal = valorTotal - descuento;
    System.out.println("valorTotal es:" + valorTotal);
    }
    
}

