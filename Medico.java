package Time4Pill;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Usuario {
    private String especialidad;
    private String numeroLicencia;
    private List<Pacientes> pacientes;

    public Medico(String nombreUsuario, String email, String contrasena, 
                 String especialidad, String numeroLicencia,String tipoUsuario) {
        super(nombreUsuario, contrasena, email, tipoUsuario);
        this.especialidad = especialidad;
        this.numeroLicencia = numeroLicencia;
        this.pacientes = new ArrayList<>();
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public List<Pacientes> getPacientes() {
        return pacientes;
    }

    
    public void agregarPaciente(Pacientes paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente " + paciente.getNombreUsuario() + " agregado al médico " + this.nombreUsuario);
    }

    public void prescribirMedicamento(Pacientes paciente, Medicamento medicamento, String instrucciones) {
        paciente.agregarMedicamento(medicamento);
        System.out.println("Medicamento " + medicamento.nombre + " prescrito a " + 
                          paciente.getNombreUsuario() + " con instrucciones: " + instrucciones);
    }

    public void verHistorialPaciente(Pacientes paciente) {
        System.out.println("\nHistorial médico de " + paciente.getNombreUsuario());
        System.out.println("Medicamentos:");
        
    }
}
