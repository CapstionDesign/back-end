package com.doutown.department.dao;

import com.doutown.department.dto.DepartmentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    //학과 등록
    int save(DepartmentDTO dto);

    //모든 학과 조회
    List<DepartmentDTO> findAll();

    //학과 삭제 -> 학과 없어졌을 시
    int deleteDepartment(String departmentCode);

    //학과 수정 -> 학과 이름 변경 시
    int updateDepartment(String departmentCode);

}
