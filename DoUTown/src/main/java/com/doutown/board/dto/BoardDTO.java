package com.doutown.board.dto;

public class BoardDTO {

    private Long boardNo;
    private String title;
    private String content;
    private Long studentNo;
    private String cancel;

    public BoardDTO() {
    }

    public BoardDTO(Long boardNo, String title, String content, Long studentNo, String cancel) {
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.studentNo = studentNo;
        this.cancel = cancel;
    }

    public Long getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(Long boardNo) {
        this.boardNo = boardNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardNo=" + boardNo +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", studentNo=" + studentNo +
                ", cancel='" + cancel + '\'' +
                '}';
    }
}
