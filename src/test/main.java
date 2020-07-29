/**
 * 
 */
package test;

/**
 * @author eduar
 *
 */
public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona personas[] = new Persona[5];
		
		for(int i=0; i<=personas.length-1; i++) {
			Persona persona = new Persona("nit"+i, "nombre"+i, "direccion"+i, "telefono"+i, "email"+i);
			personas[i] = persona;
		}
		
		System.out.println("Datod de las peronas:");
		for(int j=0; j<=personas.length-1; j++) {
			System.out.println(personas[j].verDatos());
		}
		
	}

}
