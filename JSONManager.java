package Time4Pill;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class JSONManager {

    /**
     * Carga un archivo JSON con una lista de objetos Usuario.
     * @param ruta La ruta al fichero, p.ej. "recursos/usuario.json"
     * @return Lista de instancias de Usuario (Paciente, Medico, Cuidador...)
     */
    public static List<Usuario> cargarUsuarios(String ruta) {
        List<Usuario> usuarios = new ArrayList<>();
        try (Reader reader = new FileReader(ruta)) {
            JsonArray arr = JsonParser.parseReader(reader).getAsJsonArray();
            for (JsonElement elem : arr) {
                JsonObject o = elem.getAsJsonObject();
                String type       = o.get("type").getAsString();
                String id         = o.get("id").getAsString();
                String nombre     = o.get("nombre").getAsString();
                String email      = o.get("email").getAsString();
                String contrasena = o.get("contrasena").getAsString();

                switch (type) {
                    case "Paciente":
                        usuarios.add(new Paciente(id, nombre, email, contrasena));
                        break;
                    case "Medico":
                        usuarios.add(new Medico(id, nombre, email, contrasena));
                        break;
                    case "Cuidador":
                        usuarios.add(new Cuidador(id, nombre, email, contrasena));
                        break;
                    default:
                        System.err.println("Tipo desconocido en JSON: " + type);
                }
            }
        } catch (Exception e) {
            System.err.println("Error leyendo JSON en " + ruta + ": " + e.getMessage());
        }
        return usuarios;
    }
}


