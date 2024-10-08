package co.edu.uniquindio.poo;

public class Perro extends Animal{
    private String raza;
    Dueño dueño;
    Veterinario veterinario;

    public Perro(String nombre, int edad, double peso, String raza, String tratamiento, Dueño dueño, Veterinario veterinario) {
        super(nombre, edad, peso, tratamiento);
        this.raza = raza;
        this.dueño = dueño;
        this.veterinario = veterinario;
        assert !nombre.isBlank();
        assert edad > 0;
        assert peso > 0;
        assert !tratamiento.isBlank();
        assert !raza.isBlank();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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
        return "Perro [Nombre= " +nombre+ " edad= " +edad+ " peso= " +peso+ "kg, raza= " + raza + " tratamiento= " +tratamiento+ " || Dueño= " +dueño+ ", veterinario encargado= " +veterinario+ "]";
    }

}
