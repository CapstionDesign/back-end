package com.doutown.member.dao;

import com.doutown.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    //회원가입
    int save(MemberDTO dto);

    //회원전체목록조회
    List<MemberDTO> find();

    //회원한명상세조회
    MemberDTO findByNo(Long memberNo);

    //회원삭제(탈퇴)
    //만약 인증된 회원이라 학생 테이블에 존재할 시 casecade작업 해야함
    int deleteMember(String memberName);

    //회원정보수정 -> 이메일 인증시 상태정보 변경
    int updateMember(Long memberNo);

}
