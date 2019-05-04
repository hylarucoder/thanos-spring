package xyz.twocucao.thanos.app.merchant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant")
class MerchantController {

    @GetMapping("/{id}")
    public long getPerson(@PathVariable Long id) {
        return id;
    }
}