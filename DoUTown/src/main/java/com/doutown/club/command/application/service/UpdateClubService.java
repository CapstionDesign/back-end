package com.doutown.club.command.application.service;

import com.doutown.club.command.application.dto.UpdataClubDTO;
import com.doutown.club.command.domain.aggregate.root.Club;
import com.doutown.club.command.domain.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UpdateClubService {

    private ClubRepository clubRepository;

    @Autowired
    public UpdateClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Transactional
    public void modifyMenu(Club club) {
        Club foundClub = clubRepository.findById(club.getClubNo()).orElseThrow(IllegalAccessError::new);
    }

}
