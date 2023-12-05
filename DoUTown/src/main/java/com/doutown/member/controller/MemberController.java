package com.doutown.member.controller;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class MemberController {

    //생성자 주입
    private MemberMapper memberMapper;

    @Autowired
    public MemberController(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @PostMapping("/members")
    @Transactional
    public MemberDTO save(@RequestBody MemberDTO dto) {
        int affected = memberMapper.save(dto);
        return dto;
    }

    @GetMapping("/members")
    public List<MemberDTO> findAll() {
        return memberMapper.find();
    }
    @GetMapping("/members/{memberNo}")
    public MemberDTO getMemberByMemberName(@PathVariable Long memberNo) {
        return memberMapper.findByNo(memberNo);
    }

    @DeleteMapping("/members/{memberNo}")
    @Transactional
    public ResponseEntity<MemberDTO> removeMember(@PathVariable Long memberNo) {
        MemberDTO memberDTO = memberMapper.findByNo(memberNo);
        String memberName = memberDTO.getMemberName();
        memberMapper.deleteMember(memberName);
        return ResponseEntity.ok().header("Content-Type", "application/json; charset=UTF-8").body(memberDTO);
    }

    @PutMapping("/members/{memberNo}")
    public ResponseEntity<MemberDTO> updateMember(@RequestBody MemberDTO dto, @PathVariable Long memberNo) {

        dto = memberMapper.findByNo(memberNo);
        memberMapper.updateMember(dto);

        return ResponseEntity.ok().header("Content-Type","application/json; charset=UTF-8").body(dto);
    }

}
