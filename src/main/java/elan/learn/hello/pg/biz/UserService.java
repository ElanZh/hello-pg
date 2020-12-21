package elan.learn.hello.pg.biz;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public UserEntity addNew(UserEntity user){
        return userRepo.saveAndFlush(user);
    }
}
