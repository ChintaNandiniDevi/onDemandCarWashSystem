package com.cap.washer.repository;

import com.cap.washer.models.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserInfoRepository extends MongoRepository<UserInfo, Integer> {


}
