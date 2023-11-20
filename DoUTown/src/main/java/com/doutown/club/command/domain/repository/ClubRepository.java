package com.doutown.club.command.domain.repository;

import com.doutown.club.command.application.dto.RegistNewClubRequestDTO;
import com.doutown.club.command.domain.aggregate.root.Club;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface ClubRepository  extends JpaRepository<Club, Long> {


}
