/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    double gradosCentigrados;
    double gradosFarenheit;
    double gradosKelvin;
    
    System.out.println("Ingresar los grados centigrados");
    gradosCentigrados = entrada.nextDouble();
    
    if (gradosCentigrados <= 100);
    gradosFarenheit = 9/5 * gradosCentigrados + 32;
    gradosKelvin = gradosCentigrados + 273.15;
    
    System.out.println("El total de los grados de Farenheit son:" + 
            gradosFarenheit);
    System.out.println("El total de los grados Kelvin son:" + gradosKelvin);
    }
    
}
