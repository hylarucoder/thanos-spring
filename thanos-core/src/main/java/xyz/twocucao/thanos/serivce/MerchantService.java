package xyz.twocucao.thanos.serivce;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.twocucao.thanos.domain.Merchant;
import xyz.twocucao.thanos.repository.MerchantRepository;

import javax.transaction.Transactional;

@Slf4j
@Service
@Transactional
public class MerchantService {
    @Autowired
    private MerchantRepository merchantRepository;

    public Merchant createMerchant(String mobile, String password) {
        val merchant = Merchant.builder()
                .mobile(mobile)
                .password(password)
                .build();
        val saved = merchantRepository.save(merchant);
        log.info("New Merchant: {}", saved);
        return saved;
    }

    public boolean updatePassword(Merchant merchant, String password) {

        merchant.setPassword(password);
        merchantRepository.save(merchant);
        log.info("Updated merchant: {}", merchant);
        return true;
    }
}