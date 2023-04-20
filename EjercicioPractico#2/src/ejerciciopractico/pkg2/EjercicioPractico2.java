/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg2;

import Services.ParDeNumerosService;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService num = new ParDeNumerosService();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("Que desea realizar?");
            System.out.println(" 1- Mostrar valores.");
            System.out.println(" 2- Mostrar valor mayor.");
            System.out.println(" 3- Calcular potencia.");
            System.out.println(" 4- Calcular raiz.");
            System.out.println(" 5- Salir.");
            int eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    num.mostrarValores();
                    break;
                case 2:
                    System.out.println("El valor mayor es: " + num.devolverMayor());
                    break;
                case 3:
                    num.calcularPotencia();
                    break;
                case 4:
                    num.calcularRaiz();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Valor ingresado invalido.");

            }
        } while (!salir);
    }

}
