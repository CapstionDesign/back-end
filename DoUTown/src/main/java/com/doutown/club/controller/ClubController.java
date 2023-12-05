package com.doutown.club.controller;

import com.doutown.club.dao.ClubMapper;
import com.doutown.club.dto.ClubDTO;
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

    @PostMapping("/clubs")
    @Transactional
    public ClubDTO save(@RequestBody ClubDTO dto) {
        clubMapper.save(dto);
        return dto;
    }

}
