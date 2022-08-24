package com.cap.washer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "userInfo")
public class UserInfo {

    @Transient
    public static final String SEQUENCE_NAME="user_sequence";

    @Id
    private int userId;
    private String name;
    private String email;
    private String password;



}
