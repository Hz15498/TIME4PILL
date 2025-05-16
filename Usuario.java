package Time4Pill;

import java.io.Serializable;

abstract class Usuario implements Serializable {
	
		
		protected String nombreUsuario;
	    private String contrasena;
	    private String email;
	    private String tipoUsuario;
	    public Usuario(String nombreUsuario, String contrasena, String email,String tipoUsuario) {
	        this.nombreUsuario = nombreUsuario;
	        this.contrasena = contrasena;
	        this.email = email;
	        this.tipoUsuario=tipoUsuario;
	    }
	    
	    // Getters y Setters
	    public String getNombreUsuario() {
	        return nombreUsuario;
	    }
	    
	    public void setnombreUsuario(String nombreUsuario) {
	        this.nombreUsuario= nombreUsuario;
	    }
	    
	    public String getContrasena() {
	        return contrasena;
	    }
	    
	    public void setContrasena(String contrasena) {
	        this.contrasena = contrasena;
	    }
	    
	    public String getEmail() {
	        return email;
	    }
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public String getTipoUsuario() {
	        return tipoUsuario;
	    }
	    
	    @Override
	    public String toString() {
	        return "Usuario\n Nombre de usuario=" + nombreUsuario + "\n email=" + email + "Tipo de usuario: "+tipoUsuario+"]";
	    }
	    
	}


