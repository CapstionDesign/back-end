package com.doutown.jwt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User signUpUser(String username, String password) {
        // 사용자 등록 로직
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password)); // 패스워드 암호화
        return userRepository.save(newUser);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
