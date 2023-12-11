package com.doutown.club.dto;

import com.doutown.member.dto.StudentDTO;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("ClubDTO")
public class ClubDTO {

    private Long clubNo;
    private StudentDTO studentDTO;
    private Date openDate;
    private String clubName;
    private String clubStatus;
    private String clubCancel;
    private String cancelReason;

    public ClubDTO() {
    }

    public ClubDTO(Long clubNo, StudentDTO studentDTO, Date openDate, String clubName, String clubStatus, String clubCancel, String cancelReason) {
        this.clubNo = clubNo;
        this.studentDTO = studentDTO;
        this.openDate = openDate;
        this.clubName = clubName;
        this.clubStatus = clubStatus;
        this.clubCancel = clubCancel;
        this.cancelReason = cancelReason;
    }

    public Long getClubNo() {
        return clubNo;
    }

    public void setClubNo(Long clubNo) {
        this.clubNo = clubNo;
    }

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubStatus() {
        return clubStatus;
    }

    public void setClubStatus(String clubStatus) {
        this.clubStatus = clubStatus;
    }

    public String getClubCancel() {
        return clubCancel;
    }

    public void setClubCancel(String clubCancel) {
        this.clubCancel = clubCancel;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    @Override
    public String toString() {
        return "ClubDTO{" +
                "clubNo=" + clubNo +
                ", studentDTO=" + studentDTO +
                ", openDate=" + openDate +
                ", clubName='" + clubName + '\'' +
                ", clubStatus='" + clubStatus + '\'' +
                ", clubCancel='" + clubCancel + '\'' +
                ", cancelReason='" + cancelReason + '\'' +
                '}';
    }
}
