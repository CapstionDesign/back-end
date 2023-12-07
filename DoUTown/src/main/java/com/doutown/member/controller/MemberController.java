package com.doutown.member.controller;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import com.doutown.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class MemberController {

    //생성자 주입
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/members")
    public MemberDTO save(@RequestBody MemberDTO dto) {
        dto = memberService.save(dto);
        return dto;
    }

    @GetMapping("/members")
    public List<MemberDTO> findAll() {
        return memberService.findAll();
    }

    @GetMapping("/members/{memberNo}")
    public ResponseEntity<MemberDTO> getMemberByMemberName(@PathVariable Long memberNo) {
        return ResponseEntity.ok().body(memberService.getMemberByNo(memberNo));
    }

    @PutMapping("/members/{memberNo}")
    public ResponseEntity<MemberDTO> updateMember(@RequestBody MemberDTO dto, @PathVariable Long memberNo) {

        dto = memberService.getMemberByNo(memberNo);
        memberService.updateMember(memberNo);

        return ResponseEntity.ok().header("Content-Type","application/json; charset=UTF-8").body(dto);
    }

}
