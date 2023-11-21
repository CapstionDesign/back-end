package com.doutown.club.command.application.dto;

import com.doutown.club.command.domain.aggregate.enumtype.ClubStatus;

public class UpdataClubDTO {

    private String ClubName;
    private ClubStatus status;

    protected UpdataClubDTO() {}

    public UpdataClubDTO(String clubName, ClubStatus status) {
        ClubName = clubName;
        this.status = status;
    }

    public String getClubName() {
        return ClubName;
    }

    public void setClubName(String clubName) {
        ClubName = clubName;
    }

    public ClubStatus getStatus() {
        return status;
    }

    public void setStatus(ClubStatus status) {
        this.status = status;
    }
}
