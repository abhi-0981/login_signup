package com.chatApp.chat.app.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity(name = "User")
@Data
@NoArgsConstructor
public class SignupUser {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @Column(unique = true)
    private String email ;

    @NonNull
    private String Username;
    @NonNull
    private String password ;
    @NonNull
    private int mobileNumber  ;

}
