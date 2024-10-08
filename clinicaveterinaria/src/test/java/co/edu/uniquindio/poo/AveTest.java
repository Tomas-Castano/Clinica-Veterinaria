package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AveTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
   public void datosVacios () {
    LOG.info("Iniciando test datosVacios");

    Veterinario veterinario = new Veterinario("Juan", "000004", "40000", "Juan@gmail.com", "Aves", "Poco profesional");
    Ave ave = new Ave("Nose", 10, 10.0, "Estoy improvisando", 12.0, "Paloma", "Si", veterinario);

    Assertions.assertThrows(Throwable.class , ()-> new Ave("", 0, 0, "", 0, "", "", veterinario));

    LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void testToString() {
        Veterinario veterinario = new Veterinario("Juan", "000004", "40000", "Juan@gmail.com", "Aves", "Poco profesional");
        Ave ave = new Ave("Nose", 10, 10.0, "Estoy improvisando", 12.0, "Paloma", "Si", veterinario);

        String expected = "Ave [nombre=Nose, envergadura=12.0, edad=10, especie=Paloma, peso=10.0kg, domestico (Si/No)=Si, tratamiento=Estoy improvisando, veterinario encargado= Veterinario [Nombre: Juancedula: 000004 telefono: 40000 correo: Juan@gmail.com especialidad=Aves, infoProfesional=Poco profesional]]";
        Assertions.assertEquals(expected, ave.toString());
    }

    @Test
    public void testGetNombre() {
        Veterinario veterinario = new Veterinario("Juan", "000004", "40000", "Juan@gmail.com", "Aves", "Poco profesional");
        Ave ave = new Ave("Nose", 10, 10.0, "Estoy improvisando", 12.0, "Paloma", "Si", veterinario);
       
        Assertions.assertEquals("Nose", ave.getNombre());
    }
}
