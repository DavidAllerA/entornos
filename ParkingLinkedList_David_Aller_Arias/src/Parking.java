import java.util.LinkedList;
public class Parking {
	/**
	 * Creacion del parking
	 */
	private LinkedList<LinkedList<Plaza>> plazas = new LinkedList<>();
	
	/**
	 * Constructor que va creando las plazas
	 */
	public Parking() {
	    for (int filas = 0; filas < 5; filas++) {
	    	LinkedList<Plaza> fila = new LinkedList<>();
	        for (int colm = 0; colm < 5; colm++) {
	            fila.add(new Plaza(filas,colm));	        
	        }
	        plazas.add(fila);
	    }
	}
	
	/**
	 * Metodo que imprime las plazas del parking y su estado
	 * @return park
	 */	
	public String mostrar() {
		String park = "";
		for (LinkedList<Plaza> fila: plazas) {
			for (Plaza plaza: fila) {
				if (plaza.estaLibre() == true) {
					park += "[L]";
				}else {
					park += "[O]";
				}
				
				
			}
			
			park += "\n";
		}
		return park;
	}
	
	/**
	 * Metodo que cuenta las plazas libres que hay en el parkin
	 * @return pL
	 */
	public int contarPlazasLibres() {
		int pL = 0;
		for (LinkedList<Plaza> fila: plazas) {
			for (Plaza plaza: fila) {
				if (plaza.estaLibre() == true) {
					pL += 1;
				}
			}
		}
		return pL;
	}
	
	/**
	 * Metodo que devuelve las plazas ocupadas
	 * @return pO
	 */
	
	public int contarPlazasOcupadas() {
		int pO = 0;
		for (LinkedList<Plaza> fila: plazas) {
			for (Plaza plaza: fila) {
				if (plaza.estaLibre() == false) {
					pO += 1;
				}
			}
		}
		return pO;
	}
	
	/**
	 * Metodo que calcula el porcentaje de plazas ocupadas en el parking
	 * @return porcentaje
	 */
	public int porcentajeOcupacion() {
		int porcentaje = 0;
		porcentaje = (contarPlazasOcupadas() *100) / 25;
		return porcentaje;
	}
	
	/**
	 * Metodo que nos devuelve la primera plaza libre que encuentre
	 * @return plaza
	 * @return null
	 */
	public Plaza plazaLibre() {
		
		for (LinkedList<Plaza> fila: plazas) {
			for (Plaza plaza: fila) {
				if (plaza.estaLibre() == true) {
					return plaza;
					
				}
			}
		}
		return null;
	}
	
	/**
	 * Metodo que aparca el coche en la primera plaza libre que encuentre
	 * @param c
	 */
	public void aparcarCoche(Coche c) {
		for (LinkedList<Plaza> fila: plazas) {
			for (Plaza plaza: fila) {
				if (plaza.estaLibre() == true) {
					plaza.aparcar(c);
					System.out.println("El coche se aparco en la fila "+ plaza.getFila() + " y en la columna "+ plaza.getColumna());
					return;
				}
			}
		}
	}
		
	
	
	/**
	 * Metdo que sirve para buscar un coche por su matricula
	 * @param matricula
	 * @return coche
	 */
	
	public Coche buscarCoche(String matricula) {
		for (LinkedList<Plaza> fila: plazas) {
			for (Plaza plaza: fila) {
                if (plaza.estaLibre() == false) {
                    Coche coche = plaza.getCoche();
                    if (coche.getMatricula().equals(matricula)) {
                        System.out.println("Coche encontrado en fila " + plaza.getFila() + " columna " + plaza.getColumna());
                        return coche;
                    }
                }
            }
        }
        System.out.println("No se encontró ningún coche con matrícula: " + matricula);
        return null;
    }
}
	
	


