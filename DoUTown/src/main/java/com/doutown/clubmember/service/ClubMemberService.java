package com.doutown.clubmember.service;

import com.doutown.clubmember.dao.ClubMemberMapper;
import org.springframework.stereotype.Service;

@Service
public class ClubMemberService {

    ClubMemberMapper clubMemberMapper;

    public ClubMemberService(ClubMemberMapper clubMemberMapper) {
        this.clubMemberMapper = clubMemberMapper;
    }

}
