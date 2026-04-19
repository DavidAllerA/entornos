import java.util.ArrayList;

public class Ciclo {
    private String nombreCiclo;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    public void agregarEstudiante(Estudiante e) { 
        listaEstudiantes.add(e); 
    }
    

    public String getDatosCiclo() {  
        StringBuilder datos = new StringBuilder("Ciclo: " + nombreCiclo + "\nEstudiantes:\n");
        for (Estudiante e : listaEstudiantes) {
        	datos.append(e.datosEstudiante()).append("\n");
        }
        return datos.toString();
    }
    
    public String getNombreCiclo() {
    	return this.nombreCiclo;
    }
    
    public void setNombreCiclo(String nuevoNombreCiclo) {
    	this.nombreCiclo = nuevoNombreCiclo;
    }
}
