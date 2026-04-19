import java.util.ArrayList;

public class GestionCicloFP {
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(); 
    private ArrayList<Ciclo> listaCiclos = new ArrayList<>();
    private Busqueda busqueda = new Busqueda();

    public void agregarEstudiante(String nombre, int id, int edad) {  
        listaEstudiantes.add(new Estudiante(nombre, id, edad));
    }

    public void agregarCiclo(String nombreCiclo) { 
    	listaCiclos.add(new Ciclo(nombreCiclo));
    }
       
    public void matricularEstudiante(int idEstudiante, String nombreCiclo) { 
        Estudiante est = busqueda.buscarEstudiante(listaEstudiantes, idEstudiante);
        Ciclo ciclo = busqueda.buscarCiclo(listaCiclos, nombreCiclo);
        if (est != null && ciclo != null) {
            ciclo.agregarEstudiante(est);
        }
    }

    public void mostrarCiclos() { 
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.getDatosCiclo());
        }
    }

}

