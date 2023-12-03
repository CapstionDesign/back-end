package com.doutown.comment.dto;

import java.sql.Date;

public class CommentDTO {

    private Long CommentNo;
    private String CommentText;
    private Date CommentDate;

    private Long BoardNo;
    private Long StudentNo;

    public CommentDTO() {
    }

    public CommentDTO(Long commentNo, String commentText, Date commentDate, Long boardNo, Long studentNo) {
        CommentNo = commentNo;
        CommentText = commentText;
        CommentDate = commentDate;
        BoardNo = boardNo;
        StudentNo = studentNo;
    }

    public Long getCommentNo() {
        return CommentNo;
    }

    public void setCommentNo(Long commentNo) {
        CommentNo = commentNo;
    }

    public String getCommentText() {
        return CommentText;
    }

    public void setCommentText(String commentText) {
        CommentText = commentText;
    }

    public Date getCommentDate() {
        return CommentDate;
    }

    public void setCommentDate(Date commentDate) {
        CommentDate = commentDate;
    }

    public Long getBoardNo() {
        return BoardNo;
    }

    public void setBoardNo(Long boardNo) {
        BoardNo = boardNo;
    }

    public Long getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(Long studentNo) {
        StudentNo = studentNo;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "CommentNo=" + CommentNo +
                ", CommentText='" + CommentText + '\'' +
                ", CommentDate=" + CommentDate +
                ", BoardNo=" + BoardNo +
                ", StudentNo=" + StudentNo +
                '}';
    }
}
