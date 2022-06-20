package br.com.codandosimples.dao;

import br.com.codandosimples.infra.ConnectionFactory;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class DespesasDAO implements IDespesasDAO{
    @Override
    public Despesa save(Despesa despesa) {

        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO Despesas ( descricao, valor, data, categoria) VALUES (?, ?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3,java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4,despesa.getCategoria().toString());

            preparedStatement.executeUpdate();

            // Recuperando id do banco de dados
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            long generatedId = resultSet.getLong("id");
            despesa.setId(generatedId);

        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return despesa;
    }

    @Override
    public Despesa update(Despesa despesa) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Despesa> findAll() {
        return null;
    }

    @Override
    public Optional<Despesa> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Despesa> findByCategoria(Categoria categoria) {
        return null;
    }

}
