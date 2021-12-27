package com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Mesa {
    private Long id;
    private List<Pedido> listaDePedidos;
    private Double valorTotal;
}
