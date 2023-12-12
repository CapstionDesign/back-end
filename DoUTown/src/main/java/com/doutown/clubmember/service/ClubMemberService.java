package com.doutown.clubmember.service;

import com.doutown.clubmember.dao.ClubMemberMapper;
import com.doutown.clubmember.dto.ClubMemberDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubMemberService {

    ClubMemberMapper clubMemberMapper;

    public ClubMemberService(ClubMemberMapper clubMemberMapper) {
        this.clubMemberMapper = clubMemberMapper;
    }

    //특정 동아리 회원 전체 조회 - status가 Y인 회원
    public List<ClubMemberDTO> find(Long clubNo){
        return clubMemberMapper.find(clubNo);
    }

    //동아리 가입 신청
    public int save(ClubMemberDTO dto) {
        return clubMemberMapper.save(dto);
    }

    //동아리 가입 승인
    public int update(Long studentNo) {
        return clubMemberMapper.updateClubMember(studentNo);
    }

}
