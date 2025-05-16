package Time4Pill;

import java.util.ArrayList;
import java.util.List;

class Paciente extends Usuario {
	    private List<Medicamento> medicamentos;
	    private List<Recordatorio> recordatorios;
	    private Calendario calendario;

	    public Paciente( String nombreUsuario, String email, String contraseña,String tipoUsuario) {
	        super(nombreUsuario,contraseña,email, tipoUsuario);
	        medicamentos = new ArrayList<>();
	        recordatorios = new ArrayList<>();
	        calendario = new Calendario();
	    
	    }

	    public void confirmarToma() {
	        System.out.println(nombreUsuario + " ha confirmado la toma.");
	    }

	    public void recibirAlarma() {
	        System.out.println("Alarma recibida por " + nombreUsuario);
	    }

	    public void notificarAlarma() {
	        System.out.println("Alarma notificada al cuidador desde " + nombreUsuario);
	    }

	    public void compararDosis(Usuario receptor) {
	        System.out.println(nombreUsuario + " compara dosis con " + receptor.nombreUsuario);
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

