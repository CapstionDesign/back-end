package com.doutown.member.command.application.service;

import com.doutown.member.command.domain.aggregate.root.Member;
import com.doutown.member.command.domain.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeleteMemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public DeleteMemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void deleteMember(Long memberNo) {
        memberRepository.delete(memberNo);
    }

}
