/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg6;

import Service.CursoService;

/**
 *
 * @author clavs
 */
public class EjercicioPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService curso = new CursoService();
        
        curso.crearCurso();
        curso.calcularGananciasSemana();
    }
    
}
