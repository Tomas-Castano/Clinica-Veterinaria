package co.edu.uniquindio.poo;

public class Leon extends Animal{
    private String sexo;
    private String formaMelena;
    private String habilidad;
    Veterinario veterinario;

    public Leon(String nombre, int edad, double peso, String tratamiento, String sexo, String formaMelena,
            String habilidad, Veterinario veterinario) {
        super(nombre, edad, peso, tratamiento);
        this.sexo = sexo;
        this.formaMelena = formaMelena;
        this.habilidad = habilidad;
        this.veterinario = veterinario;
        assert !nombre.isBlank();
        assert edad > 0;
        assert peso > 0;
        assert !tratamiento.isBlank();
        assert !sexo.isBlank();
        assert !formaMelena.isBlank();
        assert !habilidad.isBlank();
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getFormaMelena() {
        return formaMelena;
    }
    public void setFormaMelena(String formaMelena) {
        this.formaMelena = formaMelena;
    }
    public String getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "Leon [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", formaMelena=" + formaMelena
                + ", peso=" + peso + "kg, habilidad=" + habilidad + ", tratamiento=" + tratamiento + ", veterinario encargado= " +veterinario+ "]";
    }

    
    
}
