package elan.learn.hello.pg.biz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void addNew(){
        HashMap<String, String> map = new HashMap<>();
        map.put("历史类", "资治通鉴");
        map.put("小说类", "阿Q正传");
        map.put("科幻类", "银河漫游指南");
        UserEntity user = UserEntity.builder()
                .name("张一然")
                .book(map)
                .build();
        userService.addNew(user);
    }
}