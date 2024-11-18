
package usuarioedad;
import java.util.Scanner;

//import java.time.LocalDate;



public class UsuarioEdad {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola Mundo");
    
        System.out.println("introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        //edad++;
        int suma = ++edad;
        System.out.println("Tu edad el año que viene es: "+ suma);
    }
    
}
