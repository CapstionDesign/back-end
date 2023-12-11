package com.doutown.clubmember.controller;

import com.doutown.clubmember.dto.ClubMemberDTO;
import com.doutown.clubmember.service.ClubMemberService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
@Api(tags = {"03.동아리 회원"}, description = "동아리 회원 관련 서비스")
public class ClubMemberController {

    ClubMemberService clubMemberService;

    public ClubMemberController(ClubMemberService clubMemberService) {
        this.clubMemberService = clubMemberService;
    }

    @GetMapping("/clubmembers")
    public List<ClubMemberDTO> find(){
        return clubMemberService.find();
    }

}
