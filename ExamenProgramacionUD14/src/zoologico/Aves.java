package zoologico;

public class Aves extends Animales{
	private double longitudPico;
	private boolean rapaces;
	public Aves(String nombre, String genero, String especie, int edad, double longitudPico, boolean rapaces, EmpleadoZoo cuidador, Habitat habitat) {
		super(nombre, genero, especie, edad, cuidador, habitat);
		this.longitudPico = longitudPico;
		this.rapaces = rapaces;
	}
	
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}


	@Override
	public String getGenero() {
		// TODO Auto-generated method stub
		return super.getGenero();
	}


	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return super.getEspecie();
	}


	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return super.getEdad();
	}


	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}


	@Override
	public void setGenero(String genero) {
		// TODO Auto-generated method stub
		super.setGenero(genero);
	}


	@Override
	public void setEspecie(String especie) {
		// TODO Auto-generated method stub
		super.setEspecie(especie);
	}


	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}


	public double getLongitudPico() {
		return longitudPico;
	}
	public boolean isRapaces() {
		return rapaces;
	}
	
	public void setLongitudPico(double longitudPico) {
		this.longitudPico = longitudPico;
	}
	public void setRapaces(boolean rapaces) {
		this.rapaces = rapaces;
	}


	@Override
	public String toString() {
		return "Aves [longitudPico=" + longitudPico + ", rapaces=" + rapaces + ", nombre=" + nombre + ", genero="
				+ genero + ", especie=" + especie + ", edad=" + edad + ", cuidador=" + cuidador + ", habitat=" + habitat
				+ "]";
	}
	
	
}
