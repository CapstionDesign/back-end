package com.doutown.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/by-member-no/{memberNo}")
    public User getUserByMemberNo(@PathVariable Long memberNo) {
        return userService.getUserByMemberNo(memberNo);
    }

    @GetMapping("/by-member-name/{memberName}")
    public User getUserByMemberName(@PathVariable String memberName) {
        return userService.getUserByMemberName(memberName);
    }

}
