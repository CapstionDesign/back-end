package com.doutown.member.command.domain.repository;

import com.doutown.member.command.domain.aggregate.root.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long memberNo) {
        return em.find(Member.class, memberNo);
    }

    public List<Member> findAll() {
        return em.createQuery("SELECT m FROM Member m", Member.class).getResultList();
    }

    public  List<Member> findByName(String memberName) {
        return em.createQuery("SELECT m FROM Member m WHERE m.memberName = :memberName", Member.class)
                .setParameter("memberName", memberName)
                .getResultList();
    }
}
