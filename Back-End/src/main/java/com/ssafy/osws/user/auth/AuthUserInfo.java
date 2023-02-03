package com.ssafy.osws.user.auth;

import java.util.Map;

public class AuthUserInfo {
	protected Map<String, Object> attributes;

    public AuthUserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @SuppressWarnings("unchecked")
	public String getEmail(){
        Map<String, Object> account = (Map<String, Object>) attributes.get("kakao_account");
   
        if (account == null) {
            return null;
        }

        return (String) account.get("email");
    }
}
