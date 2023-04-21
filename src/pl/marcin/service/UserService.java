package pl.marcin.service;

import pl.marcin.body.User;
import pl.marcin.repository.UserRepository;
import pl.marcin.repository.UserRepositoryImpl;

import java.util.List;

public class UserService {
   private UserRepositoryImpl uRepository;

    public UserService(UserRepositoryImpl uRepository) {
        this.uRepository = uRepository;
    }

    public void createUser(int id, String name, int age, String role){
       User user = new User(id,name,age,role);
       uRepository.save(user);
   }
   public void updateUser(int id, User user){
       uRepository.update(id,user);
   }
   public void deleteUser(int id){
       uRepository.delete(id);
   }

   public List<User>getAllUsers(){
       return uRepository.findAll();
   }
   public User getUserById(int id){
       return uRepository.findById(id);

   }


}
