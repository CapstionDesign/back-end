package com.doutown.board.dto;

import com.doutown.club.dto.ClubDTO;
import com.doutown.member.dto.MemberDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class BoardDTO {

    private Long boardNo;
    private String title;
    private String content;
    private Date postDate;
    private String clubNo;
    private String memberNo;
    private int hitCount;

}
