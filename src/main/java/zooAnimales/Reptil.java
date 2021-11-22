package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		listado.add(this);
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		return serpiente; 
	}
}