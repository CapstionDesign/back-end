package com.doutown.member.command.domain.aggregate.root;

import com.doutown.member.command.domain.aggregate.enumtype.MemberStatus;

import javax.persistence.*;

@Entity
@Table(name = "tbl_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;

    @Column
    private String memberName;

    @Column
    private String memberHak;

    @Column
    private String email;

    @Column
    @Enumerated
    private MemberStatus status;

    @Column
    private String regiDate;

    public Member() {
    }

    public Member(String memberName, String memberHak, String email) {
        this.memberName = memberName;
        this.memberHak = memberHak;
        this.email = email;
    }

    public Long getMemberNo() {
        return memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberHak() {
        return memberHak;
    }

    public String getEmail() {
        return email;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public String getRegiDate() {
        return regiDate;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberHak(String memberHak) {
        this.memberHak = memberHak;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public void setRegiDate(String regiDate) {
        this.regiDate = regiDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberName='" + memberName + '\'' +
                ", memberHak='" + memberHak + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", regiDate='" + regiDate + '\'' +
                '}';
    }
}
