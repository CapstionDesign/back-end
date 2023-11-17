package com.doutown.club.command.application.service;

import com.doutown.club.command.domain.aggregate.root.Club;
import com.doutown.club.command.domain.repository.ClubRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ClubServiceTest {

    @Autowired
    ClubService clubService;

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    EntityManager em;

    @Test
    public void createClub() throws  Exception {

        Club club = new Club();
        club.setClubName("맛멋");

        Long createNo = clubService.create(club);

        Assertions.assertEquals(club, clubRepository.findOne(createNo));
    }

}