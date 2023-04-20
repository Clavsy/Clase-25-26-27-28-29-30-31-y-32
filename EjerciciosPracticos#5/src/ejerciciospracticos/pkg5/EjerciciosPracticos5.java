/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos.pkg5;

import Obejcts.Persona;
import Services.PersonaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjerciciosPracticos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService persona = new PersonaService();
        
        Persona per1 = persona.crearPersona();
        
        persona.calcularEdad(per1);
        
        System.out.println("Ingresar fecha de nacimiento a comparar:");
        System.out.println("Dia:");
        int day = leer.nextInt();
        System.out.println("Mes:");
        int month = leer.nextInt();
        System.out.println("Año:");
        int year = leer.nextInt();
        Date fecha = new Date(year - 1900, month - 1, day);
        
        System.out.println("Es " + per1.getNombre() + " mayor que la fecha de nacimiento ingresada? = " + persona.menorQue(per1, fecha));
        
        persona.mostrarPersona(per1);
    }
    
}
