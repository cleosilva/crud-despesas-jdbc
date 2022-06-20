package br.com.codandosimples;

import br.com.codandosimples.dao.DespesasDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {

        DespesasDAO dao = new DespesasDAO();

        Despesa despesa = new Despesa();
        despesa.setDescricao("Pagamento do aluguel");
        despesa.setCategoria(Categoria.MORADIA);
        despesa.setValor(1200);
        despesa.setData(LocalDate.of(2022, 6, 19));

        dao.save(despesa);
    }
}
