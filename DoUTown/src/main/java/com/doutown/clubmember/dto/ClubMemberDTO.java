package com.doutown.clubmember.dto;

import com.doutown.club.dto.ClubDTO;
import com.doutown.member.dto.StudentDTO;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("ClubMemberDTO")
public class ClubMemberDTO {

    private Long clubMemberNo;
    private Long studentNo;
    private Long clubNo;
    private String clubGrade;
    private Date joinDate;
    private String selfintro;
    private String status;

    public ClubMemberDTO() {
    }

    public ClubMemberDTO(Long clubMemberNo, Long studentNo, Long clubNo, String clubGrade, Date joinDate, String selfintro, String status) {
        this.clubMemberNo = clubMemberNo;
        this.studentNo = studentNo;
        this.clubNo = clubNo;
        this.clubGrade = clubGrade;
        this.joinDate = joinDate;
        this.selfintro = selfintro;
        this.status = status;
    }

    public Long getClubMemberNo() {
        return clubMemberNo;
    }

    public void setClubMemberNo(Long clubMemberNo) {
        this.clubMemberNo = clubMemberNo;
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getSelfintro() {
        return selfintro;
    }

    public void setSelfintro(String selfintro) {
        this.selfintro = selfintro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClubMemberDTO{" +
                "clubMemberNo=" + clubMemberNo +
                ", studentNo=" + studentNo +
                ", clubNo=" + clubNo +
                ", clubGrade='" + clubGrade + '\'' +
                ", joinDate=" + joinDate +
                ", selfintro='" + selfintro + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
