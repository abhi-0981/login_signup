package com.chatApp.chat.app.Repository;


import com.chatApp.chat.app.Entity.SignupUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface Signup extends JpaRepository<SignupUser, String> {

}
