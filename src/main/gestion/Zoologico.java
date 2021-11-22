package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	 private String nombre;
	 private String ubicacion;
	 private ArrayList<Zona> zonas = new ArrayList<Zona>();
	 
	 public Zoologico (String nombre, String ubicacion) {
		 this.nombre = nombre;
		 this.ubicacion = ubicacion;
	 }
	 
	 public void agregarZonas (Zona zona) {
		 zonas.add(zona);
	 }
	 
	 public int cantidadTotalAnimales () {
		 int cantidad = 0;
		 for (int i = 0; i < this.zonas.size(); i++) {
			 cantidad += this.zonas.get(i).animales.size();
		 }
		 return cantidad;
	
	 }
	 
	public Zoologico () {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	 
	 
}
