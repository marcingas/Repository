package pl.marcin.repository;

import pl.marcin.body.User;

import java.util.List;

public interface UserRepository {
    void save(User newUser);

    void delete(int userId);

    void update(int userId, User user);

    User findById(int userId);

    List<User> findAll();

}
