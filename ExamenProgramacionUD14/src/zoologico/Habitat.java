package zoologico;

import java.util.ArrayList;

public class Habitat {
	private String nombre;
	private ArrayList<Animales> animal;

	public Habitat(String nombre) {
		this.nombre=nombre;
		this.animal = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Animales> getAnimal() {
		return animal;
	}

	public void setAnimal(ArrayList<Animales> animal) {
		this.animal = animal;
	}
	
	
	
}
