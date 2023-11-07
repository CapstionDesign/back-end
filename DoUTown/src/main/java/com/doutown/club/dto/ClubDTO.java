package com.doutown.club.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClubDTO {
    private Long clubNo;
    private String clubName;
    private String registerDate;
    private String state;
    private String srcUrl;
}
