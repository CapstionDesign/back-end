package com.doutown.student.dao;

import com.doutown.student.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    //이메일 인증 후 학생회원으로 추가
    int save(StudentDTO dto);

    //학생회원전체조회
    List<StudentDTO> findAll();
    //학생회원상세조회
    StudentDTO findOne();

}
