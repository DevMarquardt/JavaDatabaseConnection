import java.util.*;

public interface ICrud<T, ID> {

    void inserir(T object);

    void deletar(ID id);

    T buscarUm(ID id);

    Set<T> buscarTodos();

    void editar(T obj);
}