package co.edu.uniquindio.poo;

public class Ave extends Animal{
    private double envergadura;
    private String especie;
    private String domestico;
    Veterinario veterinario;
    
    public Ave(String nombre, int edad, double peso, String tratamiento, double envergadura, String especie,
            String domestico, Veterinario veterinario) {
        super(nombre, edad, peso, tratamiento);
        this.envergadura = envergadura;
        this.especie = especie;
        this.domestico = domestico;
        this.veterinario = veterinario;
        assert !nombre.isBlank();
        assert edad > 0;
        assert peso > 0;
        assert !tratamiento.isBlank();
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDomestico() {
        return domestico;
    }

    public void setDomestico(String domestico) {
        this.domestico = domestico;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "Ave [nombre=" + nombre + ", envergadura=" + envergadura + ", edad=" + edad + ", especie=" + especie
                + ", peso=" + peso + "kg, domestico (Si/No)=" + domestico + ", tratamiento=" + tratamiento + ", veterinario encargado= " +veterinario+ "]";
    }
    
    
}
