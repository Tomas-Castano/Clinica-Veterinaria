package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
   public void datosVacios () {
    LOG.info("Iniciando test datosVacios");

    Veterinaria veterinariatest = new Veterinaria("Lectura", "Calle 11");

    Assertions.assertThrows(Throwable.class , ()-> new Veterinaria("", ""));

    LOG.info("Finalizando test datosVacios");
    }
}
