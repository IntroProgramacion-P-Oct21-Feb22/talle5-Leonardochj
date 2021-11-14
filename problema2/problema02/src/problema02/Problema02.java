/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    double cantidadPedida;
    double precioUnitario;
    double porcentaje;
    double descuento;
    double costoTotal;
    double descripcionArticulo;
    porcentaje = 15;
    
    System.out.println("Ingrese la descripcion del articulo");
    descripcionArticulo = entrada.nextDouble();
    System.out.println("Ingrese la cantidad pedida");
    cantidadPedida = entrada.nextDouble();
    System.out.println("Ingrese el precio unitario");
    precioUnitario = entrada.nextDouble();
    
    costoTotal = cantidadPedida * precioUnitario;
    if(cantidadPedida > 50);
    descuento = (costoTotal * porcentaje)/100;
    costoTotal = costoTotal - descuento;
    
    System.out.println("El costoTotal es:" + costoTotal + descripcionArticulo);
    }
    
}
