package com.API.market.persistence.mapper;

import java.util.List;

import com.API.market.domain.Purchase;
import com.API.market.persistence.entity.Compra;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    
    @Mappings({
        @Mapping(target = "idCompra", source = "purchaseId"),
        @Mapping(target = "idCliente", source = "clientId"),
        @Mapping(target = "fecha", source = "date"),
        @Mapping(target = "medioPago", source = "paymentMethod"),
        @Mapping(target = "comentario", source = "comment"),
        @Mapping(target = "estado", source = "state"),
        @Mapping(target = "productos", source = "items")
    })
    Purchase toPurchase(Compra compra);

    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);

}
