package com.cap.customerservice.controller;

import com.cap.customerservice.model.WashPack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/wash")
public class WasherController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/viewall")
    public WashPack[] getWashPacks(){
        ResponseEntity<WashPack[]> response =restTemplate.getForEntity("http://localhost:8081/washpack/viewall", WashPack[].class);
        WashPack[]  washPacks= response.getBody();
        return (washPacks);

    }
}
