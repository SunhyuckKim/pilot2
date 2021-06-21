package microservices.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;

    @Column(length = 100, nullable = false)
    private String prodNm;

    @Builder
    public Products(Long prodId, String prodNm) {
        this.prodId = prodId;
        this.prodNm = prodNm;
    }
}
