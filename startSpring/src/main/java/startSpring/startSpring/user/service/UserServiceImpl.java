package startSpring.startSpring.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startSpring.startSpring.user.repository.entity.User;
import startSpring.startSpring.user.repository.entity.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String join(String id, String name, int age) {
        User user = User.builder()
                .id(id)
                .name(name)
                .age(age)
                .build();
        userRepository.save(user);
        return "성공";
    }
}
