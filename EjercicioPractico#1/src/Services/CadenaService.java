/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Objects.Cadena;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in);
    Cadena frase = new Cadena();

    public void crearFrase(){
        System.out.println("Ingrese la frase original:");
        frase.setFrase(leer.nextLine());
        frase.setLongitud(frase.getFrase().length());
    }
    
    public void mostrarVocales() {
        frase.setLongitud(frase.getFrase().length());
        int vocales = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if ("a".equalsIgnoreCase(frase.getFrase().substring(i, i + 1)) || ("e".equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) || "i".equalsIgnoreCase(frase.getFrase().substring(i, i + 1)) || ("o".equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) || ("u".equalsIgnoreCase(frase.getFrase().substring(i, i + 1)))) {
                vocales++;
            }
        }
        System.out.println("La frase tiene " + vocales + " vocales.");
        frase.setLongitud(frase.getFrase().length());
    }

    public void invertirFrase() {
        frase.setLongitud(frase.getFrase().length());
        String inversion = "";
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            inversion += frase.getFrase().substring(i, i + 1);
        }
        System.out.println(inversion);
        System.out.println(frase.getFrase());
        frase.setLongitud(frase.getFrase().length());
    }

    public void vecesRepetido() {
        frase.setLongitud(frase.getFrase().length());
        System.out.println("Ingrese un caracter a contabilizar en la frase:");
        String caracter = leer.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (caracter.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " esta " + contador + " veces en la frase.");
        frase.setLongitud(frase.getFrase().length());
    }

    public void compararLongitud() {
        frase.setLongitud(frase.getFrase().length());
        System.out.println("Ingrese una frase para comparar su longitud con la frase original:");
        String frase1 = leer.nextLine();
        if (frase.getLongitud() == frase1.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        }
        if (frase.getLongitud() > frase1.length()) {
            System.out.println("Las frase original tiene " + (frase.getLongitud() - frase1.length()) + " mas caracteres que la ingresada.");
        }
        if (frase.getLongitud() < frase1.length()) {
            System.out.println("Las frase ingresada tiene " + (frase1.length() - frase.getLongitud()) + " mas caracteres que la original.");
        }
        frase.setLongitud(frase.getFrase().length());
    }

    public void unirFrases() {
        frase.setLongitud(frase.getFrase().length());
        System.out.println("Ingrese una frase para unir a la frase original:");
        String frase1 = leer.nextLine();
        String frasesUnidas = frase.getFrase() + frase1;
        frase.setFrase(frasesUnidas);
        System.out.println("Frase resultante: " + frase.getFrase());
        frase.setLongitud(frase.getFrase().length());
    }

    public void remplazar() {
        frase.setLongitud(frase.getFrase().length());
        System.out.println("Ingrese un caracter para remplazar las letras -= a =- de la frase original:");
        String caracter = leer.nextLine();
        String frase1;
        frase1 = frase.getFrase();
        frase.setFrase(frase1.replace("a", caracter));
        frase.setLongitud(frase.getFrase().length());
    }
    public boolean contiene(){
        frase.setLongitud(frase.getFrase().length());
        System.out.println("Ingrese un caracter para comprobar si esta dentro de la frase original:");
        String caracter = leer.nextLine();
        boolean check = false;
        for (int i = 0; i < frase.getLongitud(); i++) {
            check = frase.getFrase().substring(i, i+1).equalsIgnoreCase(caracter);
        }
        frase.setLongitud(frase.getFrase().length());
        return check;
    }
}
