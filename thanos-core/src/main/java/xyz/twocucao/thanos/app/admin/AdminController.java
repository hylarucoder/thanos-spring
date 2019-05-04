package xyz.twocucao.thanos.app.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/{id}")
    public long getPerson(@PathVariable Long id) {
        return id;
    }

    @GetMapping("/2")
    public long getP(@PathVariable Long id) {
        return id;
    }
}
