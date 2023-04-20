/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg1;

import Services.CadenaService;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaService cadena = new CadenaService();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("Que desea realizar?");
            System.out.println(" 1- Crear una frase.");
            System.out.println(" 2- Mostrar vocales.");
            System.out.println(" 3- Invertir frase.");
            System.out.println(" 4- Saber cuantas veces se repite un caracter.");
            System.out.println(" 5- Comparar longitud con otra frase.");
            System.out.println(" 6- Unir con otra frase.");
            System.out.println(" 7- Remplazar las letras A de la frase.");
            System.out.println(" 8- Comprobar que hay un caracter en la frase.");
            System.out.println(" 9- Salir.");
            int eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    cadena.crearFrase();
                    break;
                case 2:
                    cadena.mostrarVocales();
                    break;
                case 3:
                    cadena.invertirFrase();
                    break;
                case 4:
                    cadena.vecesRepetido();
                    break;
                case 5:
                    cadena.compararLongitud();
                    break;
                case 6:
                    cadena.unirFrases();
                    break;
                case 7:
                    cadena.remplazar();
                    break;
                case 8:
                    System.out.println(cadena.contiene());
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Valor ingresado invalido.");

            }
        } while (!salir);

    }

}
