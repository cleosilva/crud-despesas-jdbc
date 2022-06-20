package br.com.codandosimples;

import br.com.codandosimples.dao.DespesasDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {

        DespesasDAO dao = new DespesasDAO();

        Despesa despesa = new Despesa();
        despesa.setDescricao("Hortifruti");
        despesa.setCategoria(Categoria.ALIMENTACAO);
        despesa.setValor(50);
        despesa.setData(LocalDate.of(2022, 6, 20));

        Despesa despesaInserida = dao.save(despesa);
        System.out.println("Foi inserida a despesa com id: " + despesaInserida.getId());
    }
}
