package xyz.twocucao.thanos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.twocucao.thanos.domain.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}