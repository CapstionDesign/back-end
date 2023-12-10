package com.doutown.jwt;
import javax.persistence.*;

@Entity
@Table(name = "member")
public class User {



    public Long getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Long memberNo) {
        this.memberNo = memberNo;
    }

    public String getUsername() {
        System.out.println(username);
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMemberName() {
        System.out.println(memberName);
        return memberName;
    }

    public void setMemberName(String password) {
        this.memberName = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no", unique = true)
    private Long memberNo;
    @Column
    private String username;
    @Column(name = "member_name", nullable = false)
    private String memberName;



}
