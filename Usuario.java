package Time4Pill;

public abstract class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String contrasena;
    private String tipoUsuario;

    public Usuario(String id, String nombre, String email, String contrasena,String tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.tipoUsuario=tipoUsuario;
    }

    public String getId(){ 
    	return id; 
    }
    public String getNombre(){ 
    	return nombre; 
    }
    public String getEmail(){ 
    	return email; 
    }
    public String getContrasena(){ 
    	return contrasena; }
    
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
   
    public String toString() {
        return "Usuario\n Nombre de usuario=" + nombre + "\n email=" + email + "Tipo de usuario: "+tipoUsuario+"]";
    }
    
}
