package com.doutown.club.dto;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("ClubDTO")
public class ClubDTO {

    private Long clubNo;
    private Date openDate;
    private String clubName;
    private String clubStatus;

    public ClubDTO() {
    }

    public ClubDTO(Long clubNo, Date openDate, String clubName, String clubStatus) {
        this.clubNo = clubNo;
        this.openDate = openDate;
        this.clubName = clubName;
        this.clubStatus = clubStatus;
    }

    public Long getClubNo() {
        return clubNo;
    }

    public void setClubNo(Long clubNo) {
        this.clubNo = clubNo;
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
                "clubNo=" + clubNo +
                ", openDate=" + openDate +
                ", clubName='" + clubName + '\'' +
                ", clubStatus='" + clubStatus + '\'' +
                '}';
    }
}
