package main.java.ieseuropa;

import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
	
	private ArrayList<Contacto> contactos;
	private int tamanoMax;
	
	public Agenda(int tamanoMax) {
		this.contactos = new ArrayList<>();
		this.tamanoMax = tamanoMax;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public int getTamanoMax() {
		return tamanoMax;
	}

	public void setTamanoMax(int tamanoMax) {
		this.tamanoMax = tamanoMax;
	}

	public void anadirContacto(Contacto contacto) {
		if(!agendaLlena())
			contactos.add(contacto);
	}
	
	public void eliminarContacto(Contacto contacto) {
		contactos.remove(contacto);
	}
	
	public void ordenarContactosAlfb() {
		Collections.sort(contactos);
	}
	
	public Contacto buscarContactoNombre(String nombre) {
		if(exixteContacto(new Contacto(nombre)))
			return contactos.get(contactos.indexOf(new Contacto(nombre,"")));
		else
			return null;
	}
	
	public Contacto buscarContactoNumero(String numero) {
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getNumero().equals(numero))
				return contactos.get(i);
		}
		return null;
	}
	
	public String nombreMasLargo() {
		String nombreMasLargo = "";
		for(Contacto contacto: contactos) {
			if(contacto.getNombre().length() > nombreMasLargo.length())
				nombreMasLargo = contacto.getNombre();
		}
		return nombreMasLargo;
	}
	
	public boolean agendaLlena() {
		if(contactos.size() < tamanoMax)
			return false;
		else
			return true;
	}
	
	public boolean exixteContacto(Contacto contacto) {
		if(contactos.contains(contacto))
			return true;
		else
			return false;
	}
	
	public int huecos() {
		return tamanoMax - contactos.size();
	}

	@Override
	public String toString() {
		return "Agenda [contactos=" + contactos + ", tamanoMax=" + tamanoMax + "]";
	}

}
