package microservices.core.web;

import lombok.RequiredArgsConstructor;
import microservices.core.service.ProductsService;
import microservices.core.web.dto.ProductsResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductsService productsService;

    @GetMapping("/api/v1/products/{id}") //조회
    public ProductsResponseDto findById (@PathVariable Long id) {
        return productsService.findById(id);
    }

}
