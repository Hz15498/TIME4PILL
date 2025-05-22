import java.time.LocalTime;

public class Recordatorio {
	private String id;
    private LocalTime hora;
    private String mensaje;
    private String nivelAlerta;

    public Recordatorio(String id, LocalTime hora, String mensaje, String nivelAlerta) {
        this.id = id;
        this.hora = hora;
        this.mensaje = mensaje;
        this.nivelAlerta = nivelAlerta;
    }

    public void enviarNotificacion() {
        System.out.println("Notificación: " + mensaje + " a las " + hora);
    }
}
