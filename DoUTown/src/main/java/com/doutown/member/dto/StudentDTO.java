package com.doutown.member.dto;

import org.apache.ibatis.type.Alias;

@Alias("StudentDTO")
public class StudentDTO {

    private Long studentNo;
    private String studentName;
    private String hakNumber;
    private Long memberNo;
    private DepartmentDTO departmentDTO;

    public StudentDTO() {
    }

    public StudentDTO(Long studentNo, String studentName, String hakNumber, Long memberNo, DepartmentDTO departmentDTO) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.hakNumber = hakNumber;
        this.memberNo = memberNo;
        this.departmentDTO = departmentDTO;
    }

    public Long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getHakNumber() {
        return hakNumber;
    }

    public void setHakNumber(String hakNumber) {
        this.hakNumber = hakNumber;
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", hakNumber='" + hakNumber + '\'' +
                ", memberNo=" + memberNo +
                ", departmentDTO=" + departmentDTO +
                '}';
    }
}
