package com.bootcamp.wave.g8.spring3exe1.restauranteapi.repository;

import com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity.Mesa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MesaRepository implements IRepository<Mesa>{

    private List<Mesa> mesas = new ArrayList<>();

    @Override
    public void salva(Mesa mesa) {
        this.mesas.add(mesa);
    }

    @Override
    public Mesa buscaUm(Long id) {
        return this.mesas.stream().filter(mesa -> mesa.getId() == id).findFirst().get();
    }

    @Override
    public List<Mesa> buscaTodos() {
        return this.mesas;
    }

    @Override
    public void atualiza(Long id, Mesa mesa) {
        Mesa p = this.buscaUm(id);
        p.setListaDePedidos(mesa.getListaDePedidos());
        p.setValorTotal(mesa.getValorTotal());
    }

    @Override
    public void deleta(Long id) {
        this.mesas.removeIf(mesa -> mesa.getId() == id);
    }
}
