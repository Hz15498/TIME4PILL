package Time4Pill;
import java.util.Scanner;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		
        List<Usuario> usuarios = JSONManager.cargarUsuarios("recursos//usuario.json");
        Scanner scanner = new Scanner(System.in);

        if (usuarios == null) {
            System.out.println("No se pudo cargar la base de usuarios. Revisa el archivo JSON.");
            scanner.close();
            return;
        }

		System.out.println("********************************");
		System.out.println("*          Time4Pill           *");
		System.out.println("********************************\n");

		// Descripción
		System.out.println("Bienvenido a Time4Pill, ");
		System.out.println("la forma más fácil de gestionar tu medicación diaria.\n");

		// Opciones
		System.out.println("Elige una opción:");
        System.out.println("  1) Iniciar sesión");
        System.out.println("  2) Registrarse");
        System.out.println("  4) Más Información\n");

        System.out.println("Introduce el número de la opción y pulsa Enter...");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion == 1) {
            System.out.println("\n>> Has seleccionado INICIAR SESIÓN");
            System.out.print("\nEmail: ");
            String email = scanner.nextLine();
            System.out.print("Contraseña: ");
            String pass  = scanner.nextLine();

            Usuario logeado = null;
            for (Usuario u : usuarios) {
                if (u.getEmail().equals(email) && u.getContrasena().equals(pass)) {
                    logeado = u;
                    break;
                }
            }

            if (logeado != null) {
                System.out.println("\n ¡Bienvenido! " 
                                    + logeado.getNombre() 
                                    + " (" 
                                    + logeado.getClass().getSimpleName() 
                                    + ")!");
                // Aquí podrías ramificar a menús Paciente/Medico/Cuidador...
            } else {
                System.out.println("\n Credenciales incorrectas.");
            }
        }
        else if (opcion == 2) {
            System.out.println("\n>> Has seleccionado REGISTRARSE");
            // aquí iría la lógica de registro...
        }
       
        else if (opcion == 3) {
            System.out.println("\n>> Mostrando MÁS INFORMACIÓN...");
        }
        else {
            System.out.println("\n¡Opción no válida! Reinicia el programa y elige del 1 al 3.");
        }
        scanner.close();
    }
}       
