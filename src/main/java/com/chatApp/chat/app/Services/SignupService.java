package com.chatApp.chat.app.Services;

import com.chatApp.chat.app.Entity.SignupUser;
import com.chatApp.chat.app.Repository.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignupService {

     @Autowired
    private Signup signup ;

     public SignupUser CreateUser(SignupUser user){
         return signup.save(user);
     }


}
