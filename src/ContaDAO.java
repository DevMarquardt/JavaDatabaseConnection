import java.sql.*;

public class ContaDAO extends DAOGeral<Conta, Integer> {
    public ContaDAO() throws SQLException {
        super("contas");
    }

    @Override
    public void inserir(Conta conta) {
        setComandoSQL("INSERT INTO contas VALUES(?, ?, ?, ?);");
        try (PreparedStatement statement = connection.prepareStatement(getComandoSQL())) {
            statement.setInt(1, conta.getId());
            statement.setString(2, conta.getNome());
            statement.setDouble(3, conta.getSaldo());
            try {
                statement.setInt(4, conta.getContaCorrente().getIdContaCorrente());
            } catch (NullPointerException e) {
                statement.setNull(4, 0);
            }
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editar(Conta conta) {
        setComandoSQL("UPDATE contas SET nome = ?, saldo = ? WHERE id_conta = ?");
        try (PreparedStatement statement = connection.prepareStatement(getComandoSQL())) {
            statement.setString(1, conta.getNome());
            statement.setDouble(2, conta.getSaldo());
            statement.setInt(3, conta.getId());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
