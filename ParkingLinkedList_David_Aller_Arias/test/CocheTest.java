import static org.junit.Assert.*;

import org.junit.Test;

public class CocheTest {

    @Test
    public void constructor_datosValidos_creaCocheCorrectamente() {
        Coche c = new Coche("1234ABC", "Toyota", "Rojo");

        assertNotNull(c);
        assertEquals("1234ABC", c.getMatricula());
        assertEquals("Toyota", c.getMarca());
        assertEquals("Rojo", c.getColor());
    }

    @Test
    public void getMatricula_devuelveMatriculaCorrecta() {
        Coche c = new Coche("5678DEF", "Seat", "Blanco");

        assertEquals("5678DEF", c.getMatricula());
    }

    @Test
    public void getMarca_devuelveMarcaCorrecta() {
        Coche c = new Coche("9999ZZZ", "BMW", "Negro");

        assertEquals("BMW", c.getMarca());
    }

    @Test
    public void getColor_devuelveColorCorrecto() {
        Coche c = new Coche("1111AAA", "Audi", "Azul");

        assertEquals("Azul", c.getColor());
    }

    @Test
    public void toString_contieneDatosDelCoche() {
        Coche c = new Coche("2222BBB", "Ford", "Gris");

        String resultado = c.toString();

        assertTrue(resultado.contains("2222BBB"));
        assertTrue(resultado.contains("Ford"));
        assertTrue(resultado.contains("Gris"));
    }

}
