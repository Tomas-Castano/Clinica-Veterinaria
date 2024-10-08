package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        //Creamos la veterinaria
        Veterinaria veterinaria = new Veterinaria("Animales friend", "Calle 20");

        //Registramos a los veterinarios

        Veterinario DonRamon = new Veterinario("Don Ramon", "000002", "200000", "DonRa@gmail.com", "Pegarle al chavo", "Graduado en 2018");

        //Registramos a los dueños

        Dueño Pedro = new Dueño("Juan", "000001", "100000", "Juan@gmail.com", "Buen dueño bro, 10/10");

        //Registramos a los animales

        Perro Devoradordemundos = new Perro("Devorador de mundos", 6, 30.0, "Labrador", "Caricias en la cabeza", Pedro, DonRamon);
        Gato Escapista = new Gato("Escapista", 4, 10.0, "Un baño con la lengua", "Naranja con blanco", Pedro, DonRamon);
        Ave Lucas = new Ave("Lucas", 3, 6.0, "Darle gusanos de desayuno", 13.3, "Paloma comun", "Si", DonRamon);
        Leon Juanito = new Leon("Juanito", 15, 60.0, "Rascarle la pancita", "hombre", "Redonda", "Muy bueno cazando", DonRamon);

        //Agregamos a la veterinaria los animales registrados
        veterinaria.agregarPerro(Devoradordemundos);
        veterinaria.agregarGato(Escapista);
        veterinaria.agregarAve(Lucas);
        veterinaria.agregarLeon(Juanito);

        veterinaria.mostrarMensaje(veterinaria.toString());
    }
}
