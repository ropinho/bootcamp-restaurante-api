package com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Caixa {
    private Double saldo;
}
