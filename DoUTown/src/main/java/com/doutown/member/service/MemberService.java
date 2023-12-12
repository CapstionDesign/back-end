package com.doutown.member.service;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import com.doutown.member.dto.StudentDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    //로그인 확인 로직
    public boolean isLogin(MemberDTO dto) {
        return memberMapper.findByMember(dto);
    }

    //회원가입
    @Transactional
    public int saveMember(MemberDTO dto){
        return memberMapper.saveMember(dto);
    }

    //회원 전체 목록 조회
    public List<MemberDTO> findMemberAll() {
        return memberMapper.findMemberAll();
    }

    //회원 한명 상세 조회 - 번호
    public MemberDTO findMemberByNo(Long memberNo) {
        return memberMapper.findMemberByNo(memberNo);
    }

    //회원 한명 상세 조회 - 이름
    public MemberDTO findMemberByName(String memberName) {
        return memberMapper.findMemberByName(memberName);
    }

    //학생 전체 목록 조회
    public List<MemberDTO> findStudentAll() {
        return memberMapper.findStudentAll();
    }

    //학생 한명 상세 조회
    public MemberDTO findStudentByNo(Long memberNo) {
        return memberMapper.findStudentByNo(memberNo);
    }

    //회원 탈퇴


    //인증 시 회원 정보 업데이트
    public int updateMember(Long memberNo) {
        return memberMapper.updateMember(memberNo);
    }

    //인중 후 학생 등록
    public int saveStudent(StudentDTO dto) {
        return memberMapper.saveStudent(dto);
    }

}
