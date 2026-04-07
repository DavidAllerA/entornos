
public class Plaza {
	private int fila;
	private int columna;
	private Coche coche;
	private boolean libre = true;
	
	/**
	 * Contructor de la Plaza
	 * @param fila
	 * @param columna
	 */
	public Plaza(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
	/**
	 * Metodo que nos devuelve si la plaza esta libre o no
	 * @return libre
	 */
	public boolean estaLibre() {
		
		if (coche == null) {
			libre = true;
		}else {
			libre = false;
		}
		return libre;
	}
	
	/*
	 * Metodo que sirve para aparcar un metodo en una plaza y ocupar ese sitio
	 */
	public void aparcar(Coche coche) {
		this.coche = coche;
		libre = false;
	}
	
	/*
	 * Metodo que saca un coche de una plaza
	 */
	public void liberar() {
		this.coche = null;
		libre = true;
	}
	/*
	 * Metodo que devuelve la fila
	 * @return fila
	 */
	public int getFila() {
		return fila;
	}
	
	/*
	 * Metodo que devuelve la columna
	 * @return columna
	 */
	public int getColumna() {
		return columna;
	}
	
	/*
	 * Metodo que devulve el coche
	 * @return coche
	 */
	public Coche getCoche() {
		return coche;
	}
	
	/*
	 * Metodo para cambiar la columna
	 */
	public void setColumna(int nuevaCol) {
		this.columna = nuevaCol;
	}
	
	/*
	 * Metodo para cambiar la fila
	 */
	public void setFila(int nuevaFila) {
		this.fila = nuevaFila;
	}
	
	/*
	 * Metodo que nos devuelve el estado de libre
	 * @return libre
	 */
	public boolean getLibre() {
		return libre;
	}
	/*
	 * Metodo para cambiar el coche
	 */
	public void setCoche(Coche nuevoCoche) {
		this.coche = nuevoCoche;
	}
	
	
}
