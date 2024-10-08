package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Gatotest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
   public void datosVacios () {
    LOG.info("Iniciando test datosVacios");

    Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
    Dueño dueño = new Dueño("Pedro", "00006", "600000", "Pedronose@gmail.com", "Dueño ok");
    Gato gato = new Gato("Randy", 5, 11.1, "Un baño", "Negro", dueño, veterinariotest);

    Assertions.assertThrows(Throwable.class , ()-> new Gato("", 0, 0.0, "", "", dueño, veterinariotest));

    LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void testToString() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
        Dueño dueño = new Dueño("Pedro", "00006", "600000", "Pedronose@gmail.com", "Dueño ok");
        Gato gato = new Gato("Randy", 5, 11.1, "Un baño", "Negro", dueño, veterinariotest);

        String expected = "Gato [nombre=Randy, pelaje=Negro, edad=5, peso=11.1kg, tratamiento=Un baño|| Dueño= Dueño [Nombre: Pedrocedula: 00006 telefono: 600000 correo: Pedronose@gmail.com historial: Dueño ok], veterinario encargado= Veterinario [Nombre: Juanito Perezcedula: 000005 telefono: 500000 correo: Juanitope@gmail.com especialidad=Perros, infoProfesional=Medianamente profesional]]";
        Assertions.assertEquals(expected, gato.toString());
    }

    @Test
    public void testGetNombre() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
        Dueño dueño = new Dueño("Pedro", "00006", "600000", "Pedronose@gmail.com", "Dueño ok");
        Gato gato = new Gato("Randy", 5, 11.1, "Un baño", "Negro", dueño, veterinariotest);

        Assertions.assertEquals("Randy", gato.getNombre());
    }
}
