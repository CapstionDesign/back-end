package com.doutown.jwt;

public class JwtAuthenticationResponse {

    public String getAccessToken() {
        return accessToken;
    }

    private String accessToken;

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
