package org.hackathon.controller;

import org.hackathon.model.userlogin.UserLoginRequest;
import org.hackathon.model.userlogin.UserLoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class LoginController {
    
    @RequestMapping(value="/loginn", method=RequestMethod.POST)
    public void login(@RequestParam (value="username") String name,@RequestParam (value="password") String pwd) {

        RestTemplate restTemplate = new RestTemplate();
        // Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        UserLoginRequest ulr = new UserLoginRequest();
        ulr.setUsername("S123");
        ulr.setPassword("hack");
        ResponseEntity<UserLoginResponse> loginResp =
                restTemplate.postForEntity("http://lh-crewcheckin.herokuapp.com/api/crewuser/login", ulr,
                        UserLoginResponse.class);
        System.out.println("-------------Result-------------");
        System.out.println(loginResp.getBody().getUserId());

    }

}
