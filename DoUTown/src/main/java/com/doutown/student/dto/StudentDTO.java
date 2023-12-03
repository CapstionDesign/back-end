package com.doutown.student.dto;

public class StudentDTO {

    private Long StudentNo;
    private String StudentName;
    private String HakNumber;
    private String DepartmentCode;

    public StudentDTO() {
    }

    public StudentDTO(Long studentNo, String studentName, String hakNumber, String departmentCode) {
        StudentNo = studentNo;
        StudentName = studentName;
        HakNumber = hakNumber;
        DepartmentCode = departmentCode;
    }

    public Long getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(Long studentNo) {
        StudentNo = studentNo;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getHakNumber() {
        return HakNumber;
    }

    public void setHakNumber(String hakNumber) {
        HakNumber = hakNumber;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "StudentNo=" + StudentNo +
                ", StudentName='" + StudentName + '\'' +
                ", HakNumber='" + HakNumber + '\'' +
                ", DepartmentCode='" + DepartmentCode + '\'' +
                '}';
    }
}
