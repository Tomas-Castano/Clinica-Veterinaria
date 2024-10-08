package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerroTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
    void testGetRaza() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
        Dueño dueño = new Dueño("Pedro", "00006", "600000", "Pedronose@gmail.com", "Dueño ok");
        Perro perro = new Perro("Destruyemundos", 10, 24.5, "Pastor Alemán", "Caricias en la pancita", dueño, veterinariotest);
        assertEquals("Pastor Alemán", perro.getRaza());
    }

    @Test
    public void testToString() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
        Dueño dueño = new Dueño("Pedro", "00006", "600000", "Pedronose@gmail.com", "Dueño ok");
        Perro perro = new Perro("Destruyemundos", 10, 24.5, "Pastor Alemán", "Caricias en la pancita", dueño, veterinariotest);

        String expected = "Perro [Nombre= Destruyemundos edad= 10 peso= 24.5kg, raza= Pastor Alemán tratamiento= Caricias en la pancita || Dueño= Dueño [Nombre: Pedrocedula: 00006 telefono: 600000 correo: Pedronose@gmail.com historial: Dueño ok], veterinario encargado= Veterinario [Nombre: Juanito Perezcedula: 000005 telefono: 500000 correo: Juanitope@gmail.com especialidad=Perros, infoProfesional=Medianamente profesional]]";
        Assertions.assertEquals(expected, perro.toString());
    }

    @Test
    public void testGetNombre() {
        Veterinario veterinariotest = new Veterinario("Juanito Perez", "000005", "500000", "Juanitope@gmail.com", "Perros", "Medianamente profesional");
        Dueño dueño = new Dueño("Pedro", "00006", "600000", "Pedronose@gmail.com", "Dueño ok");
        Perro perro = new Perro("Destruyemundos", 10, 24.5, "Pastor Alemán", "Caricias en la pancita", dueño, veterinariotest);

        Assertions.assertEquals("Destruyemundos", perro.getNombre());
    }    
}
