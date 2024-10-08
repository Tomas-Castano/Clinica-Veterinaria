package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeonTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
   public void datosVacios () {
    LOG.info("Iniciando test datosVacios");

    Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
    Leon leon = new Leon("Gatito", 10, 60.0, "Caricias", "hombre", "redonda", "malo cazando", veterinariotest);

    Assertions.assertThrows(Throwable.class , ()-> new Leon("", 0, 0.0, "", "", "", "", veterinariotest));

    LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void testToString() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
        Leon leon = new Leon("Gatito", 10, 60.0, "Caricias", "hombre", "redonda", "malo cazando", veterinariotest);

        String expected = "Leon [nombre=Gatito, sexo=hombre, edad=10, formaMelena=redonda, peso=60.0kg, habilidad=malo cazando, tratamiento=Caricias, veterinario encargado= Veterinario [Nombre: Juanito Perezcedula: 000005 telefono: 500000 correo: Juanitope@gmail.com especialidad=Perros, infoProfesional=Medianamente profesional]]";
        Assertions.assertEquals(expected, leon.toString());
    }

    @Test
    public void testGetNombre() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
        Leon leon = new Leon("Gatito", 10, 60.0, "Caricias", "hombre", "redonda", "malo cazando", veterinariotest);

        Assertions.assertEquals("Gatito", leon.getNombre());
    }
}
