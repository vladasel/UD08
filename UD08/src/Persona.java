
public class Persona {
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	private final String GENERO = "h";

	public Persona(String dNI) {
		this.nombre = "";
		this.edad = 0;
		DNI = dNI;
		this.sexo = GENERO;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String dNI, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(String nombre, int edad, String dNI, String sexo) {

		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Perssona [nombre=" + nombre + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + "]";
	}

}
