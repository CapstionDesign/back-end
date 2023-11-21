package com.doutown.club.command.application.service;

import com.doutown.club.command.domain.repository.ClubRepository;
import com.doutown.member.command.application.service.DeleteMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeleteClubService {

    private final ClubRepository clubRepository;

    @Autowired
    public DeleteClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Transactional
    public void deleteClub(Long clubNo) {
        clubRepository.deleteById(clubNo);
    }


}
