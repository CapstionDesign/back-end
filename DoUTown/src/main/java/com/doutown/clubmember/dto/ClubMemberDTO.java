package com.doutown.clubmember.dto;

import org.apache.ibatis.type.Alias;

@Alias("ClubMemberDTO")
public class ClubMemberDTO {

    private Long studentNo;
    private Long clubNo;
    private String clubGrade;

    public ClubMemberDTO() {
    }

    public ClubMemberDTO(Long studentNo, Long clubNo, String clubGrade) {
        this.studentNo = studentNo;
        this.clubNo = clubNo;
        this.clubGrade = clubGrade;
    }

    public Long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    public Long getClubNo() {
        return clubNo;
    }

    public void setClubNo(Long clubNo) {
        this.clubNo = clubNo;
    }

    public String getClubGrade() {
        return clubGrade;
    }

    public void setClubGrade(String clubGrade) {
        this.clubGrade = clubGrade;
    }

    @Override
    public String toString() {
        return "ClubMemberDTO{" +
                "studentNo=" + studentNo +
                ", clubNo=" + clubNo +
                ", clubGrade='" + clubGrade + '\'' +
                '}';
    }
}
