package xyz.twocucao.thanos.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "blog_post")
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post extends BaseEntity implements Serializable {
    private String mobile;
    private String password;
}
