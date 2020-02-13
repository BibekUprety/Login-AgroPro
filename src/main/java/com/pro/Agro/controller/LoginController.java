package com.pro.Agro.controller;

import com.pro.Agro.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getLoginForm(){
        return "login";

    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name = "loginForm")LoginForm loginForm, Model model){
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        System.out.println(username + password);
        if("bibek".equals(username)&& "123".equals(password)){
            return "home";
        }
        model.addAttribute("Invalid",true);
        return "login";


    }
}
