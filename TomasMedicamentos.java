import java.sql.Date;

public class TomasMedicamentos extends Tomas {
	    private Medicamento medicamento;

	    public TomasMedicamentos(Medicamento medicamento, Date fechaHora, String descripcion) {
	        this.medicamento = medicamento;
	        this.fechaHora = fechaHora;
	        this.descripcion = descripcion;
	    }
}
