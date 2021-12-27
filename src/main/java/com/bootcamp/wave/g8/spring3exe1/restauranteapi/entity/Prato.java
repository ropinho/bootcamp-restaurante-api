package com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Prato {
    private Long id;
    private Double price;
    private String descricao;
    private Integer quantidade;
}
