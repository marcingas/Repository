package pl.marcin.repository;

import pl.marcin.body.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    public List<User>list = new ArrayList<>();
    @Override
    public void save(User user) {
        list.add(user);
    }

    @Override
    public void delete(int id) {
        for(var element : list){
            if(element.getId()==id){
                list.remove(element);
            }
        }
    }

    @Override
    public void update(int id,User user) {
        for(var element : list){
            if(element.getId()==id){
                element = user;
            }
        }
    }

    @Override
    public User findById(int id) {
        User user = new User();
        for (var element : list) {
            if (element.getId() == id) {
                user = element;
            } else {
                throw new RuntimeException("there is no user with id " + id);
            }
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return list;
    }
}
