package Time4Pill;

import java.util.ArrayList;
import java.util.List;

public class Cuidador extends Usuario {
    private List<Pacientes> pacientesACargo;
    
    public Cuidador(String nombreUsuario, String email, String contrasena,String tipoUsuario) {
        super(nombreUsuario, contrasena, email,tipoUsuario);
        this.pacientesACargo = new ArrayList<>();
    }
    
    public void agregarPaciente(Pacientes paciente) {
        pacientesACargo.add(paciente);
    }
    
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para cuidador " + nombreUsuario + ": " + mensaje);
    }
    
    public void verificarTomasPacientes() {
        System.out.println("Verificando tomas de pacientes a cargo...");
        for (Pacientes paciente : pacientesACargo) {
            System.out.println("Revisando tomas de " + paciente.getNombreUsuario());
        }
    }
}
