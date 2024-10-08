package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private LinkedList<Perro> perros;
    private LinkedList<Gato> gatos;
    private LinkedList<Ave> aves;
    private LinkedList<Leon> leones;

    public Veterinaria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        perros = new LinkedList<>();
        gatos = new LinkedList<>();
        aves = new LinkedList<>();
        leones = new LinkedList<>();
        assert !nombre.isBlank();
        assert !direccion.isBlank();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public LinkedList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(LinkedList<Perro> perros) {
        this.perros = perros;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LinkedList<Gato> getGatos() {
        return gatos;
    }

    public void setGatos(LinkedList<Gato> gatos) {
        this.gatos = gatos;
    }

    public LinkedList<Ave> getAves() {
        return aves;
    }

    public void setAves(LinkedList<Ave> aves) {
        this.aves = aves;
    }

    public LinkedList<Leon> getLeones() {
        return leones;
    }

    public void setLeones(LinkedList<Leon> leones) {
        this.leones = leones;
    }

    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", direccion=" + direccion + "]\n|| Lista de perros= " +perros+ "]\n|| Lista de gatos= " +gatos+ "]\n|| Lista de aves= " +aves+ "]\n|| Lista de leones= " +leones+ "]";
    }

    public void mostrarMensaje (String mensaje) {
        System.out.println(mensaje);
    }
    
    public void agregarPerro (Perro perro) {
        perros.add(perro);
    }

    public void agregarGato (Gato gato) {
        gatos.add(gato);
    }

    public void agregarAve (Ave ave) {
        aves.add(ave);
    }

    public void agregarLeon (Leon leon) {
        leones.add(leon);
    }
}
