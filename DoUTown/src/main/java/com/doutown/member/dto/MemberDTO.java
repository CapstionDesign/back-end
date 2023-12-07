package com.doutown.member.dto;

import com.doutown.student.dto.StudentDTO;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("MemberDTO")
public class MemberDTO {

    private Long memberNo;
    private String memberId;
    private String memberPass;
    private String memberName;
    private String memberGrade;
    private String studentStatus;
    private Date registDate;
    private StudentDTO studentDTO;

    public MemberDTO() {
    }

    public MemberDTO(Long memberNo, String memberId, String memberPass, String memberName, String memberGrade, String studentStatus, Date registDate, StudentDTO studentDTO) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.memberPass = memberPass;
        this.memberName = memberName;
        this.memberGrade = memberGrade;
        this.studentStatus = studentStatus;
        this.registDate = registDate;
        this.studentDTO = studentDTO;
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPass() {
        return memberPass;
    }

    public void setMemberPass(String memberPass) {
        this.memberPass = memberPass;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPass='" + memberPass + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberGrade='" + memberGrade + '\'' +
                ", studentStatus='" + studentStatus + '\'' +
                ", registDate=" + registDate +
                ", studentDTO=" + studentDTO +
                '}';
    }
}
