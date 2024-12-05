package com.chatApp.chat.app.Controller;

import com.chatApp.chat.app.Entity.SignupUser;
import com.chatApp.chat.app.Repository.Signup;
import com.chatApp.chat.app.Services.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("pages")
public class SignupController {

    @Autowired
     private SignupService signupService1  ;

     @GetMapping("/Signup")
     public String CreateUser(Model model){
         model.addAttribute("title" , "Abhishek's Navbar");
         model.addAttribute("SignupData" , new SignupUser());
     return "signup";
     }

     @PostMapping("/success")
     public String saveDataToDatabase(@ModelAttribute("SignupData") SignupUser RecivingUser ){
         signupService1.CreateUser(RecivingUser);
         return "home" ;
     }



}
