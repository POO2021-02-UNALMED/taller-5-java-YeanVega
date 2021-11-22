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
	 
	 public Zoologico () {}
	 
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	 public String getNombre() {
		 return this.nombre;
	 }
	 
	 public void setUbicacion(String ubicacion) {
		 this.ubicacion = ubicacion;
	 }
	 
	 public String getUbicacion() {
		 return this.ubicacion;
	 }
	 
	 public ArrayList<Zona> getZona() {
		 return this.zonas;
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
}
