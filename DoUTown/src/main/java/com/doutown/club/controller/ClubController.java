package com.doutown.club.controller;

import com.doutown.club.dao.ClubMapper;
import com.doutown.club.dto.ClubDTO;
import com.doutown.club.service.ClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class ClubController {

    ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    //등록된 동아리 목록 조회
    @GetMapping("/clubs")
    public List<ClubDTO> findAll() {
        return clubService.findAll();
    }

    //새로운 동아리 등록
    @PostMapping("/clubs")
    public ClubDTO save(@RequestBody ClubDTO dto) {
        return clubService.save(dto);
    }

    //특정 동아리 상세 조회
    @GetMapping("/clubs/{clubNo}")
    public ResponseEntity<ClubDTO> getClubsByClubNo(@PathVariable Long clubNo) {
        return ResponseEntity.ok().header("Content-Type", "application/json").body(clubService.findByNo(clubNo));
    }

    //동아리 삭제
    @DeleteMapping("/clubs/{clubNo}")
    public ResponseEntity<ClubDTO> removeClub(@PathVariable Long clubNo) {

        ClubDTO dto = clubService.findByNo(clubNo);

        clubService.removeClub(clubNo);

        return ResponseEntity.ok().header("Content-Type","application/json").body(dto);
    }


}
