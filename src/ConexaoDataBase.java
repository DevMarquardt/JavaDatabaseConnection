import java.sql.*;

public class ConexaoDataBase {
    private final String URL_BANCO = "jdbc:mysql://localhost:3306/banco";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL_BANCO, USERNAME, PASSWORD);
    }
}
