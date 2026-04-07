
public class main {
    public static void main(String[] args) {

        /**
         * Creacion del parkin
         */
        Parking parking = new Parking();

        /**
         * Creacion de los coches
         */
        Coche c1 = new Coche("1111AAA", "Seat", "Rojo");
        Coche c2 = new Coche("2222BBB", "BMW", "Negro");
        Coche c3 = new Coche("3333CCC", "Audi", "Blanco");

        /**Aparcar los coches
         * 
         */
        parking.aparcarCoche(c1);
        parking.aparcarCoche(c2);
        parking.aparcarCoche(c3);

        /**
         * Imprimir el plano del parking
         */
        System.out.println("Plano del parking:");
        System.out.println(parking.mostrar());

        /**
         * Mostrar el numero de plazas, las libres, las ocupadas y el porcentaje de ocupacion
         */
        int totalPlazas = parking.contarPlazasLibres() + parking.contarPlazasOcupadas(); 
        System.out.println("Total plazas: " + totalPlazas);
        System.out.println("Plazas libres: " + parking.contarPlazasLibres());
        System.out.println("Plazas ocupadas: " + parking.contarPlazasOcupadas());
        System.out.println("Porcentaje ocupación: " + parking.porcentajeOcupacion() + "%");

        /**
         * Mostrar la primera plaza libre
         */
        Plaza primeraLibre = parking.plazaLibre();
        if (primeraLibre != null) {
            System.out.println("Primera plaza libre en fila " 
                + primeraLibre.getFila() + ", columna " 
                + primeraLibre.getColumna());
        } else {
            System.out.println("No hay plazas libres");
        }

        /**
         * Buscar coches por matriculas
         */
        parking.buscarCoche("2222BBB");  
        
    }
}
