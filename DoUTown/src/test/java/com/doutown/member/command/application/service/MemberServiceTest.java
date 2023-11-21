package com.doutown.member.command.application.service;

import com.doutown.member.command.application.dto.CreateMemberDTO;
import com.doutown.member.command.domain.repository.MemberRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    CreateMemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void createMember() throws Exception {


        CreateMemberDTO member = new CreateMemberDTO("CHO", "2018", "zz");

        Long saveNo = memberService.join(member);

        Assertions.assertEquals(member, memberRepository.findOne(saveNo));
    }

}