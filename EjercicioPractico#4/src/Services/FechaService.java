/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("Ingresar fecha de nacimiento:");
        System.out.println("Dia: ");
        int day = leer.nextInt();
        System.out.println("Mes: ");
        int month = leer.nextInt();
        System.out.println("Año: ");
        int year = leer.nextInt();
        Date fecha = new Date(year - 1900, month - 1, day);
        return fecha;
    }
    
    public Date fechaActual(){
        Date fecha = new Date();
        return fecha;
    }
    
    public int diferencia(Date fechaNac, Date fechaAct){
        return fechaAct.getYear() - fechaNac.getYear();
    }
}
