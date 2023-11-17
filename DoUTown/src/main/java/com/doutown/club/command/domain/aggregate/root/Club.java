package com.doutown.club.command.domain.aggregate.root;

import com.doutown.club.command.domain.aggregate.enumtype.ClubStatus;

import javax.persistence.*;

@Entity
@Table(name = "tbl_club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubNo;

    @Column
    private String clubName;

    @Column
    @Enumerated
    private ClubStatus status;

    @Column
    private String establishDate;

    @Column
    private String src;

    public Club() {
    }

    public Club(Long clubNo, String clubName, ClubStatus status, String establishDate, String src) {
        this.clubNo = clubNo;
        this.clubName = clubName;
        this.status = status;
        this.establishDate = establishDate;
        this.src = src;
    }

    public Long getClubNo() {
        return clubNo;
    }

    public void setClubNo(Long clubNo) {
        this.clubNo = clubNo;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public ClubStatus getStatus() {
        return status;
    }

    public void setStatus(ClubStatus status) {
        this.status = status;
    }

    public String getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(String establishDate) {
        this.establishDate = establishDate;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubNo=" + clubNo +
                ", clubName='" + clubName + '\'' +
                ", status=" + status +
                ", establishDate='" + establishDate + '\'' +
                ", src='" + src + '\'' +
                '}';
    }
}
