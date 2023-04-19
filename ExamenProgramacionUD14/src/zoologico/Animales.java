package zoologico;

public class Animales {
	protected String nombre;
	protected String genero;
	protected String especie;
	protected int edad;
	protected EmpleadoZoo cuidador;
	protected Habitat habitat;
	public Animales(String nombre, String genero, String especie, int edad, EmpleadoZoo cuidador, Habitat habitat) {
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.cuidador=cuidador;
		this.habitat=habitat;
	}
	public String getNombre() {
		return nombre;
	}
	public String getGenero() {
		return genero;
	}
	public String getEspecie() {
		return especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
