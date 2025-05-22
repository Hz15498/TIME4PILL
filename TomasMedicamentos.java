package Time4Pill;
import java.sql.Date;

public class TomasMedicamentos {
	 private Medicamento medicamento;

	    public TomasMedicamentos(Medicamento medicamento, Date fechaHora, String descripcion) {
	        this.medicamento = medicamento;
	        super(fechaHora,descripcion);
	    }
}
