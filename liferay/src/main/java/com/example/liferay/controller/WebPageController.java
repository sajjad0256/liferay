package com.example.liferay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPageController {

    @GetMapping("/user/list")
    public String userListPage() {
        return "user/list"; // نام view برای صفحه کاربران
    }

    @GetMapping("/article/list")
    public String articleListPage() {
        return "article/list"; // نام view برای صفحه مقالات
    }

}
