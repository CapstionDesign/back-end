package com.doutown.clubmember.controller;

import com.doutown.clubmember.dto.ClubMemberDTO;
import com.doutown.clubmember.service.ClubMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/clubmembers/{clubNo}")
    @ApiOperation(value = "동아리 회원 전체 전체 조회")
    public List<ClubMemberDTO> find(@PathVariable Long clubNo){
        return clubMemberService.find(clubNo);
    }

    @PostMapping("/clubmembers")
    @ApiOperation(value = "동아리 신청")
    public int save(ClubMemberDTO dto){
        return clubMemberService.save(dto);
    }

    @PutMapping("/clubmembers/{studentNo}")
    @ApiOperation(value = "동아리 가입 승인")
    public int update(@PathVariable Long studentNo) {
        return clubMemberService.update(studentNo);
    }


}
