package pl.marcin.repository;

import pl.marcin.body.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    void delete(int id);
    void update(int id,User user);
    User findById(int id);
    List<User>findAll();

}
