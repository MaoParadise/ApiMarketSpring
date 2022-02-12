package com.spring.market.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.spring.market.persistence.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //@Query(value = "SELECT * FROM PRODUCTOS WHERE id_categoria = ?1", nativeQuery = true)
    
    List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock, Boolean estado);
    
}
