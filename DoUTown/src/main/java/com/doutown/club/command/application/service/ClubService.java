package com.doutown.club.command.application.service;

import com.doutown.club.command.domain.aggregate.root.Club;
import com.doutown.club.command.domain.repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class ClubService {

    private final ClubRepository clubRepository;

    @Transactional
    public Long create(Club club) {

        validateDuplicateClub(club);
        clubRepository.create(club);

        return club.getClubNo();
    }

    private void validateDuplicateClub(Club club) {

        List<Club> findClub = clubRepository.findByName(club.getClubName());

        if(!findClub.isEmpty()) {
            throw  new IllegalStateException("이미 존재하는 동아리명입니다.");
        }
    }

    public List<Club> findClubs() {
        return clubRepository.findAll();
    }

    public Club findOne(Long clubNo) {
        return clubRepository.findOne(clubNo);
    }
}
