package com.example.google;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;

import java.util.Map;

@RestController
@RequestMapping("/")
public class SampleController {
    @GetMapping
    public Map<String, Object> currentUser(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return  oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
