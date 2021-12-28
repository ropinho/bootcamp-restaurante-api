package com.bootcamp.wave.g8.spring3exe1.restauranteapi.service;

import com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity.Mesa;
import com.bootcamp.wave.g8.spring3exe1.restauranteapi.repository.MesaRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class MesaService {
    private MesaRepository mesaRepository;

    public MesaService(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public Mesa buscaTodosItemPedidos(Long id) {
        Mesa mesa = null;
        try {
            mesa = this.mesaRepository.buscaUm(id);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        }
        return mesa;
    }

    public void salva(Mesa mesa) {
        this.mesaRepository.salva(mesa);
    }

}
