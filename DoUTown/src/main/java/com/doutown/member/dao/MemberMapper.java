package com.doutown.member.dao;

import com.doutown.member.dto.MemberDTO;
import com.doutown.student.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {

    //회원인지 확인하여 로그인 처리
    boolean findByMember(Map map);

    //회원가입
    int save(MemberDTO dto);

    //회원전체목록조회
    List<MemberDTO> find();

    //회원한명상세조회
    MemberDTO findByMemberNo(Long memberNo);

    //학생 전체 목록 조회
    List<StudentDTO> findStudentAll();

    //학생 상세 조회
    StudentDTO findByStudentNo(Long studentNo);

    //회원삭제(탈퇴)
    int deleteMember(String memberName);

    //회원정보수정 -> 이메일 인증시 상태정보 변경
    int updateMember(Long memberNo);

    //이메일 인증 후 회원 등록
    int insertStudent(StudentDTO dto);


}
