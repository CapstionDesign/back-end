package com.doutown.member.service;

import com.doutown.member.dao.MemberMapper;
import com.doutown.member.dto.MemberDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class MemberService {

    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public MemberDTO save(MemberDTO dto) {
        int affected = memberMapper.save(dto);
        return dto;
    }

    public List<MemberDTO> findAll() {
        return memberMapper.find();
    }

    public MemberDTO getMemberByNo(Long memberNo) {
        return memberMapper.findByNo(memberNo);
    }

    public int removeMember(Long memberNo) {
        int affected = 0;
        MemberDTO memberDTO = memberMapper.findByNo(memberNo);
        affected = memberMapper.deleteMember(memberDTO.getMemberName());
        return affected;
    }

    public int updateMember(Long memberNo) {
        int affected = 0;
        memberMapper.updateMember(memberNo);
        return affected;
    }

}
