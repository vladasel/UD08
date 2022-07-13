
public class UD08App {

	public static void main(String[] args) {
		// persona
		Persona persona1 = new Persona("A123456789");
		Persona persona2 = new Persona("Ana", 17, "B987654321", "m");
		Persona persona3 = new Persona("Marta", 56, "C123123123", "m", 67.8, 168.5);

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());

		// password
		Password pw1 = new Password();
		Password pw2 = new Password(12);

		System.out.println(pw1.toString());
		System.out.println(pw2.toString());

		// electrodomestico

		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(234.5, 34);
		Electrodomestico e3 = new Electrodomestico(120, colores.azul, consumoEnergetico.A, 20);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

		// serie

		Serie s1 = new Serie();
		Serie s2 = new Serie("serie de prueba", "Maria Antonieta");
		Serie s3 = new Serie("reir y reir", 4, "comedia", "pepito");

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}

}
