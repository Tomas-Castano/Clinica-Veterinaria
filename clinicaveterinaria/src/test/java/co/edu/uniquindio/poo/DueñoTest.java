package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DueñoTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
   public void datosVacios () {
    LOG.info("Iniciando test datosVacios");

    Dueño dueño = new Dueño("Pedro", "000006", "700000", "Pedro@gmail.com", "Buen dueño");

    Assertions.assertThrows(Throwable.class , ()-> new Dueño("", "", "", "", ""));

    LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void testGetNombre() {
        Dueño dueño = new Dueño("Pedro", "000006", "700000", "Pedro@gmail.com", "Buen dueño");

        Assertions.assertEquals("Pedro", dueño.getNombre());
    }

    @Test
    public void testToString() {
        Dueño dueño = new Dueño("Pedro", "000006", "700000", "Pedro@gmail.com", "Buen dueño");

        String expected = "Dueño [Nombre: Pedro, cedula: 000006 telefono: 700000 correo: Pedro@gmail.com historial: Buen dueño]";

        Assertions.assertEquals(expected, dueño.toString());
    }
}
