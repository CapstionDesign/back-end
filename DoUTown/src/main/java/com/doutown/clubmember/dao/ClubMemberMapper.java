package com.doutown.clubmember.dao;

import com.doutown.clubmember.dto.ClubMemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClubMemberMapper {

    List<ClubMemberDTO> find();

    ClubMemberDTO findByNo(Long studentNo);

    ClubMemberDTO save(ClubMemberDTO dto);

    int deleteClubMember(Long studentNo);

    int updateClubMember(Long studentNo);
}
