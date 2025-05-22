package Time4Pill;
import java.util.ArrayList;
import java.util.List;

public class Cuidador extends Usuario {
    private List<Paciente> pacientesACargo;
    
    public Cuidador(String id, String nombre, String email, String contrasena,String tipoUsuario) {
        super(id,nombre, email,contrasena, tipoUsuario);
        this.pacientesACargo = new ArrayList<>();
    }
    
    public void agregarPaciente(Paciente paciente) {
        pacientesACargo.add(paciente);
    }
    
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para cuidador " + getNombre() + ": " + mensaje);
    }
    
    public void verificarTomasPacientes() {
        System.out.println("Verificando tomas de pacientes a cargo...");
        for (Paciente paciente : pacientesACargo) {
            System.out.println("Revisando tomas de " + paciente.getNombre());
        }
    }
}
