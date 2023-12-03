package com.doutown.department.dto;

public class DepartmentDTO {

    private String DepartmentCode;
    private String DepartmentName;

    public DepartmentDTO() {
    }

    public DepartmentDTO(String departmentCode, String departmentName) {
        DepartmentCode = departmentCode;
        DepartmentName = departmentName;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "DepartmentCode='" + DepartmentCode + '\'' +
                ", DepartmentName='" + DepartmentName + '\'' +
                '}';
    }
}
