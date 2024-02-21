//Joseph Quintero

//Instruccion: Elabora un programa en Java que genere dos números aleatorios 
//e imprima un mensaje en la consola determinando cuál numero es el mayor.
package Backend;

//import java.util.Random;
public class RandomNumbers {

    public static void main(String[] args) {
        int numero1 = generarNumeroAleatorio(1, 100);
        int numero2 = generarNumeroAleatorio(1, 100);
        
        mostrarNumeros(numero1, numero2);
        compararNumeros(numero1, numero2);
    }
    
    static int generarNumeroAleatorio(int min, int max) {//Generamos numeros Aleatorios
        return (int) (Math.random() * (max - min + 1) + min);
    }

    static void mostrarNumeros(int numero1, int numero2) {//Mostramos numeros aleatorios
        System.out.println("Primer numero generado: " + numero1);
        System.out.println("Segundo numero generado: " + numero2);
    }

    static void compararNumeros(int numero1, int numero2) {//Comparamos numeros aleatorios
        if (numero1 < numero2) {
            System.out.println("\n" + numero2 + " es mayor que " + numero1);
        } else if (numero1 > numero2) {
            System.out.println("\n" + numero1 + " es mayor que " + numero2);
        } else {
            System.out.println("\nAmbos numeros son iguales!");
        }
    }
}
