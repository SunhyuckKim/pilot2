package microservices.core.web.dto;

import lombok.Getter;
import microservices.core.domain.Products;

@Getter
public class ProductsResponseDto {
    private Long prodId;
    private String prodNm;

    public ProductsResponseDto(Products entity) {
        //this.id = entity.getId();
        this.prodId = entity.getProdId();
        this.prodNm = entity.getProdNm();
    }
}
