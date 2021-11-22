package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	//preguntar al respecto (protected)
	protected ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona (String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona () {}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void agregarAnimales (Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
