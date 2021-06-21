package microservices.core.service;

import lombok.RequiredArgsConstructor;
import microservices.core.domain.Products;
import microservices.core.domain.ProductsRepository;
import microservices.core.web.dto.ProductsResponseDto;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsResponseDto findById(Long prodId) {
        Products entity = productsRepository.findById(prodId).orElseThrow(() -> new IllegalArgumentException("해당 서비스가 없습니다. id=" + prodId));

        return new ProductsResponseDto(entity);
    }
}
