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

public class Pedido {
    private Long id;
    private String mesa;
    private List<Prato> listaDePratos;
    private Double valorTotal;

}
