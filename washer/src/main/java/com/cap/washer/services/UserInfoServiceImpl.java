package com.cap.washer.services;


import com.cap.washer.models.UserInfo;
import com.cap.washer.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public UserInfo insertUserInfo(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

    @Override
    public List<UserInfo> getAllUsers() {
        return userInfoRepository.findAll();
    }

    @Override
    public UserInfo updateUserInfo(UserInfo userInfo, int userId) {
        UserInfo us= userInfoRepository.findById(userId).get();
        us.setName(userInfo.getName());
        us.setEmail(userInfo.getEmail());
        us.setPassword(userInfo.getPassword());
        return userInfoRepository.save(us);
    }

    @Override
    public void deleteUserInfo(int userId) {
            userInfoRepository.deleteById(userId);
    }


}
