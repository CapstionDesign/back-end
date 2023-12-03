package com.doutown.member.controller;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    //메퍼 의존성 주입
    private MemberMapper memberMapper;

    @Autowired
    public MemberController(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @PostMapping("/members")
    public MemberDTO save(@RequestBody MemberDTO dto) {
        int affected = memberMapper.save(dto);
        System.out.println(affected);
        return dto;
    }

}
