package com.doutown.member.command.application.service;

import com.doutown.member.command.domain.aggregate.root.Member;
import com.doutown.member.command.domain.repository.MemberRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void createMember() throws Exception {
        Member member = new Member();
        member.setMemberName("CHO");

        Long saveNo = memberService.join(member);

        Assertions.assertEquals(member, memberRepository.findOne(saveNo));
    }

}