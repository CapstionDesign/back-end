package com.doutown.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, @Qualifier("passwordEncoder") Object passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = (BCryptPasswordEncoder) passwordEncoder;
        System.out.println("Injected PasswordEncoder Bean: " + passwordEncoder);
    }
    public User signUpUser(String username, String password) {
        // 사용자 등록 로직
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setMemberName(passwordEncoder.encode(password)); // 패스워드 암호화
        return userRepository.save(newUser);

    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User getUserByMemberNo(Long memberNo) {
        return userRepository.findByMemberNo(memberNo);
    }

    public User getUserByMemberName(String memberName) {
        return userRepository.findByMemberName(memberName);
    }
}
