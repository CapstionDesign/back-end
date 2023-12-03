package com.doutown.club.dto;

import java.sql.Date;

public class ClubDTO {

    private Long ClubNo;
    private Date openDate;
    private String clubName;
    private String clubStatus;

    public ClubDTO() {
    }

    public ClubDTO(Long clubNo, Date openDate, String clubName, String clubStatus) {
        ClubNo = clubNo;
        this.openDate = openDate;
        this.clubName = clubName;
        this.clubStatus = clubStatus;
    }

    public Long getClubNo() {
        return ClubNo;
    }

    public void setClubNo(Long clubNo) {
        ClubNo = clubNo;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubStatus() {
        return clubStatus;
    }

    public void setClubStatus(String clubStatus) {
        this.clubStatus = clubStatus;
    }

    @Override
    public String toString() {
        return "ClubDTO{" +
                "ClubNo=" + ClubNo +
                ", openDate=" + openDate +
                ", clubName='" + clubName + '\'' +
                ", clubStatus='" + clubStatus + '\'' +
                '}';
    }
}
