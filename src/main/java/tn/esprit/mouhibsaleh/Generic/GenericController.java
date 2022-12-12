package tn.esprit.mouhibsaleh.Generic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class GenericController <T,ID> {
    @Autowired
    private GenericImplementation<T,ID> GenericService;
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public T save(@RequestBody T t) throws Exception {
        T Response = (T) GenericService.save(t);
        return Response;
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<T> RetrieveAll() {
        try {
            return GenericService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable ID id) {
        try {
            GenericService.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public T update(@RequestBody T t) throws Exception {
        return GenericService.update(t);
    }
}
