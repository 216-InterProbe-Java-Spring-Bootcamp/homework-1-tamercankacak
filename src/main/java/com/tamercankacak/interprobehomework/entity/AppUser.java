package com.tamercankacak.interprobehomework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "app_user")
@Getter
@Setter
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(generator = "app_user")
    @SequenceGenerator(name = "app_user", sequenceName = "APP_USER_ID_SEQ")
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String surname;

    @Email
    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String phoneNumber;

}
