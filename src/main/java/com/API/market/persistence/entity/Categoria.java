package com.API.market.persistence.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "	CATEGORIAS")
public class Categoria {
    
    @Id // Indica que es el identificador de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // si la tabla tiene un campo autoincrementable
    @Column(name = "id_categoria") // Nombre de la columna en la tabla
    private Integer idCategoria;

    private String descripcion;

    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    //
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    

}
