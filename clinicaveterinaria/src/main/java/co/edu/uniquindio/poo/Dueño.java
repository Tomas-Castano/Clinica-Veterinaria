package co.edu.uniquindio.poo;

public class Dueño extends Persona{
    private String historial;

    public Dueño(String nombre, String cedula, String telefono, String correo, String historial) {
        super(nombre, cedula, telefono, correo);
        this.historial = historial;
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !correo.isBlank();
        assert !historial.isBlank();
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }


    @Override
    public String toString() {
        return "Dueño [Nombre: " +nombre+ ", cedula: " +cedula+ " telefono: " +telefono+ " correo: " +correo+ " historial: " + historial + "]";
    }

    
}
