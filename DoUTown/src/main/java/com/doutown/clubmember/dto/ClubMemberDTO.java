package com.doutown.clubmember.dto;

import com.doutown.club.dto.ClubDTO;
import com.doutown.member.dto.StudentDTO;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("ClubMemberDTO")
public class ClubMemberDTO {

    private Long studentNo;
    private Long clubNo;
    private String clubGrade;
    private Date joinDate;
    private String selfintro;

    private StudentDTO studentDTO;


    public ClubMemberDTO() {
    }

    public ClubMemberDTO(Long studentNo, Long clubNo, String clubGrade, Date joinDate, String selfintro, StudentDTO studentDTO) {
        this.studentNo = studentNo;
        this.clubNo = clubNo;
        this.clubGrade = clubGrade;
        this.joinDate = joinDate;
        this.selfintro = selfintro;
        this.studentDTO = studentDTO;
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

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    @Override
    public String toString() {
        return "ClubMemberDTO{" +
                "studentNo=" + studentNo +
                ", clubNo=" + clubNo +
                ", clubGrade='" + clubGrade + '\'' +
                ", joinDate=" + joinDate +
                ", selfintro='" + selfintro + '\'' +
                ", studentDTO=" + studentDTO +
                '}';
    }
}
