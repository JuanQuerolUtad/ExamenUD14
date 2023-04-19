package zoologico;

import java.util.ArrayList;


public class Zoo {
	private ArrayList<Habitat> listaHabitats;

	public Zoo() {
		this.listaHabitats = new ArrayList<>();
	}
	public void agregarAnimal(String habitat, Animales animal) {
		for (int j = 0; j < listaHabitats.size(); j++) {
			if (listaHabitats.get(j).getNombre().equalsIgnoreCase(habitat)) {
				listaHabitats.get(j).getAnimal().add(animal);
			}
		}
	}
	public void agregarHabitat(Habitat habitat) {
			listaHabitats.add(habitat);
		}
	public void eliminarHabitat(String habita) {
		for (int i = 0; i < listaHabitats.size(); i++) {
			if (listaHabitats.get(i).getNombre().equalsIgnoreCase(habita)) {
				listaHabitats.remove(i);
			}
		}
	}
	public void eliminarAnimal(String habitat, String animal) {
		for (int j = 0; j < listaHabitats.size(); j++) {
			for (int i = 0; i < listaHabitats.get(j).getAnimal().size(); i++) {
				if (listaHabitats.get(j).getAnimal().get(i).getNombre().equalsIgnoreCase(animal)) {
					listaHabitats.get(j).getAnimal().remove(i);
				}
			}
		}
	}
	public Habitat mostrarHabitat(int i) {
		return listaHabitats.get(i);
		
	}
	public int tamayo() {
		return listaHabitats.size();
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
