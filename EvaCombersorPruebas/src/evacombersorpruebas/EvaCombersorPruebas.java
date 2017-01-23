/*
*1.Leer CANTIDAD y tipo de moneda, convertir a diferentes
Controlar que los datos sean correctos 
Moneda-->"EUROS" || "LIBRAS" || "DOLARES"
MOSTRAR cantidad xx "## Euros son ## dolares ## libras"
Convertir
Montar la cadena "## Euros son ## dolares ## libras"
2.Leer "NOMBRE"  Y "APELLIDO" mostrar mayusculas
 */
package evacombersorpruebas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class EvaCombersorPruebas {

    /**
     * @param args the command line arguments
     */
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        int cantidad;
        String euro="euro";
        cantidad=Integer.parseInt(leerTeclado("Dime la cantidad a cambiar"));
        String tipoMoneda=leerTeclado("Dime la moneda tipo de moneda");
        if(tipoMoneda.compareTo("euro")== 0){
        }
    }//fin main
    
    //leer Teclado
    public static String leerTeclado(String texto){
        String cadena =null;
        System.out.println(texto);
        try {
            cadena=bufer.readLine();
        } catch (NumberFormatException ex) {
            System.out.println("Error");
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return cadena;
    }
}// fin class
