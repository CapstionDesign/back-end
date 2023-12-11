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

    public List<ClubMemberDTO> find(){
        return clubMemberMapper.find();
    }

}
