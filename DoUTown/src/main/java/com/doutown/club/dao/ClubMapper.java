package com.doutown.club.dao;

import com.doutown.club.dto.ClubDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClubMapper {

    //동아리 전체 조회 - 관리자
    List<ClubDTO> find();

    //동아리상세조회 - 번호로 조회
    ClubDTO findByNo(Long clubNo);

    //동아리상세조회 - 동아리명으로 조회
    ClubDTO findByName(String clubName);

    //승인이 완료된 동아리 전체 조회 - 학생이 조회
    List<ClubDTO> findAllToStatus();

    //승인이 완료된 동아리 상세 조회 - 학생이 조회
    ClubDTO findByNoToStatus(Long clubNo);

    //동아리 등록 신청 -> status : N
    ClubDTO save(ClubDTO dto);

    //동아리삭제 cancel : N -> Y
    int deleteClub(Long clubNo);

    //동아리수정 승인시 status : N -> Y
    int updateClub(Long clubNo);

}
