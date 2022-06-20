package br.com.codandosimples;

import br.com.codandosimples.dao.DespesasDAO;

public class RemoverDespesa {
    public static void main(String[] args) {
        DespesasDAO dao = new DespesasDAO();
        dao.delete(2L);
    }
}
