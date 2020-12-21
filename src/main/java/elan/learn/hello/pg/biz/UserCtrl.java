package elan.learn.hello.pg.biz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserCtrl {
    private final UserRepo userRepo;

    public UserCtrl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("list")
    public List<UserEntity> list(){
        return userRepo.findAll();
    }
}
