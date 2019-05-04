package xyz.twocucao.thanos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.twocucao.thanos.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}