
public class Password {
	private int longitud;
	private String pass;

	public Password() {
		this.longitud = 8;
		this.pass = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.pass = generaPass(longitud);
	}

	public String generaPass(int longitud) {
		String pass = "";
		String opciones = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY0123456789";
		for (int i = 0; i < longitud; i++) {
			pass += opciones.charAt((int) Math.floor(Math.random() * opciones.length()));
		}
		return pass;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", pass=" + pass + "]";
	}

}
