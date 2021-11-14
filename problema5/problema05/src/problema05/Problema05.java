/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    double valorTotal;
    double costoTelefono;
    double costoAgua;
    double litrosAguaConsumida;
    double costoLitroAgua;
    double minutosGastados;
    double costoMinuto;
    double descuento;
    double porcentaje;
    int edad;
    porcentaje = 20;
    
    System.out.println("Ingrese el numero de litros de agua consumida");
    litrosAguaConsumida = entrada.nextDouble();
    System.out.println("Ingrese el costo de cada litro de agua");
    costoLitroAgua = entrada.nextDouble();
    System.out.println("Ingrese el numero de minutos gastados");
    minutosGastados = entrada.nextDouble();
    System.out.println("Ingrese el costo de cada minuto");
    costoMinuto = entrada.nextDouble();
    System.out.println("Ingresar la edad");
    edad = entrada.nextInt();
    
    costoAgua = litrosAguaConsumida * costoLitroAgua;
    costoTelefono = minutosGastados * costoMinuto;
    valorTotal = costoTelefono * costoAgua;
    if (edad < 20);
    descuento = (valorTotal * porcentaje)/100;
    valorTotal = valorTotal - descuento;
    
    System.out.println("El valor total a pagar mensual es:" + valorTotal);
    }
    
}
