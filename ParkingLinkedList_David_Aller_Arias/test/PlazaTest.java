import static org.junit.Assert.*;

import org.junit.Test;

public class PlazaTest {

    @Test
    public void constructor_filaYColumna_correctas_yCocheNull() {
        Plaza p = new Plaza(2, 3);

        assertNotNull(p);
        assertEquals(2, p.getFila());
        assertEquals(3, p.getColumna());
        assertNull(p.getCoche());
    }

    @Test
    public void plazaRecienCreada_estaLibre_devuelveTrue() {
        Plaza p = new Plaza(0, 0);

        assertTrue(p.estaLibre());
    }

    @Test
    public void aparcar_cocheValido_plazaPasaAOcupada() {
        Plaza p = new Plaza(1, 1);
        Coche c = new Coche("1234ABC", "Toyota", "Rojo");

        p.aparcar(c);

        assertFalse(p.estaLibre());
        assertNotNull(p.getCoche());
        assertEquals("1234ABC", p.getCoche().getMatricula());
    }

    @Test
    public void liberar_plazaOcupada_plazaPasaALibre() {
        Plaza p = new Plaza(1, 2);
        Coche c = new Coche("5678DEF", "Seat", "Blanco");

        p.aparcar(c);
        p.liberar();

        assertTrue(p.estaLibre());
        assertNull(p.getCoche());
    }

    @Test
    public void getFila_devuelveFilaCorrecta() {
        Plaza p = new Plaza(4, 2);

        assertEquals(4, p.getFila());
    }

    @Test
    public void getColumna_devuelveColumnaCorrecta() {
        Plaza p = new Plaza(4, 2);

        assertEquals(2, p.getColumna());
    }

    @Test
    public void setCoche_cocheValido_asignaCocheCorrectamente() {
        Plaza p = new Plaza(3, 3);
        Coche c = new Coche("9999ZZZ", "BMW", "Negro");

        p.setCoche(c);

        assertNotNull(p.getCoche());
        assertEquals("9999ZZZ", p.getCoche().getMatricula());
        assertFalse(p.estaLibre());
    }

    @Test
    public void setCoche_null_plazaQuedaLibre() {
        Plaza p = new Plaza(2, 2);
        Coche c = new Coche("1111AAA", "Audi", "Azul");

        p.setCoche(c);
        p.setCoche(null);

        assertNull(p.getCoche());
        assertTrue(p.estaLibre());
    }
}
