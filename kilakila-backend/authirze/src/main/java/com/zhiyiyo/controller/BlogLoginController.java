package com.zhiyiyo.controller;

import com.zhiyiyo.domain.ResponseResult;
import com.zhiyiyo.domain.dto.LoginUserDTO;
import com.zhiyiyo.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BlogLoginController {
    @Autowired
    private BlogLoginService blogLoginService;

    // dzl 1234
    @PostMapping("/login")
    public ResponseResult login(@Valid @RequestBody LoginUserDTO user) {
        return blogLoginService.login(user);
    }

    @PostMapping("/logout")
    public ResponseResult logout(){
        return blogLoginService.logout();
    }
}
