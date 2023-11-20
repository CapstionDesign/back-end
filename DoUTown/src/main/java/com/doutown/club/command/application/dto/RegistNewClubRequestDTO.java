package com.doutown.club.command.application.dto;

import com.doutown.club.command.domain.aggregate.enumtype.ClubStatus;

public class RegistNewClubRequestDTO {

    private String clubName;

    public RegistNewClubRequestDTO(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    @Override
    public String toString() {
        return "RegistnewClubRequestDTO{" +
                "clubName='" + clubName + '\'' +
                '}';
    }
}
