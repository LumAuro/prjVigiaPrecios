package com.grupo27_1.appvigia.entities;

//importamos las herramientas de javax.persistence
import javax.persistence.*;

//Creamos las anotaciones claves
@Entity
@Table(schema = "appvigia", name = "usuarios")
public class Usuario {

    // Creamos los constructores uno con los argumentos y otro vacio

    public Usuario(String nombre, String usuario, String clave, String correo, String prefijo, String celular) {
        this.setNombre(nombre);
        this.setUsuario(usuario);
        this.setClave(clave);
        this.setCorreo(correo);
        this.setPrefijo(prefijo);
        this.setCelular(celular);
    }

    public Usuario() {
    }

    // crear el identificador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 40, name = "nombre", nullable = false, unique = true)
    private String nombre;
    @Column(length = 15, name = "usuario", nullable = false, unique = false)
    private String usuario;
    @Column(length = 15, name = "clave", nullable = false, unique = true)
    private String clave;
    @Column(length = 20, name = "correo", nullable = false, unique = false)
    private String correo;
    @Column(length = 2, name = "prefijo", nullable = false, unique = false)
    private String prefijo;
    @Column(length = 10, name = "celular", nullable = false, unique = true)
    private String celular;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    // Creamos el toString
    @Override
    public String toString() {
        return "Usuario [celular=" + celular + ", clave=" + clave + ", correo=" + correo + ", id=" + id + ", nombre="
                + nombre + ", prefijo=" + prefijo + ", usuario=" + usuario + "]";
    }

    // HashCode nos permite asignar un unico espacio en memoria
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    // Equal nos permite ver si dos objetos de la misma clase son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
