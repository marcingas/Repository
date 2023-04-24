package pl.marcin;

import pl.marcin.body.User;
import pl.marcin.repository.DefaultUserRepository;
import pl.marcin.service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService(new DefaultUserRepository());
        userService.createUser(1,"Jan",25,"user");
        userService.createUser(2,"Ola",25,"admin");
        userService.createUser(3,"Krzyś",25,"user");
        userService.updateUser(1,new User(1,"Paweł",12,"admin"));
        System.out.println(userService.getUserById(1));
        userService.deleteUser(1);
        System.out.println(userService.getAllUsers());

    }
}