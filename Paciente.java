package Time4Pill;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Usuario {
	 private List<Medicamento> medicamentos;
	    private List<Recordatorio> recordatorios;
	    private Calendario calendario;

	    public Paciente( String id,String nombre, String email, String contrasena,String tipoUsuario) {
	        super(id, nombre,  email,  contrasena, tipoUsuario);
	        medicamentos = new ArrayList<>();
	        recordatorios = new ArrayList<>();
	        calendario = new Calendario();
	    
	    }

	    public void confirmarToma() {
	        System.out.println(getNombre() + " ha confirmado la toma.");
	    }

	    public void recibirAlarma() {
	        System.out.println("Alarma recibida por " + getNombre());
	    }

	    public void notificarAlarma() {
	        System.out.println("Alarma notificada al cuidador desde " + getNombre());
	    }

	    public void compararDosis(Usuario receptor) {
	        System.out.println(getNombre() + " compara dosis con " + receptor.getNombre());
	    }

	    public Calendario getCalendario() {
	        return calendario;
	    }

	    public void agregarRecordatorio(Recordatorio r) {
	        recordatorios.add(r);
	    }

	    public void agregarMedicamento(Medicamento m) {
	        medicamentos.add(m);
	    }

	   
}
