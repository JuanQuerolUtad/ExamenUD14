package zoologico;

public class Reptiles extends Animales{
	private String color;

	public Reptiles(String nombre, String genero, String especie, int edad, String color, EmpleadoZoo cuidador, Habitat habitat) {
		super(nombre, genero, especie, edad, cuidador, habitat);
		this.color = color;
	}

	
	

	@Override
	public String toString() {
		return "Reptiles [color=" + color + ", nombre=" + nombre + ", genero=" + genero + ", especie=" + especie
				+ ", edad=" + edad + ", cuidador=" + cuidador + ", habitat=" + habitat + "]";
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




	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	
}
