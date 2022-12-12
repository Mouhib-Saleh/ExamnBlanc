package tn.esprit.mouhibsaleh.Generic;
import java.util.List;
public interface  GenericInterface<T,ID> {
    List<T> findAll() throws Exception;
    T save(T entity) throws Exception;
    void delete(ID id) throws Exception;
    T retrieve (ID id) throws Exception;
    T update (T entity) throws Exception;

}
