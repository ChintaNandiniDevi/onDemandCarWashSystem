package com.cap.washer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("washPacks")
public class WashPack {

    @Id
    private String washPackId;
    private String washPackName;
    private String washPackDescription;
    private int washPackCost;
}
