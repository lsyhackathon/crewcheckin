package org.hackathon;

import org.hackathon.model.Quote;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class CrewCheckinApplication implements CommandLineRunner
{
    public static void main(String[] args) {
        SpringApplication.run(CrewCheckinApplication.class, args);
    }
    
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        System.out.println("-------------Result-------------");
        System.out.println(quote.toString());
    }
}


