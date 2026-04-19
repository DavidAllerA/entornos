public class Estudiante {
    private String nombreEstudiante;  
    private int idEstudiante;         
    private int edadEstudiante;       
   
    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
       
    }

    public String datosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }
    
    public int getIdEstudiante() {
    	return this.idEstudiante;
    }
    
    public String getNombreEstudiante() {
    	return this.nombreEstudiante;
    }
    
    public int getEdadEstudiante() {
    	return this.edadEstudiante;
    }
    
    public void setIdEstudiante(int nuevoIdEstudiante) {
    	this.idEstudiante = nuevoIdEstudiante;
    }
    
    public void setEdadEstudiante(int nuevoEdadEstudiante) {
    	this.edadEstudiante = nuevoEdadEstudiante;
    }
    
    public void setNombreEstudiante(String nuevoNombreEstudiante) {
    	this.nombreEstudiante = nuevoNombreEstudiante;
    }
    
}
