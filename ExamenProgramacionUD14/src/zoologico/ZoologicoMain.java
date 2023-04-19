package zoologico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ZoologicoMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Zoo zoo1 = new Zoo();
		ArrayList<Animales> animales = new ArrayList<>();
		ArrayList<EmpleadoZoo> empleados = new ArrayList<>();
		try {
			menu(animales, empleados);
		} catch (CuidadorExistenteException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void imprimirMenu() {
		System.out.println("Menu Zoologico");
		System.out.println("1. Agregar y eliminar animales del zoológico.");
		System.out.println("2. Agregar y eliminar hábitats del zoológico.");
		System.out.println("3. Agregar y eliminar cuidadores del zoológico.");
		System.out.println("4. Asignar animales a hábitats específicos.");
		System.out.println("5. Asignar cuidadores a animales específicos.");
		System.out.println("6. Mostrar información detallada de cada animal, hábitat y cuidador.");
		System.out.println("7. Mostrar los animales del zoo ordenados por edad.");
		System.out.println("8. salir");
	}
	public static void menu(ArrayList<Animales> animales, ArrayList<EmpleadoZoo>empleado, Zoo zoo) throws CuidadorExistenteException {
		int opcion = 0;
		while(opcion == 8) {
			imprimirMenu();
			System.out.println("elige una opcion (1-8)");
			opcion = sc.nextInt();
			if (opcion==1) {
				ModificaAnimales(animales, empleado, zoo);
			}else if(opcion ==2) {
				ModificaHabita(zoo);
			}else if(opcion ==3) {
				MostrarEmpleado(empleado);
			}else if(opcion ==4) {
				asignarhabitat(zoo, animales);
			}else if(opcion ==5) {
				
			}else if(opcion ==6) {
				zoo.toString();
			}else if(opcion ==7) {
				
			}else if(opcion ==8) {
				System.out.println("Terminando programa");
			}else {
				System.out.println("Esa opcion no existe");
			}
		}
		
	}
	public static void asignarhabitat(Zoo zoo, ArrayList<Animales>animales) {
		System.out.println("escriba el ombre del animal que quiera meter en el habitat");
		String nombre=sc.nextLine();
		System.out.println("escriba el nombre del habitat");
		String nombre2=sc.nextLine();
		int t = zoo.tamaño();
		for (int i = 0; i < t; i++) {
			if (zoo.mostrarHabitat(i).getNombre().equalsIgnoreCase(nombre2)) {
				for (int j = 0; j < animales.size(); j++) {
					if (animales.get(j).getNombre().equalsIgnoreCase(nombre)) {
						zoo.agregarAnimal(nombre, animales.get(j));
					}
				}
				
			}
		}
	}
	public static void ModificaHabita(Zoo zoo) throws CuidadorExistenteException{
		int opcion2=0;
		while (opcion2!=1 ||opcion2!=2) {
			System.out.println("elige etre 1. agregar animal o 2. eliminar animal");
			if (opcion2==1) {
				System.out.println("Escribe el nombre del habitat");
				String nombre = sc.nextLine();
				zoo.agregarHabitat(new Habitat(nombre));
				
			}else if (opcion2==2) {
				ModificaEmpleados(empleado);
				System.out.println("Escribe el nombre del animal que quieras quitar");
				String nombre= sc.nextLine();
				int t = zoo.tamaño();
				for (int i = 0; i < t; i++) {
					if (nombre.equalsIgnoreCase(zoo.mostrarHabitat(i).getNombre())) {
						zoo.eliminarHabitat(nombre);
					}
				}
			}}
	}
	public static void agregaAnimal(ArrayList<Animales>animales, ArrayList<EmpleadoZoo>empleado, Zoo zoo)throws CuidadorExistenteException {
		System.out.println("Que tipo de animal es (mamifero, reptil, ave)");
		String tipo=sc.nextLine();
		if (tipo.equalsIgnoreCase("mamifero")) {
			System.out.println("Introduzca el nombre del animal");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el genero del animal");
			String genero = sc.nextLine();
			System.out.println("Introduzca la especie del animal");
			String especie = sc.nextLine();
			System.out.println("Introduzca la edad del animal");
			int edad = sc.nextInt();
			
			System.out.println("escribe el desplazamiento(tierra, mar, aire)");
			String desplazar = sc.nextLine();
			Desplazamiento d;
			if (desplazar.equalsIgnoreCase("tierra")) {
				 d= Desplazamiento.TIERRA;
			}else if(desplazar.equalsIgnoreCase("mar")){
				 d = Desplazamiento.MAR;
			}else if(desplazar.equalsIgnoreCase("aire")){
				 d = Desplazamiento.AIRE;
			}else {
				System.out.println("no existe ese desplazamiento");
				 d = Desplazamiento.TIERRA;
			}
			System.out.println("Elige un cuidador");
			MostrarEmpleado(empleado);
			String empleados =sc.nextLine();
			EmpleadoZoo empleado1;
			for (int i = 0; i < empleado.size(); i++) {
				
				if (empleado.get(i).getNombre().equalsIgnoreCase(empleados)) {
					 empleado1= empleado.get(i);
					}
				else {
					CuidadorExistenteException e = new CuidadorExistenteException("no existe ese empleado");
					throw e;
				}
					
			}
			System.out.println("Elige un cuidador");
			Mostrarhabitat(zoo);
			String habita =sc.nextLine();
			int t = zoo.tamayo();
			for (int i = 0; i <  t; i++) {
				
				if (zoo.mostrarHabitat(i).getNombre().equalsIgnoreCase(habita)) {
					animales.add(new Mamiferos(nombre, genero, especie, edad, d, empleado1 ,zoo.mostrarHabitat(i)));
					}
				else {
					CuidadorExistenteException e = new CuidadorExistenteException("no existe ese empleado");
					throw e;
				}
					
			}
			
			
			
		}else if (tipo.equalsIgnoreCase("reptil")) {
			System.out.println("Introduzca el nombre del animal");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el genero del animal");
			String genero = sc.nextLine();
			System.out.println("Introduzca la especie del animal");
			String especie = sc.nextLine();
			System.out.println("Introduzca la edad del animal");
			int edad = sc.nextInt();
			System.out.println("escribe es color de las escamas");
			String color = sc.nextLine();
			System.out.println("Elige un cuidador");
			MostrarEmpleado(empleado);
			String empleados =sc.nextLine();
			EmpleadoZoo empleado1;
			for (int i = 0; i < empleado.size(); i++) {
				
				if (empleado.get(i).getNombre().equalsIgnoreCase(empleados)) {
					 empleado1= empleado.get(i);
					}
				else {
					CuidadorExistenteException e = new CuidadorExistenteException("no existe ese empleado");
					throw e;
				}
					
			}
			System.out.println("Elige un cuidador");
			Mostrarhabitat(zoo);
			String habita =sc.nextLine();
			int t = zoo.tamayo();
			for (int i = 0; i <  t; i++) {
				
				if (zoo.mostrarHabitat(i).getNombre().equalsIgnoreCase(habita)) {
					animales.add(new Reptiles(nombre, genero, especie, edad, color, empleado1 ,zoo.mostrarHabitat(i)));
					}
				else {
					CuidadorExistenteException e = new CuidadorExistenteException("no existe ese empleado");
					throw e;
				}
					
			}
		}else if (tipo.equalsIgnoreCase("ave")) {
			System.out.println("Introduzca el nombre del animal");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el genero del animal");
			String genero = sc.nextLine();
			System.out.println("Introduzca la especie del animal");
			String especie = sc.nextLine();
			System.out.println("Introduzca la edad del animal");
			int edad = sc.nextInt();
			
			System.out.println("Introduzca la logitud del pico de la ave");
			double longitudPico= sc.nextDouble();
			System.out.println("Introduzca si es una rapaz o no(true-false)");
			boolean rapaces=sc.nextBoolean();
			
			System.out.println("Elige un cuidador");
			MostrarEmpleado(empleado);
			String empleados =sc.nextLine();
			EmpleadoZoo empleado1;
			for (int i = 0; i < empleado.size(); i++) {
				
				if (empleado.get(i).getNombre().equalsIgnoreCase(empleados)) {
					 empleado1= empleado.get(i);
					}
				else {
					CuidadorExistenteException e = new CuidadorExistenteException("no existe ese empleado");
					throw e;
				}
					
			}
			System.out.println("Elige un cuidador");
			Mostrarhabitat(zoo);
			String habita =sc.nextLine();
			int t = zoo.tamayo();
			for (int i = 0; i <  t; i++) {
				
				if (zoo.mostrarHabitat(i).getNombre().equalsIgnoreCase(habita)) {
					animales.add(new Aves(nombre, genero, especie, edad,longitudPico, rapaces, empleado1 ,zoo.mostrarHabitat(i)));
					}
				else {
					CuidadorExistenteException e = new CuidadorExistenteException("no existe ese empleado");
					throw e;
				}
					
			}
		}else {
			System.out.println("no existe ese tipo");
		}
	}
	public static void agregarEmpleado(ArrayList<EmpleadoZoo>empleado) {
		System.out.println("Escribe el nombre");
		String nombre=sc.nextLine();
		System.out.println("Escribe los apellidos");
		String apellidos=sc.nextLine();
		System.out.println("Escribe el salario");
		double salario=sc.nextDouble();
		empleado.add(new EmpleadoZoo(nombre, apellidos, salario));
	}
	public static void ModificaAnimales(ArrayList<Animales> animales, ArrayList<EmpleadoZoo>empleado, Zoo zoo) throws CuidadorExistenteException{
		int opcion2=0;
		while (opcion2!=1 ||opcion2!=2) {
			System.out.println("elige etre 1. agregar animal o 2. eliminar animal");
			if (opcion2==1) {
				agregaAnimal(animales, empleado, zoo);
			}else if (opcion2==2) {
				for (int i = 0; i < animales.size(); i++) {
					System.out.println(animales.get(i).toString());
				}
				System.out.println("Escribe el nombre del animal que quieras quitar");
				String nombre= sc.nextLine();
				for (int i = 0; i < animales.size(); i++) {
					if (nombre.equalsIgnoreCase(animales.get(i).getNombre())) {
						animales.remove(i);
					}
				}
				
				
			}else {
				System.out.println("no existe esa opcion");
			}
			
		}
	}
	public static void ModificaEmpleados(ArrayList<EmpleadoZoo>empleado) throws CuidadorExistenteException{
		int opcion2=0;
		while (opcion2!=1 ||opcion2!=2) {
			System.out.println("elige etre 1. agregar animal o 2. eliminar animal");
			if (opcion2==1) {
				System.out.println("Escribe el nombre del empleado");
				String nombre = sc.nextLine();
				System.out.println("Escribe los apellidos del empleado");
				String apellidos = sc.nextLine();
				System.out.println("Escribe el salario del empleado");
				double salario = sc.nextDouble();
				empleado.add(new EmpleadoZoo(nombre, apellidos, salario));
			}else if (opcion2==2) {
				ModificaEmpleados(empleado);
				System.out.println("Escribe el nombre del animal que quieras quitar");
				String nombre= sc.nextLine();
				for (int i = 0; i < empleado.size(); i++) {
					if (nombre.equalsIgnoreCase(empleado.get(i).getNombre())) {
						empleado.remove(i);
					}
				}
				
				
			}else {
				System.out.println("no existe esa opcion");
			}}
			
		}
	public static void MostrarEmpleado(ArrayList<EmpleadoZoo> empleado) {
			for (int i = 0; i < empleado.size(); i++) {
				System.out.println(empleado.get(i).toString());
			}
	}
	public static void Mostrarhabitat(Zoo zoo) {
		int t=zoo.tamayo();
		for (int i = 0; i < t; i++) {
			System.out.println(zoo.mostrarHabitat(i).getNombre());
		}
	}
}
