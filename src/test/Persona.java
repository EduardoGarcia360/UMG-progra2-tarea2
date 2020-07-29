package test;

public class Persona {
	//propiedades
	private String nit, nombre, direccion, telefono, email;
	
	
	public Persona(String nit, String nombre, String direccion, String telefono, String email) {
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	//Getters
	public String getNit() {
		return nit;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	//Setters
	public void setNit(String nit) {
		this.nit = nit;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//metodos
	public String verDatos() {
		return this.nombre+"-"+this.nit+"-"+this.direccion+"-"+this.telefono+"-"+this.email;
	}
}
