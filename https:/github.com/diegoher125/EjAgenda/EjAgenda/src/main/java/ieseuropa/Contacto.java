package main.java.ieseuropa;

public class Contacto implements Comparable<Contacto>{
	
	private String nombre;
	private String numero;
	
	public Contacto(String nombre, String numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public Contacto(String nombre) {
		this.nombre = nombre;
		this.numero = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object o) {
		if(nombre == ((Contacto) o).nombre) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Contacto contacto) {
		return (contacto.getNombre().compareTo(nombre) > 0 ? -1 : 0);
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numero=" + numero + "]";
	}

}
