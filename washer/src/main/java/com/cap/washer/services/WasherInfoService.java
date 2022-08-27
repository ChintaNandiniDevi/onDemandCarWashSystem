package com.cap.washer.services;

import com.cap.washer.models.WasherInfo;


import java.util.List;

public interface WasherInfoService {
    public WasherInfo insertWasherInfo(WasherInfo washerInfo);
    public List<WasherInfo> getAllWashers();

    public WasherInfo updateWasherInfo(WasherInfo washerInfo, int washerId);

    public void deleteWasherInfo(int washerId);

}
