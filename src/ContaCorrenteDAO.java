import java.sql.*;

public class ContaCorrenteDAO extends DAOGeral<ContaCorrente, Integer> {

    public ContaCorrenteDAO() throws SQLException {
        super("conta_corrente");
    }

    @Override
    public void inserir(ContaCorrente contaCorrente) {
        setComandoSQL("INSERT INTO conta_corrente VALUES(?, ?, ?);");
        try (PreparedStatement statement = connection.prepareStatement(getComandoSQL())) {
            statement.setInt(1, contaCorrente.getIdContaCorrente());
            statement.setDouble(2, contaCorrente.getLimite());
            statement.setInt(3, contaCorrente.getTotalTransacoes());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editar(ContaCorrente contaCorrente) {
        setComandoSQL("UPDATE conta_corrente SET limite = ?, total_transacoes = ? WHERE id_conta_corrente = ?");
        try (PreparedStatement statement = connection.prepareStatement(getComandoSQL())) {
            statement.setDouble(1, contaCorrente.getLimite());
            statement.setInt(2, contaCorrente.getTotalTransacoes());
            statement.setInt(3, contaCorrente.getIdContaCorrente());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
