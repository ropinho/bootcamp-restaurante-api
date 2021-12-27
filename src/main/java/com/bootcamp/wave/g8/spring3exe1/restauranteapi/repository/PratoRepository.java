package com.bootcamp.wave.g8.spring3exe1.restauranteapi.repository;

import com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity.Prato;

import java.util.ArrayList;
import java.util.List;

public class PratoRepository implements IRepository<Prato> {

    private List<Prato> pratos = new ArrayList<>();

    @Override
    public void salva(Prato prato) {
        this.pratos.add(prato);
    }

    @Override
    public Prato buscaUm(Long id) {
        return this.pratos.stream().filter(prato -> prato.getId() == id).findFirst().get();
    }

    @Override
    public List<Prato> buscaTodos() {
        return this.pratos;
    }

    @Override
    public void atualiza(Long id, Prato prato) {
        Prato p = this.buscaUm(id);
        p.setDescricao(prato.getDescricao());
        p.setPrice(prato.getPrice());
        p.setQuantidade(prato.getQuantidade());
    }

    @Override
    public void deleta(Long id) {
        this.pratos.removeIf(prato -> prato.getId() == id);
    }
}
