/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Objects.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class ParDeNumerosService {

    ParDeNumeros num = new ParDeNumeros();
    Scanner leer = new Scanner(System.in);

    public void mostrarValores() {
        System.out.println("Numero #1: " + num.getNum1());
        System.out.println("Numero #2: " + num.getNum2());
    }

    public double devolverMayor(){
        return Math.max(num.getNum1(), num.getNum2());
    }
    
    public void calcularPotencia(){
        int numMax = (int) Math.max(num.getNum1(), num.getNum2());
        int numMin = (int) Math.min(num.getNum1(), num.getNum2());
        System.out.println("La potencia de " + numMax + " por " + numMin + " = " + (Math.pow(numMax, numMin)));
    }
    
    public void calcularRaiz(){
        int numMin = (int) Math.min(num.getNum1(), num.getNum2());
        System.out.println("La raiz cuadrada de " + numMin + " = " + (Math.sqrt(numMin)));
    }
}
