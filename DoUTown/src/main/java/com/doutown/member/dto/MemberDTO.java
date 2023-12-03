package com.doutown.member.dto;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("memberDto")
public class MemberDTO {

    private Long memberNo;
    private String memberName;
    private String memberGrade;
    private String studentStatus;
    private Date registDate;
    private String studentNo;

    public MemberDTO() {
    }

    public MemberDTO(Long memberNo, String memberName, String memberGrade, String studentStatus, Date registDate, String studentNo) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.memberGrade = memberGrade;
        this.studentStatus = studentStatus;
        this.registDate = registDate;
        this.studentNo = studentNo;
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
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

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberNo=" + memberNo +
                ", memberName='" + memberName + '\'' +
                ", memberGrade='" + memberGrade + '\'' +
                ", studentStatus='" + studentStatus + '\'' +
                ", registDate=" + registDate +
                ", studentNo='" + studentNo + '\'' +
                '}';
    }
}
