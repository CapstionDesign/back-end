package com.doutown.club.service;

import com.doutown.club.dao.ClubMapper;
import com.doutown.club.dto.ClubDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClubService {

    ClubMapper clubMapper;

    public ClubService(ClubMapper clubMapper) {
        this.clubMapper=clubMapper;
    }

    //전체 동아리 목록 조회
    public List<ClubDTO> findAll() {
        return clubMapper.find();
    }

    //특정 동아리 조회 - 번호로 조회
    public ClubDTO findByNo(Long clubNo) {
        return clubMapper.findByNo(clubNo);
    }

    //특정 동아리 조회 - 이름으로 조회
    public ClubDTO findByName(String clubName) {
        return clubMapper.findByName(clubName);
    }

    //승인된 동아리 전체 조회
    public List<ClubDTO> findAllToStatus() {
        return clubMapper.findAllToStatus();
    }

    //승인된 동아리 상세 조회
    public ClubDTO findByNoToStatus(Long clubNo) {
        return clubMapper.findByNoToStatus(clubNo);
    }

    //동아리 등록
    @Transactional
    public ClubDTO save(ClubDTO dto) {
        return clubMapper.save(dto);
    }

    //동아리 수정 status : N -> Y
    @Transactional
    public int updateClub(Long clubNo) {
        return clubMapper.updateClub(clubNo);
    }

    //동아리 삭제
    @Transactional
    public int removeClub(Long clubNo) {

        int affected = 0;

        affected = clubMapper.deleteClub(clubNo);

        return affected;
    }


}
