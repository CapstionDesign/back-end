package com.doutown.jwt;

public class SignUpRequest {

    public String getMemberNo() {
        return MemberNo;
    }

    public void setMemberNo(String MemberNo) {
        this.MemberNo = MemberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String password) {
        this.memberName = password;
    }

    private String MemberNo;
    private String memberName;


}
