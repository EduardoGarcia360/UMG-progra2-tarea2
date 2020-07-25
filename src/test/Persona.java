package test;

public class Persona {
	//propiedades
	private String nit, nombre, direccion, telefono, email;
	
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
	public void verDatos() {
		System.out.println("---*** Datos de la persona ***---");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Nit: " + this.nit);
		System.out.println("Direccion: " + this.direccion);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("Email: " + this.email);
	}
}
