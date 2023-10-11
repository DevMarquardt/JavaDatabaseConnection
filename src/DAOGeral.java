import java.sql.*;
import java.util.*;

public abstract class DAOGeral<T, ID> implements ICrud<T, Integer> {
    protected Connection connection;
    protected String comandoSQL;
    private String tabela;

    public DAOGeral(String tabela) throws SQLException {
        this.connection = new ConexaoDataBase().conectar();
        this.tabela = tabela;
    }

    @Override
    public Set<T> buscarTodos() {
        return null;
    }

    @Override
    public void deletar(Integer id) {

    }

    @Override
    public T buscarUm(Integer id) {
        return null;
    }

    public String getComandoSQL() {
        return comandoSQL;
    }

    public void setComandoSQL(String comandoSQL) {
        this.comandoSQL = comandoSQL;
    }
}
