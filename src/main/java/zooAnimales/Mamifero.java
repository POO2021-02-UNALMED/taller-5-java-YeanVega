package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero () {
		listado.add(this);
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public boolean isPelaje() {
		return this.pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public static int cantidadMamiferos () {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		return leon;
	}
}
