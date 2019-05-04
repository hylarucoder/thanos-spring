package xyz.twocucao.thanos.domain;

import lombok.*;
import org.hibernate.annotations.Type;
import org.joda.money.Money;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "admin_staff")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class AdminStaff extends BaseEntity implements Serializable {
    private String mobile;
    private String password;
}
