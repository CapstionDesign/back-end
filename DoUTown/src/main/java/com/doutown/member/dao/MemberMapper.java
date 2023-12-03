package com.doutown.member.dao;

import com.doutown.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    //사용자 등록
    int save(MemberDTO dto);
}
