package com.grupo27_1.appvigia.entities;

import javax.persistence.*;

@Entity
@Table(schema = "vigia_precio", name = "productos")
public class Producto {

    public Producto() {
    }

    public Producto(String nombre, String marca, String descripcion, String ean) {
        this.setNombre(nombre);
        this.setMarca(marca);
        this.setDescripcion(descripcion);
        this.setEan(ean);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 40, name = "producto", nullable = false, unique = false)
    private String nombre;
    @Column(length = 40, name = "marca", nullable = false, unique = true)
    private String marca;
    @Column(length = 80, name = "descripcion", nullable = false, unique = false)
    private String descripcion;
    @Column(length = 40, name = "ean13", nullable = false, unique = false)
    private String ean;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [descripcion=" + descripcion + ", ean=" + ean + ", id=" + id + ", marca=" + marca + ", nombre="
                + nombre + "]";
    }

}
