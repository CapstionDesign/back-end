package com.doutown.club.controller;

import com.doutown.club.dao.ClubMapper;
import com.doutown.club.dto.ClubDTO;
import com.doutown.club.service.ClubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
@Api(tags = {"02.동아리"}, description = "동아리 관련 서비스")
public class ClubController {

    ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    //등록된 동아리 목록 조회
    @GetMapping("/clubs")
    @ApiOperation(value = "등록된 동아리 목록 조회", notes = "전체 동아리 목록 조회 - 등록 대기중인 동아리 포함")
    public List<ClubDTO> findAll() {
        return clubService.findAll();
    }

    //특정 동아리 상세 조회
    @GetMapping("/clubs/{clubNo}")
    @ApiOperation(value = "등록된 동아리 중 번호로 상세 조회")
    public ResponseEntity<ClubDTO> getClubsByClubNo(@PathVariable Long clubNo) {
        return ResponseEntity.ok().header("Content-Type", "application/json").body(clubService.findByNo(clubNo));
    }


    //새로운 동아리 등록
    @PostMapping("/clubs")
    @ApiOperation(value = "동아리 등록")
    public ResponseEntity<ClubDTO> save(@RequestBody ClubDTO dto) {
        clubService.save(dto);
        dto = clubService.findByName(dto.getClubName());
        return ResponseEntity.ok().header("Content-Type","application/json").body(dto);
    }

    @PutMapping("/clubs/{clubNo}")
    @ApiOperation(value = "동아리 승인")
    public ResponseEntity<ClubDTO> updateClub(@PathVariable Long clubNo) {
        clubService.updateClub(clubNo);
        ClubDTO clubDTO = new ClubDTO();
        clubDTO = clubService.findByNo(clubNo);

        return ResponseEntity.ok().header("Content-Type","application/json").body(clubDTO);
    }

    //동아리 삭제
    @DeleteMapping("/clubs/{clubNo}")
    @ApiOperation(value = "동아리 삭제")
    public ResponseEntity<ClubDTO> removeClub(@PathVariable Long clubNo) {

        ClubDTO dto = clubService.findByNo(clubNo);

        clubService.removeClub(clubNo);

        return ResponseEntity.ok().header("Content-Type","application/json").body(dto);
    }


}
