package com.doutown.member.controller;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    //메퍼 의존성 주입
    private MemberMapper memberMapper;

    public MemberController(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @PostMapping("/users")
    public MemberDTO save(MemberDTO dto) {
        int affected = memberMapper.save(dto);
        return dto;
    }

}
