package com.luke.forumhub.domain.user;

import com.luke.forumhub.domain.profile.Profile;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "users")
@Entity(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "profiles_id")
    private String profiles;
}
