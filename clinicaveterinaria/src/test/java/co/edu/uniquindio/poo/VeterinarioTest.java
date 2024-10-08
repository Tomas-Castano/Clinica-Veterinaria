package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VeterinarioTest {
    private static final Logger LOG = Logger.getLogger(VeterinarioTest.class.getName());
    @Test
   public void datosVacios () {
    LOG.info("Iniciando test datosVacios");

    Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");

    Assertions.assertThrows(Throwable.class , ()-> new Veterinario("", "", "", "", "", ""));

    LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void testGetNombre() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");

        Assertions.assertEquals("Juanito Perez", veterinariotest.getNombre());
    }

    @Test
    public void testToString() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");

        String expected = "Veterinario [Nombre: Juanito Perez, cedula: 000005 telefono: 500000 correo: Juanitope@gmail.com especialidad=Perros, infoProfesional=Medianamente profesional]";

        Assertions.assertEquals(expected, veterinariotest.toString());
    }
}
