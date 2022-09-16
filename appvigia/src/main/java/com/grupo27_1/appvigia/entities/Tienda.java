package com.grupo27_1.appvigia.entities;

//primero importamos java.persistencia

import javax.persistence.*;

@Entity
@Table(schema = "vigia_precio", name = "tiendas")
public class Tienda {

    public Tienda() {
    }

    public Tienda(String nombre, String direccion, long longitud, long latitud) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setLongitud(longitud);
        this.setLatitud(latitud);
    }

    // crear el identificador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 40, name = "nombre", nullable = false, unique = true)
    private String nombre;
    @Column(length = 40, name = "direccion", nullable = false, unique = true)
    private String direccion;
    @Column(name = "longitud", nullable = false, unique = true)
    private long longitud;
    @Column(name = "latitud", nullable = false, unique = true)
    private long latitud;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public long getLatitud() {
        return latitud;
    }

    public void setLatitud(long latitud) {
        this.latitud = latitud;
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
        Tienda other = (Tienda) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tienda [direccion=" + direccion + ", id=" + id + ", latitud=" + latitud + ", longitud=" + longitud
                + ", nombre=" + nombre + "]";
    }

}
