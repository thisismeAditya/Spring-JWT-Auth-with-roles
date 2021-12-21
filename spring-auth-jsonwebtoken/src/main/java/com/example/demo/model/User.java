package com.example.demo.model;

import com.example.demo.audit.DateAudit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor @Getter @Setter
@Entity @Table(name = "users")
public class User extends DateAudit {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank @Size(min = 2, max = 30, message = "At least 2 characters required!")
    private String username;

    @NotBlank @Size(min = 2, max = 30, message = "At least 2 characters required!")
    @Email @NaturalId
    private String email;

    @NotBlank @Size(min = 4, max = 120, message = "At least 4 characters required!")
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
