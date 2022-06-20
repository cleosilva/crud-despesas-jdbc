package br.com.codandosimples;

import br.com.codandosimples.dao.DespesasDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        DespesasDAO dao = new DespesasDAO();
//        List<Despesa> despesas = dao.findAll();
//
//        for (Despesa despesa: despesas) {
//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descrição: " + despesa.getDescricao());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("**********************************");
//        }
        Optional<Despesa> despesaOptional =  dao.findById(2L);
        despesaOptional.ifPresent(despesa -> {
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Valor: " + despesa.getValor());
        });
    }

}
