package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez () {
		listado.add(this);
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setCantidadAleas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	
	public String movimiento () {
		return "nadar";
	}
	
	public static int cantidadPeces () {
		return listado.size();
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		return bacalao;
	}
}