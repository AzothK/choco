package com.market.choco.controller;

import com.market.choco.domain.User;
import com.market.choco.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/join")
    public String createForm(Model model){
        model.addAttribute("userForm", new UserForm());
        return "exampleUserForm";
    }

    @PostMapping("/users/join")
    public String joinUser(UserForm form){
        String userEmail = form.getUserEmail();
        String userPwd = form.getUserPwd();
        String userNickName = form.getUserNickName();

        User user = new User();
        user.setUserEmail(userEmail);
        user.setUserPwd(userPwd);
        user.setUserNickName(userNickName);

        userService.join(user);
        return "exampleUserSuccess";
    }

}
