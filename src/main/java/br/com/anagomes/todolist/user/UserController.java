package br.com.anagomes.todolist.user;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/user")
public class UserController{

    @AutoWired
    private UserRepository userRepository;


@PostMapping("/")


    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());
        
    }

}
