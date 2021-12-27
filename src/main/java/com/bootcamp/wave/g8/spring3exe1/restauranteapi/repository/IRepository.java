package com.bootcamp.wave.g8.spring3exe1.restauranteapi.repository;

import java.util.List;

public interface IRepository<T> {
    void salva(T t);
    T buscaUm(Long id);
    List<T> buscaTodos();
    void deleta(Long id);
}
