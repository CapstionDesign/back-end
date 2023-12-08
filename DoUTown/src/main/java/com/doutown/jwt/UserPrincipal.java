package com.doutown.jwt;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class UserPrincipal implements UserDetails {

    private Long memberNo;
    private String username;
    private String memberName;

    private Collection<? extends GrantedAuthority> authorities;

    public UserPrincipal(Long memberNo, String username, String memberName, Collection<? extends GrantedAuthority> authorities) {
        this.memberNo = memberNo;
        this.username = username;
        this.memberName = memberName;
        this.authorities = authorities;

    }

    public static UserPrincipal create(User user) {
        return new UserPrincipal(
                user.getMemberNo(),
                user.getUsername(),
                user.getMemberName(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getPassword() {
        return memberName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
    public Long getMemberNo() {
        return memberNo;
    }

}
