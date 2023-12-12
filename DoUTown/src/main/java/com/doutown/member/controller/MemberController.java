package com.doutown.member.controller;

import com.doutown.member.dto.MemberDTO;
import com.doutown.member.service.MemberService;
import com.doutown.member.dto.StudentDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:8080")
@Api(tags = {"01.회원 및 학생"}, description = "회원 관련 서비스")
public class MemberController {

    //생성자 주입
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //회원 전체 목록 조회
    @GetMapping("/members")
    @ApiOperation(value = "회원 전체 전체 조회", notes = "일반 및 학생 회원 모두 조회")
    public List<MemberDTO> findMemberAll() {

        return memberService.findMemberAll();
    }

    //특정 회원 조회
    @GetMapping("/members/{memberNo}")
    @ApiOperation(value = "회원 번호로 회원 상세 조회", notes = "")
    public ResponseEntity<MemberDTO> getMemberByMemberName(@PathVariable Long memberNo) {
        return ResponseEntity.ok().header("Content-Type","application/json; charset=UTF-8").body(memberService.findMemberByNo(memberNo));
    }

    //학생 회원 전체 목록 조회
    @GetMapping("/members/students")
    @ApiOperation(value = "학생 회원 전체 조회", notes = "인증된 학생 전체 조회")
    public List<MemberDTO> findStudentAll() {
        return memberService.findStudentAll();
    }

    //학생 한번 목록 조회
    @GetMapping("/members/students/{memberNo}")
    @ApiOperation(value = "학생 회원 번호로 상세 조회", notes = "인증된 학생 한명 조회")
    public MemberDTO findStudentByNo(@PathVariable Long memberNo) {
        return memberService.findStudentByNo(memberNo);
    }

    //회원가입
    @PostMapping("/members")
    @ApiOperation(value = "회원가입")
    public ResponseEntity<MemberDTO> save(@RequestBody MemberDTO dto) {
        memberService.saveMember(dto);
        dto = memberService.findMemberByName(dto.getMemberName());
        return ResponseEntity.ok().header("Content-Type", "application/json").body(dto);
    }

    //인증 후 학생 테이블에 등록
    @PostMapping("/members/students/{memberNo}")
    @ApiOperation(value = "인증된 회원 정보를 학생으로 등록")
    public ResponseEntity<MemberDTO> insertStudent(@PathVariable Long memberNo, @ModelAttribute StudentDTO dto) {


        System.out.println("ddddddddd");
        int affected = 0;

        affected = memberService.saveStudent(dto);

        MemberDTO memberDTO = new MemberDTO();

        memberDTO =  memberService.findStudentByNo(dto.getMemberNo());

        return ResponseEntity.ok().header("Content-Type", "application/json").body(memberDTO);
    }



    //인증 회원 정보 수정
    @PutMapping("/members/{memberNo}")
    @ApiOperation(value = "인증된 회원의 상태 업데이트")
    public int updateMember(/*@RequestBody MemberDTO dto,*/ @PathVariable Long memberNo) {

        int affected = 0;
        affected = memberService.updateMember(memberNo);
        return affected;
    }


}
