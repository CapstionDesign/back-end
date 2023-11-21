package com.doutown.member.command.application.dto;

import com.doutown.member.command.domain.aggregate.enumtype.MemberStatus;

public class CreateMemberDTO {

    private String memberName;
    private String memberHak;
    private String email;

    public CreateMemberDTO(String memberName, String memberHak, String email) {
        this.memberName = memberName;
        this.memberHak = memberHak;
        this.email = email;
    }

    /* gett,sett 추가해야할거 있으면 밑에다 추가 */

    public String getMemberName() {
        return memberName;
    }

    public String getMemberHak() {
        return memberHak;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CreateMemberDTO{" +
                "memberName='" + memberName + '\'' +
                ", memberHak='" + memberHak + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
