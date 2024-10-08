/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    @Test
    public void agregarAve () {
        LOG.info("Iniciando test agregarAve");

        Veterinaria veterinaria = new Veterinaria("Algo", "No se");
        Veterinario Juan = new Veterinario("Juan", "000003", "3000000", "Juan@gmail.com", "Aves", "Muy profesional");
        Ave paloma = new Ave("paloma", 2, 12, "Ni idea no soy veterinario", 14.4, "Aguila", "No", Juan);

        veterinaria.agregarAve(paloma);

        assertTrue(veterinaria.getAves().contains(paloma));

        assertEquals(1, veterinaria.getAves().size());
    }
}
