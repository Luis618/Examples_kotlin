package models;

public class Restaurante {
    int mesas;
    int sillas;
    String nombre;
    String tipo;
    // Miembros de clase
    public Restaurante(int sillas, int mesas, String nombre, String tipo) {
        this.sillas = sillas;
        this.mesas = mesas;
        this.nombre = nombre;
        this.tipo = tipo;


    }

    public Restaurante(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
        //En java se declara primero el tipo
        // Getters y setters son para exponer lo miembros de la clase

    }
}
