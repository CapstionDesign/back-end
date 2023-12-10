package com.doutown.clubmember.controller;

import com.doutown.clubmember.service.ClubMemberService;
import org.springframework.stereotype.Controller;

@Controller
public class ClubMemberController {

    ClubMemberService clubMemberService;

    public ClubMemberController(ClubMemberService clubMemberService) {
        this.clubMemberService = clubMemberService;
    }

}
