package com.cap.washer.controller;


import com.cap.washer.models.UserInfo;
import com.cap.washer.repository.UserInfoRepository;
import com.cap.washer.services.SequenceGeneratorService;
import com.cap.washer.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/add")
    public UserInfo insertUserInfo(@RequestBody UserInfo userInfo ){
        userInfo.setUserId(sequenceGeneratorService.getSequenceNumber(UserInfo.SEQUENCE_NAME));
        return userInfoService.insertUserInfo(userInfo);
    }

    @GetMapping("/view")
    public List<UserInfo> getAllUsers(){
        return userInfoService.getAllUsers();
    }

    @PutMapping("/update/{id}")
    public UserInfo updateUserInfo(@RequestBody UserInfo userInfo, @PathVariable("id") int userId)
    {
        return userInfoService.updateUserInfo(userInfo, userId);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteUserInfo(@PathVariable("id") int userId)
    {
        userInfoService.deleteUserInfo(userId);
    }

}
