package com.doutown.club.command.application.service;

import com.doutown.club.command.application.dto.RegistNewClubRequestDTO;
import com.doutown.club.command.domain.aggregate.enumtype.ClubStatus;
import com.doutown.club.command.domain.aggregate.root.Club;
import com.doutown.club.command.domain.repository.ClubRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class RegistNewClubServiceTest {

    @Autowired
    RegistNewClubService service;

    @Autowired
    ClubRepository repository;

    @Test
    public void registNewClub() throws Exception {

        RegistNewClubRequestDTO club = new RegistNewClubRequestDTO("맛멋");

        Long createNo = service.registNewClub(club);

        Assertions.assertEquals(club, repository.findById(createNo));

    }

}