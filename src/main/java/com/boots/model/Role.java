package com.boots.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", unique = true, length = 100)
    private String name;
    @Override
    public String getAuthority() {

        return getName();
    }
    @Override
    public String toString() {
        return name.replace("ROLE_", "");
    }
}