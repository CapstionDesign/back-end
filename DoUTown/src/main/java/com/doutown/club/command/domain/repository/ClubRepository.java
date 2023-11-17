package com.doutown.club.command.domain.repository;

import com.doutown.club.command.domain.aggregate.root.Club;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ClubRepository {

    private final EntityManager em;

    public void create(Club club) {
        em.persist(club);
    }

    public Club findOne(Long clubNo) {
        return em.find(Club.class, clubNo);
    }

    public List<Club> findAll() {
        return em.createQuery("SELECT c FROM Club c", Club.class).getResultList();
    }

    public List<Club> findByName(String clubName) {
        return em.createQuery("SELECT c FROM Club c WHERE c.clubName = :clubName", Club.class)
                .setParameter("clubName", clubName)
                .getResultList();
    }
}
