package co.edu.uniquindio.poo;

public class Gato extends Animal{
    private String pelaje;
    Dueño dueño;
    Veterinario veterinario;

    public Gato(String nombre, int edad, double peso, String tratamiento, String pelaje, Dueño dueño, Veterinario veterinario) {
        super(nombre, edad, peso, tratamiento);
        this.pelaje = pelaje;
        this.dueño = dueño;
        this.veterinario = veterinario;
        assert !nombre.isBlank();
        assert edad > 0;
        assert peso > 0;
        assert !tratamiento.isBlank();
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", pelaje=" + pelaje + ", edad=" + edad + ", peso=" + peso + "kg, tratamiento="
                + tratamiento + "|| Dueño= " +dueño+", veterinario encargado= " +veterinario+ "]";
    }
    
    
}
