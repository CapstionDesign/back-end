package com.doutown.club.controller;

import com.doutown.club.dao.ClubMapper;
import com.doutown.club.dto.ClubDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class ClubController {

    private ClubMapper clubMapper;

    public ClubController(ClubMapper clubMapper) {
        this.clubMapper = clubMapper;
    }

    @GetMapping("/clubs")
    public List<ClubDTO> findAll() {
        return clubMapper.find();
    }

    @GetMapping("/clubs/{clubNo}")
    public ClubDTO findByNo(Long clubNo) {
        return clubMapper.findByNo(clubNo);
    }

    @PostMapping("/clubs")
    public ClubDTO save(@RequestBody ClubDTO dto) {
        clubMapper.save(dto);
        return dto;
    }

    @DeleteMapping("/clubs/{clubNo}")
    public ResponseEntity<ClubDTO> removeClub(@PathVariable Long clubNo) {
        ClubDTO clubDTO = clubMapper.findByNo(clubNo);
        String clubName = clubDTO.getClubName();
        clubMapper.deleteClub(clubName);
        return ResponseEntity.ok().header("Content-Type","application/json; charset=UTF-8").body(clubDTO);
    }




}
