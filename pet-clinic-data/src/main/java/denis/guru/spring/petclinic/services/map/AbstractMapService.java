package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.BaseEntity;

import java.util.*;

public class AbstractMapService <T extends BaseEntity,ID>  {

    protected Map<Long,T> map = new HashMap<>();

    Set<T> findALL(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if (object!=null){
            if(object.getId() == null){
                object.setId(getNextId());
            }

            map.put(object.getId(),object);
        } else{
            throw new RuntimeException();
        }
        return object;
    }

    void deleteByID(ID id ){
        map.remove(id);
    }
    void delete (T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
                }catch(NoSuchElementException e){
            nextId =1L;
        }
        return nextId;
    }
}
