package com.spring.market.persistence;

import java.util.List;
import java.util.Optional;

import com.spring.market.persistence.crud.ProductoCrudRepository;
import com.spring.market.persistence.entity.Producto;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(Integer idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(Integer cantidadStock, Boolean estado) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, true);
    }

    public Optional<Producto> getProducto(Integer idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(Integer idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }


}
