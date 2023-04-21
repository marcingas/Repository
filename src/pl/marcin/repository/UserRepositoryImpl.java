package pl.marcin.repository;

import pl.marcin.body.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    public List<User>list = new ArrayList<>();
    @Override
    public void save(User user) {
        list.add(user);
    }

    @Override
    public void delete(int id) {

        for(Iterator<User> iterator = list.iterator(); iterator.hasNext();) {
            User user = iterator.next();
            if(user.getId()==id){
                iterator.remove();
            }
        }


    }

    @Override
    public void update(int id,User user) {
        for(var element : list){
            if(element.getId()==id){
                list.set(list.indexOf(element),user);
            }
        }
    }

    @Override
    public User findById(int id) {
        for (var element : list) {
            if (element.getId() == id) {
                return element;
            } else {
                throw new RuntimeException("there is no user with id " + id);
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return list;
    }
}
