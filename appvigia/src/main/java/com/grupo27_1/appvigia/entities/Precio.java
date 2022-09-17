package com.grupo27_1.appvigia.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(schema = "vigia_precio", name = "precios")
public class Precio {

    public Precio() {
    }

    public Precio(long idproducto, long idtienda, long idusuario, long precio, Date intante) {
        this.setIdproducto(idproducto);
        this.setIdtienda(idtienda);
        this.setIdusuario(idusuario);
        this.setPrecio(precio);
        this.setIntante(intante);
    }

    // crear el identificador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "`id_productos_producto`", nullable = false, unique = true)
    private long idproducto;
    @Column(name = "`id_tiendas_tienda`", nullable = false, unique = true)
    private long idtienda;
    @Column(name = "`id_usuarios_usuario`", nullable = false, unique = true)
    private long idusuario;
    @Column(name = "`precio`", nullable = false, unique = true)
    private long precio;
    private Date intante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(long idproducto) {
        this.idproducto = idproducto;
    }

    public long getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(long idtienda) {
        this.idtienda = idtienda;
    }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public Date getIntante() {
        return intante;
    }

    public void setIntante(Date intante) {
        this.intante = intante;
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
        Precio other = (Precio) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Precio [id=" + id + ", idproducto=" + idproducto + ", idtienda=" + idtienda + ", idusuario=" + idusuario
                + ", intante=" + intante + ", precio=" + precio + "]";
    }

}
