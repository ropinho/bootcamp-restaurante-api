package com.bootcamp.wave.g8.spring3exe1.restauranteapi.repository;

import com.bootcamp.wave.g8.spring3exe1.restauranteapi.entity.Pedido;

import java.util.List;


public class PedidoRepository implements IRepository<Pedido> {
    private List<Pedido> listaDePedido;


    @Override
    public void salva(Pedido pedido) {
        this.listaDePedido.add(pedido);

    }

    @Override
    public Pedido buscaUm(Long id) {
        return this.listaDePedido.stream().filter(pedido -> pedido.getId() == id).findFirst().get();
    }

    @Override
    public List<Pedido> buscaTodos() {
        return this.listaDePedido;
    }

    @Override
    public void atualiza(Long id, Pedido pedido) {
        Pedido p = this.buscaUm(id);
        p.setMesa(pedido.getMesa());
        p.setListaDePratos(pedido.getListaDePratos());
        p.setValorTotal(pedido.getValorTotal());
    }

    @Override
    public void deleta(Long id) {
        this.listaDePedido.removeIf(pedido -> pedido.getId() == id);

    }
}


