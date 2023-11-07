package com.doutown.clubmember.dto;

import com.doutown.club.dto.ClubDTO;
import com.doutown.member.dto.MemberDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Setter
@Getter
@ToString
public class ClubMemberDTO {
    private String userNo;
    private String clubNo;
    private Date registerDate;
    private String userInfo;
}
