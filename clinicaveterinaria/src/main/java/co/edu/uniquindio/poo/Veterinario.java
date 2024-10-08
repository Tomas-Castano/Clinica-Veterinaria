package co.edu.uniquindio.poo;

public class Veterinario extends Persona {
    private String especialidad;
    private String infoProfesional;

    public Veterinario(String nombre, String cedula, String telefono, String correo, String especialidad,
            String infoProfesional) {
        super(nombre, cedula, telefono, correo);
        this.especialidad = especialidad;
        this.infoProfesional = infoProfesional;
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !correo.isBlank();
        assert !especialidad.isBlank();
        assert !infoProfesional.isBlank();
        assert !especialidad.isBlank();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getInfoProfesional() {
        return infoProfesional;
    }

    public void setInfoProfesional(String infoProfesional) {
        this.infoProfesional = infoProfesional;
    }

    @Override
    public String toString() {
        return "Veterinario [Nombre: " +nombre+ ", cedula: " +cedula+ " telefono: " +telefono+ " correo: " +correo+ " especialidad=" + especialidad + ", infoProfesional=" + infoProfesional + "]";
    }
    
    
}
