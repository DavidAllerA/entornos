
public class Coche {
	private String matricula;
	private String marca;
	private String color;
	
	/**
	 * Constructor del coche
	 * @param matricula
	 * @param marca
	 * @param color
	 */
	public Coche(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}
	/**
	 * Metodo que devuelve la matricula del coche
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Metodo que devuelve la marca del coche
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Metodo que devuelve el color de un coche
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Metodo que devuelve la informacion del coche
	 */
	public String toString() {
		return "Matricula: " + matricula + " Marca: " + marca + " Color: " + color;
	}
	
}
