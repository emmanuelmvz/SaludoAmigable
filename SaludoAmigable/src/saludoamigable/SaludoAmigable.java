package saludoamigable;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner
 * Este programa despliega un saludo Hola personalizado.
 *
 */

public class SaludoAmigable {
Scanner stdIn = new Scanner(System.in);
String nombre="Emmanuel";
public void saludo(){
     // System.out.print("Introduce tu nombre: ");
      //  nombre = nombre();
        System.out.println("¡Hola " + nombre + "!");

    
}
    public static void main(String[] args) {
        SaludoAmigable Hola = new SaludoAmigable ();
        Hola.saludo();
        
      
    }

}
