package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave () {
		listado.add(this);
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	
	public String movimiento () {
		return "volar";
	}
	
	public static int cantidadAves () {
		return listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		return aguila;
	}
}