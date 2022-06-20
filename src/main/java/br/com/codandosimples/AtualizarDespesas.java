package br.com.codandosimples;

import br.com.codandosimples.dao.DespesasDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesas {
    public static void main(String[] args) {

        DespesasDAO dao = new DespesasDAO();

        Optional<Despesa>  despesaOptional = dao.findById(3L);

        Despesa despesa = despesaOptional.get();

        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

        despesa.setDescricao("Ração para gatos");
        despesa.setData(LocalDate.of(2022, 6, 15));
        despesa.setValor(53);
        despesa.setCategoria(Categoria.OUTROS);

        dao.update(despesa);
    }
}
