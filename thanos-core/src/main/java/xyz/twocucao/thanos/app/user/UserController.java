package xyz.twocucao.thanos.app.user;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.twocucao.thanos.domain.Post;
import xyz.twocucao.thanos.repository.PostRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/resource")
    public Map<String, Object> home() {
        val model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID());
        model.put("content", "hello world");
        return model;
    }

    @RequestMapping("/1")
    public Map<String, Object> re() {
        val model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID());
        model.put("content", "hello world");
        return model;
    }

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> queryPosts() {
        return postRepository.findAll();
    }
}
