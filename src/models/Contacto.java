package models;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + 
               ", apellido=" + apellido + 
               ", telefono=" + telefono + "]";
    }

    @Override
    public int hashCode() {
        return (nombre + apellido + telefono).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contacto)) return false;
        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre) &&
               apellido.equals(other.apellido) &&
               telefono.equals(other.telefono);
    }
}
