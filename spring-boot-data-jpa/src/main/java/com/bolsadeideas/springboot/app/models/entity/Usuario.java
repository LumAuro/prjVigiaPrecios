package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, name = "nombre", nullable = false, unique = false)
    private String nombre;
    @Column(length = 20, name = "username", nullable = false, unique = true)
    private String username;
    @Column(length = 20, name = "password", nullable = false, unique = false)
    private String password;
    @Column(length = 20, name = "email", nullable = false, unique = false)
    private String email;
    @Column(length = 2, name = "prefijo", nullable = false, unique = false)
    private String prefijo;
    @Column(length = 10, name = "movil", nullable = false, unique = true)
    private String movil;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String username, String password, String email, String prefijo,
            String movil) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.email = email;
        this.prefijo = prefijo;
        this.movil = movil;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        return "Usuario [email=" + email + ", id=" + id + ", movil=" + movil + ", nombre=" + nombre + ", password="
                + password + ", prefijo=" + prefijo + ", username=" + username + "]";
    }

}
