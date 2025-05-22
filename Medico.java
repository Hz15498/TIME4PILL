import java.util.List;

public class Medico extends Usuario {
	   private static final String String = null;
	   private String especialidad;
	   private String numeroLicencia;
	   private List<Paciente> pacientes;

	   public Medico(String id, String nombre, String email, String contrasena,String tipoUsuario,String especialidad, String numeroLicencia) {
	        super( id,  nombre,  email,  contrasena, tipoUsuario);
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
	    public List<Paciente> getPacientes() {
	        return pacientes;
	    }

	    
	    public void agregarPaciente(Paciente paciente) {
	        pacientes.add(paciente);
	        System.out.println("Paciente " + paciente.getNombre() + " agregado al médico ");
	    }

	    public void prescribirMedicamento(Paciente paciente, Medicamento medicamento, String instrucciones) {
	        paciente.agregarMedicamento(medicamento);
	        System.out.println("Medicamento " + medicamento.nombre + " prescrito a " + 
	                          paciente.getNombre() + " con instrucciones: " + instrucciones);
	    }

	    public void verHistorialPaciente(Paciente paciente) {
	        System.out.println("\nHistorial médico de " + paciente.getNombre());
	        System.out.println("Medicamentos:");
	    }
}
