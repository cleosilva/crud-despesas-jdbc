package br.com.codandosimples.dao;

import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesasDAO {
    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(long id);
    List<Despesa> findByCategoria(Categoria categoria);
}
