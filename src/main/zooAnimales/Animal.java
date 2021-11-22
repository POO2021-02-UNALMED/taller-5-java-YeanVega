package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	private Zona zona;
	
	public Animal (String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal () {
		totalAnimales++;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setHabitat (String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return this.habitat;
	}
	
	public void setGenero (String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return this.zona;
	}
	
	public static String totalPorTipo () {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + 
				Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		if (this.zona == null) {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
		}else{
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " +
					this.genero + ", la zona en la que me ubico es " + this.zona + ", en el " + this.zona.getNombre(); //.getZoo()
		}
	}
	
	public String movimiento () {
		return "desplazarse";
	}
}
