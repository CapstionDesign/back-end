package com.doutown.jwt;

public class LoginRequest {

    public String getMemeberNo() {
        return memeberNo;
    }

    public void setMemeberNo(String memeberNo) {
        this.memeberNo = memeberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    private String memeberNo;
    private String memberName;


}
