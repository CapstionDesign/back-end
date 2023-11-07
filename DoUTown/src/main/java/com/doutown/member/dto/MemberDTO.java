package com.doutown.member.dto;

import com.doutown.club.dto.ClubDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class MemberDTO {
    private Long memberNo;
    private String memberName;
    private String memberHak;
    private String grade;
    private Date hierDate;
    private String clubNo;
}
