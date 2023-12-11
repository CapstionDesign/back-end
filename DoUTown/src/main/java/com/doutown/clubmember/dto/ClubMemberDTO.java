package com.doutown.clubmember.dto;

import com.doutown.club.dto.ClubDTO;
import com.doutown.member.dto.StudentDTO;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("ClubMemberDTO")
public class ClubMemberDTO {

    private StudentDTO studentDTO;
    private ClubDTO clubDTO;
    private String clubGrade;
    private Date joinDate;
    private String selfintro;


    public ClubMemberDTO() {
    }

    public ClubMemberDTO(StudentDTO studentDTO, ClubDTO clubDTO, String clubGrade, Date joinDate, String selfintro) {
        this.studentDTO = studentDTO;
        this.clubDTO = clubDTO;
        this.clubGrade = clubGrade;
        this.joinDate = joinDate;
        this.selfintro = selfintro;
    }

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public ClubDTO getClubDTO() {
        return clubDTO;
    }

    public void setClubDTO(ClubDTO clubDTO) {
        this.clubDTO = clubDTO;
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

    @Override
    public String toString() {
        return "ClubMemberDTO{" +
                "studentDTO=" + studentDTO +
                ", clubDTO=" + clubDTO +
                ", clubGrade='" + clubGrade + '\'' +
                ", joinDate=" + joinDate +
                ", selfintro='" + selfintro + '\'' +
                '}';
    }
}
