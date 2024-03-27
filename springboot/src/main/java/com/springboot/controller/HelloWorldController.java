package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/docker")
public class HelloWorldController {
    @GetMapping("/client-call")
    public String getResponseFromClient(){
        String result = null;
        for (int i = 0; i < 100; i++) {
            RestTemplate restTemplate = new RestTemplate();
            String uri = "https://blockstream.info/testnet/api/address/tb1qswa0hq3px3arz229y98m67fprw7ujpvxkztgszvt090rkgnq2hysf85hlg/txs";
            result = restTemplate.getForObject(uri, String.class);
            System.out.println(i + "\t" + result);
            System.out.println("---------------------------------------------");
        }
        return result;
    }

    @GetMapping("/test")
    public String getHelloWorld(){
        return "Hello World! Testing.";
    }
}
