package com.doutown.club.dao;

import com.doutown.club.dto.ClubDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClubMapper {

    //동아리전체조회
    List<ClubDTO> find();

    //동아리상세조회
    ClubDTO findByNo(Long clubNo);

    //동아리등록
    ClubDTO save(ClubDTO dto);

    //동아리삭제
    int deleteClub(Long clubNo);

    //동아리수정
    int updateClub(Long clubNo);

}
