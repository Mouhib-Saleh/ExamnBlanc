package tn.esprit.mouhibsaleh.Generic;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class GenericImplementation<T,ID> implements GenericInterface<T,ID> {
    @Autowired
    public GenericRepository<T,ID> Genericrepo;

    @Override
    public List<T> findAll() throws Exception {
        try {
            return (List<T>) Genericrepo.findAll();
        } catch (Exception err) {
            System.out.println("Un erreur survenue : "+err);
        }
        return null;
    }
    @Override
    public T save(T entity) throws Exception {
        try {
            return Genericrepo.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(ID id) throws Exception {
        try {
            Genericrepo.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }


    @Override
    public T retrieve(ID id) throws Exception {
        T res=Genericrepo.findById(id).orElse(null);
        try {
            return res;
        } catch (Exception err) {
            System.out.println("Un erreur survenue"+ err);
        }
        return null;
    }

    @Override
    public T update(T entity) throws Exception {
        try {
            return Genericrepo.save(entity);
        } catch (Exception err1) {
            System.out.println("Une erreur survenue"+err1);
        }
        return entity;
    }
}
