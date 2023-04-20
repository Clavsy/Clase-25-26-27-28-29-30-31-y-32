/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayService;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author clavs
 */
public class ArrayService {

    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < 50; i++) {
            arreglo[i] = Math.random() * 10 + 1;
        }
    }

    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        double[] aux = new double[50];
        int contador = 49;
        System.arraycopy(arreglo, 0, aux, 0, arreglo.length);
        for (int i = 0; i < 50; i++) {
            arreglo[contador] = aux[i];
            contador--;
        }
    }
    
    public void inicializarB(double[] arreglo1, double[] arreglo2){
        System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
        Arrays.fill(arreglo2, 10, 20, 0.5);
    }
}
