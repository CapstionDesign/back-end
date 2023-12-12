package com.doutown.clubmember.dao;

import com.doutown.clubmember.dto.ClubMemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClubMemberMapper {

    //특정 동아리 회원 목록 전체 조회
    List<ClubMemberDTO> find(Long clubNo);

    //특정 동아리 회원 상세 조회
    ClubMemberDTO findByNo(Long studentNo);

    //동아리원 신청
    int save(ClubMemberDTO dto);

    //동아리원 삭제
    int deleteClubMember(Long studentNo);

    //동아리원 직급 수정
    int updateClubMember(Long studentNo);
}
