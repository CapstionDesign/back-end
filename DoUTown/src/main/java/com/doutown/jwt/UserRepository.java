package com.doutown.jwt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    // MEMBER_NO로 조회
    User findByMemberNo(Long memberNo);

    // MEMBER_NAME으로 조회
    User findByMemberName(String password);
}