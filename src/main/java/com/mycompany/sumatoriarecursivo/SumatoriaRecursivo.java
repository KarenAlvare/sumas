package com.mycompany.sumatoriarecursivo;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class SumatoriaRecursivo {

    public static void main(String[] args) {
       
        


        Scanner input = new Scanner(System.in);

        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
        System.out.print("Ingrese el valor de y: ");
        int y = input.nextInt();
        
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
        System.out.print("Ingrese el valor de z: ");
        int z = input.nextInt();
        
        int resultado = calcularSuma(y, z);
        
        System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
        System.out.println("El resultado de la suma es: " + resultado);
        
        
    }
    
    public static int calcularSuma(int y, int z) {
        if (y > z) {
            return 0; 
        } else {
            int cuadrado = y * y;
            return cuadrado + calcularSuma(y + 1, z); 
        }
    }
}
    

