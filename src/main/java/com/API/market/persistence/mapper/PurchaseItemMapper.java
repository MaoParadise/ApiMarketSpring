package com.API.market.persistence.mapper;

import com.API.market.domain.PurchaseItem;
import com.API.market.persistence.entity.ComprasProducto;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
        @Mapping(target = "id.idProducto", source = "productId"),
        @Mapping(target = "cantidad", source = "quantity"),
        @Mapping(target = "estado", source = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "compra", ignore = true),
        @Mapping(target = "producto", ignore = true),
        @Mapping(target = "id.idCompra", ignore = true)
    })
    ComprasProducto toComprasProducto(PurchaseItem purchaseItem);
    
}
