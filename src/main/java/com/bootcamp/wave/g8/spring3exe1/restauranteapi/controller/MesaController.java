package com.bootcamp.wave.g8.spring3exe1.restauranteapi.controller;

import com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity.Mesa;
import com.bootcamp.wave.g8.spring3exe1.restauranteapi.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mesa")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }

    @GetMapping("/busca/{id}")
    public ResponseEntity<Mesa> buscaUm(@PathVariable Long id) {
        return ResponseEntity.ok(mesaService.buscaTodosItemPedidos(id));
    }

    @PostMapping("/create")
    public void salva(@RequestBody Mesa mesa) {
        this.mesaService.salva(mesa);
    }
}
