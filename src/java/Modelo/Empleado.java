package Modelo;

public class Empleado {
    int idemple;
    String dni;
    String nombre;
    String apellido;
    String telefono;
    String estado;
    String correo;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, String telefono, String estado, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.estado = estado;
        this.correo = correo;
    }

    public int getIdemple() {
        return idemple;
    }

    public void setIdemple(int idemple) {
        this.idemple = idemple;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
