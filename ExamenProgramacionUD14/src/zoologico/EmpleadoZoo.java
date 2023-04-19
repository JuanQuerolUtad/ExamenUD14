package zoologico;

public class EmpleadoZoo implements Cuidador{
	private String nombre;
	private String apellidos;
	private double salario;
	
	public EmpleadoZoo(String nombre, String apellidos, double salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public void Alimentar(String alimento) {
		// TODO Auto-generated method stub
		
	}

}
