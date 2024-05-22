package hei.school.resto.operation.automatisation;

import java.util.List;

public interface CrudOperation<D, ID> {
    List<D> findAll();
    D getById(ID id);
    D save(D toSave);
    D deleteById(ID id);
    D updateById(ID id);
}
