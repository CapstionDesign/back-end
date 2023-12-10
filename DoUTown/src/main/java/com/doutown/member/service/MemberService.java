package com.doutown.member.service;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import com.doutown.student.dto.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    //로그인 확인 로직
    public boolean isLogin(Map map) {
        return memberMapper.findByMember(map);
    }

    //회원가입시 -> 인증 X
    @Transactional
    public MemberDTO save(MemberDTO dto) {
        int affected = memberMapper.save(dto);
        return dto;
    }

    //인증 처리
    public StudentDTO saveStudent(StudentDTO dto){
        int affected = memberMapper.saveStudent(dto);
        return dto;
    }

    //회원 목록 조회
    public List<MemberDTO> findAll() {
        return memberMapper.find();
    }

    //특정 회원 키로 조회
    public MemberDTO getMemberByNo(Long memberNo) {
        return memberMapper.findByMemberNo(memberNo);
    }

    //인증된 학생 목록 조회

    public List<StudentDTO> findStudentAll() {
        return memberMapper.findStudentAll();
    }

    //인증된 특정 학생 조회
    public StudentDTO getStudentByNo(Long studentNo) {
        return memberMapper.findByStudentNo(studentNo);
    }


    //회원 탈퇴
    @Transactional
    public int removeMember(Long memberNo) {
        int affected = 0;
        MemberDTO memberDTO = memberMapper.findByMemberNo(memberNo);
        affected = memberMapper.deleteMember(memberDTO.getMemberName());
        return affected;
    }


    //회원 정보 수정
    @Transactional
    public int updateMember(Long memberNo) {



        int affected = 0;
        memberMapper.updateMember(memberNo);
        return affected;
    }

<<<<<<< Updated upstream
=======
    //학생 등록
    @Transactional
    public StudentDTO insertStudent(StudentDTO dto) {
        int affected = 0;
        affected = memberMapper.insertStudent(dto);
        return dto;
    }

>>>>>>> Stashed changes
}
