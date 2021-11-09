
package Modelo;

public class Login {
    private String usuario;
    private String clave;
    private String rol;
    private int cod;
    private String nombre;

    public Login(String usuario, String clave, String rol, String nombre) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.nombre = nombre;
    }

    public Login(String usuario, String clave, String rol, int cod, String nombre) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.cod = cod;
        this.nombre = nombre;
    }

    public Login(String usuario, String clave, String rol, int cod) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.cod = cod;
    }

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public Login(String usuario, String clave, String rol) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
