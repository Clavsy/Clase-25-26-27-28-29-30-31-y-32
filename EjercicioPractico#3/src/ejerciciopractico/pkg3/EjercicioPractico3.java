/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg3;

import ArrayService.ArrayService;

/**
 *
 * @author clavs
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayService vector = new ArrayService();
        
        double[] vector1 = new double[50];
        double vector2[] = new double[20];
        
        vector.inicializarA(vector1);
        vector.mostrar(vector1);
        
        vector.ordenar(vector1);
        vector.mostrar(vector1);
        
        vector.inicializarB(vector1, vector2);
        vector.mostrar(vector2);
        
    }
    
}
