package pl.marcin.repository;

import pl.marcin.body.User;

import java.util.ArrayList;

import java.util.List;

public class DefaultUserRepository implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public void save(User newUser) {
        users.add(newUser);
    }

    @Override
    public void delete(int userId) {
        users.removeIf(e -> e.getId() == userId);
    }

    @Override
    public void update(int userId, User user) {
        for (var element : users) {
            if (element.getId() == userId) {
                users.set(users.indexOf(element), user);
            }
        }
    }

    @Override
    public User findById(int userId) {
        for (var element : users) {
            if (element.getId() == userId) {
                return element;
            } else {
                throw new RuntimeException("there is no user with id " + userId);
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
