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

    protected Club() {}

    public Club(String clubName, ClubStatus status) {
        this.clubName = clubName;
        this.status = status;
    }

    public Long getClubNo() {
        return clubNo;
    }
}
