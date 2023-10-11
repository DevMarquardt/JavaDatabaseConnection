import java.util.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {

            ICrud<ContaCorrente, Integer> crudContaCorrente = new ContaCorrenteDAO();
            ICrud<Conta, Integer> crudConta = new ContaDAO();

            ContaCorrente contaCorrente = new ContaCorrente(5,5,5);

            Conta conta1 = new Conta(3,"Usuario teste2",1);
            Conta conta = new Conta(3,"Usuario teste2",1, contaCorrente);

            crudConta.inserir(conta);
            crudConta.inserir(conta1);

//            crudContaCorrente.editar(contaCorrente);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
