package xyz.twocucao.thanos.serivce;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import xyz.twocucao.thanos.domain.Post;
import xyz.twocucao.thanos.domain.User;
import xyz.twocucao.thanos.repository.PostRepository;
import xyz.twocucao.thanos.repository.UserRepository;

import java.util.List;

@Slf4j
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }


    public int findOneCoffee(String name) {
        log.info("User Found: {}", 1);
        return 1;
    }
}