package startSpring.startSpring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import startSpring.startSpring.user.repository.entity.User;
import startSpring.startSpring.user.repository.entity.UserRepository;

@SpringBootTest
public class user {

    private UserRepository userRepository;

    @Test
    public void crudTest(){
        User user = User.builder()
                .id("확인")
                .name("안녕하세요")
                .age(22)
                .build();
        //create test
        userRepository.save(user);
    }

}
