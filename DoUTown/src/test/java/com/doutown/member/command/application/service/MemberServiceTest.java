package com.doutown.member.command.application.service;

import com.doutown.member.command.domain.aggregate.root.Member;
import com.doutown.member.command.domain.repository.MemberRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    EntityManager em;

    @Test
    public void CreateMember() throws Exception {
        Member member = new Member();
        member.setMemberName("CHO");

        Long saveNo = memberService.join(member);

        Assertions.assertEquals(member, memberRepository.findOne(saveNo));
    }

}