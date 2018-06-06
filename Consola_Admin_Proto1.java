
package consola_admin_proto1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author jenamorado
 */
public class Consola_Admin_Proto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //crear un objeto Scanner
        Scanner sc = new Scanner(System.in); 
        //Crea un objeto para meses
        String months[] = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sept", 
         "Oct", "Nov", "Dec"};
        
        GregorianCalendar gcalendar = new GregorianCalendar();
         
           String nombre;
           String clavesecreta;
        
           System.out.println("Bienvenido al Programa Nacional de Sistematizacion de Procedimientos en Hospitales");
           System.out.println("Bienvenido a la Consola de Administración”");
            
           System.out.print("Ingrese su Usuario: ");       
           nombre = sc.nextLine();  //leer un String
           System.out.println("Hola " + nombre + "!!!");
            
            System.out.print("Ingrese la clave secreta: "); 
            clavesecreta = sc.nextLine(); 
            
            String auth = "AguanteJava";
            
            if(auth.equals(clavesecreta)){
                System.out.print("Ingreso correctamente  "); 
                // Muestra la hora y fecha
                System.out.print("Fecha: ");
                System.out.print(months[gcalendar.get(Calendar.MONTH)]);
                System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
                System.out.print("Hora: ");   
                System.out.print(gcalendar.get(Calendar.HOUR) + ":");
                System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
                System.out.println(gcalendar.get(Calendar.SECOND));
            }else{
                System.err.println("Se ha negado el acceso");
            }
        
    }
    
}
