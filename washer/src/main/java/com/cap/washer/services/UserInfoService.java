package com.cap.washer.services;

import com.cap.washer.models.UserInfo;
import org.apache.catalina.User;

import java.util.List;

public interface UserInfoService {
    public UserInfo insertUserInfo(UserInfo userInfo);
    public List<UserInfo> getAllUsers();

    public UserInfo updateUserInfo(UserInfo userInfo, int userId);

    public void deleteUserInfo(int userId);

}
