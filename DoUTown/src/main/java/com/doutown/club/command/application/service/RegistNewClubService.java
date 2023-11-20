package com.doutown.club.command.application.service;

import com.doutown.club.command.application.dto.RegistNewClubRequestDTO;
import com.doutown.club.command.domain.aggregate.enumtype.ClubStatus;
import com.doutown.club.command.domain.aggregate.root.Club;
import com.doutown.club.command.domain.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistNewClubService {

    private ClubRepository clubRepository;

    @Autowired
    public RegistNewClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Transactional
    public Long registNewClub(RegistNewClubRequestDTO dto) {

        Club club = new Club(dto.getClubName(), ClubStatus.대기);

        Club storedClub = clubRepository.save(club);

        return storedClub.getClubNo();
    }
}
