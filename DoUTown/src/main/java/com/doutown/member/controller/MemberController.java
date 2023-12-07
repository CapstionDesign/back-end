package com.doutown.member.controller;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import com.doutown.member.service.MemberService;
import com.doutown.student.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class MemberController {

    //생성자 주입
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //회원가입
    @PostMapping("/members")
    public MemberDTO save(@RequestBody MemberDTO dto) {
        dto = memberService.save(dto);
        return dto;
    }

    //회원 전체 목록 조회
    @GetMapping("/members")
    public List<MemberDTO> findAll() {
        return memberService.findAll();
    }

    //특정 회원 조회
    @GetMapping("/members/{memberNo}")
    public ResponseEntity<MemberDTO> getMemberByMemberName(@PathVariable Long memberNo) {
        return ResponseEntity.ok().header("Content-Type","application/json; charset=UTF-8").body(memberService.getMemberByNo(memberNo));
    }

    //학생 한명 조회
    @GetMapping("/members/students/{studentNo}")
    public ResponseEntity<StudentDTO> getStudentByStudentName(@PathVariable Long studentNo) {
        return ResponseEntity.ok().header("Content-Type","application/json; charset=UTF-8").body(memberService.getStudentByNo(studentNo));

    }

    //인증 회원 정보 수정
    @PutMapping("/members/{memberNo}")
    public ResponseEntity<MemberDTO> updateMember(@RequestBody MemberDTO dto, @PathVariable Long memberNo) {

        memberService.updateMember(memberNo);
        dto = memberService.getMemberByNo(memberNo);

        return ResponseEntity.ok().header("Content-Type","application/json; charset=UTF-8").body(dto);
    }

    //학생 전체 조회
    @GetMapping("/members/students")
    public List<StudentDTO> findStudentAll() {
        return memberService.findStudentAll();
    }




}
