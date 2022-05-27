

import java.io.Serializable;
import java.util.ArrayList;

public class Contacto implements Serializable, Comparable<Contacto>{

	protected String nombre;
	protected String apellido;
	ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	public Contacto(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public String toString() {
		String salida="";
		for(Telefono x : telefonos) {
			salida += "; "+ x.getDescripcion()+" "+x.getNumero();
		}
		return nombre + " " + apellido+salida;
	}
	
	 public int compareTo(Contacto o){
	        return nombre.compareTo(o.getNombre());
	    }
}
