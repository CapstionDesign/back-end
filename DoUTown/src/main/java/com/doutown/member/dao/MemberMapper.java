package com.doutown.member.dao;

import com.doutown.member.dto.MemberDTO;
import com.doutown.member.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {

    //회원인지 확인하여 로그인 처리
    boolean findByMember(MemberDTO dto);

    //회원가입
    int saveMember(MemberDTO dto);

    //회원 전체 목록조회
    List<MemberDTO> findMemberAll();

    //회원 한명 상세 조회 - 번호
    MemberDTO findMemberByNo(Long memberNo);

    //회원 한명 상세 조회 - 이름
    MemberDTO findMemberByName(String memberName);

    //학생 전체 목록 조회
    List<MemberDTO> findStudentAll();

    //학생 한명 상세 조회
    MemberDTO findStudentByNo(Long memberNo);

    //회원 탈퇴
    int deleteMember(Long memberNo);

    //인증 시 회원 정보 업데이트
    int updateMember(Long memberNo);

    //인증 후 학생 등록
    int saveStudent(StudentDTO dto);

}
