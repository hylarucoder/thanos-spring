package xyz.twocucao.thanos.serivce;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.twocucao.thanos.domain.User;
import xyz.twocucao.thanos.repository.UserRepository;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createMerchant(String mobile, String password) {
        val user = User.builder()
                .mobile(mobile)
                .password(password)
                .build();
        val saved = userRepository.save(user);
        log.info("New User: {}", saved);
        return saved;
    }

    public boolean updatePassword(User user, String password) {

        user.setPassword(password);
        userRepository.save(user);
        log.info("Updated user: {}", user);
        return true;
    }
}