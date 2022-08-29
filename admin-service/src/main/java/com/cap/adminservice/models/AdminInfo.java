package com.cap.adminservice.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "adminInfo")
public class AdminInfo {

    @Id
    private int adminId;
    private String adminName;
    private String adminEmail;
    private String adminPassword;
}
