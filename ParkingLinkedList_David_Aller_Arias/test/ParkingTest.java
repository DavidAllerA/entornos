import static org.junit.Assert.*;

import org.junit.Test;

public class ParkingTest {

    @Test
    public void parkingNuevo_tiene25PlazasLibres() {
        Parking p = new Parking();

        assertEquals(25, p.contarPlazasLibres());
        assertEquals(0, p.contarPlazasOcupadas());
    }

    @Test
    public void aparcarUnCoche_reducePlazasLibres() {
        Parking p = new Parking();
        Coche c = new Coche("1234ABC", "Toyota", "Rojo");

        p.aparcarCoche(c);

        assertEquals(24, p.contarPlazasLibres());
        assertEquals(1, p.contarPlazasOcupadas());
    }

    @Test
    public void porcentajeOcupacion_con5Coches_es20() {
        Parking p = new Parking();

        p.aparcarCoche(new Coche("A","A","A"));
        p.aparcarCoche(new Coche("B","B","B"));
        p.aparcarCoche(new Coche("C","C","C"));
        p.aparcarCoche(new Coche("D","D","D"));
        p.aparcarCoche(new Coche("E","E","E"));

        assertEquals(20, p.porcentajeOcupacion());
    }

    @Test
    public void plazaLibre_devuelvePrimeraPlazaLibre() {
        Parking p = new Parking();

        p.aparcarCoche(new Coche("111","A","A"));

        Plaza libre = p.plazaLibre();

        assertNotNull(libre);
        assertEquals(0, libre.getFila());
        assertEquals(1, libre.getColumna());
    }

    @Test
    public void buscarCoche_existente_loEncuentra() {
        Parking p = new Parking();

        Coche c = new Coche("9999ZZZ","BMW","Negro");
        p.aparcarCoche(c);

        Coche encontrado = p.buscarCoche("9999ZZZ");

        assertNotNull(encontrado);
        assertEquals("9999ZZZ", encontrado.getMatricula());
    }

    @Test
    public void buscarCoche_noExistente_devuelveNull() {
        Parking p = new Parking();

        Coche encontrado = p.buscarCoche("AAAA111");

        assertNull(encontrado);
    }

    @Test
    public void mostrar_parkingVacio_todoLibre() {
        Parking p = new Parking();

        String resultado = p.mostrar();

        assertTrue(resultado.contains("L"));
    }

}
