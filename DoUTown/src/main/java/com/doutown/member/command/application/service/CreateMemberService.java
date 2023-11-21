package com.doutown.member.command.application.service;

import com.doutown.member.command.application.dto.CreateMemberDTO;
import com.doutown.member.command.domain.aggregate.root.Member;
import com.doutown.member.command.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CreateMemberService {

    private final MemberRepository memberRepository;

    //회원 생성
    @Transactional
    public Long join(CreateMemberDTO dto) {

        Member member = new Member(dto.getMemberName(),dto.getMemberHak(),dto.getEmail());

        validateDuplicateMember(member);
        memberRepository.save(member);

        return member.getMemberNo();
    }

    //회원 중복 체크
    private void validateDuplicateMember(Member member) {

        List<Member> findMembers = memberRepository.findByName(member.getMemberName());

        if(!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    //회원 전체 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    //회원 한명에 대한 정보 조회
    public Member findOne(Long memberNo) {
        return memberRepository.findOne(memberNo);
    }
}
