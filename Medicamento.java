import java.sql.Date;

public class Medicamento {
	protected String id;
	protected String nombre;
	
	public Medicamento(String id, String nombre) {
	        this.id = id;
	        this.nombre = nombre;
	    }

	    public void notificarReposicion() {
	        System.out.println("Reposición de medicamento " + nombre + " requerida.");
	    }
	}

