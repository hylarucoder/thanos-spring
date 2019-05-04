package xyz.twocucao.thanos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.twocucao.thanos.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}