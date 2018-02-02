package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.threquests.ThRequestByDestBody;
import com.bridge.services.HBGRequestCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchRequestByDestHandler extends SearchRequestHandlerBase<ThRequestByDestBody> {

    @Autowired
    private HBGRequestCreator<ThRequestByDestBody> HBGRequestCreator;

    @Override
    protected HBGRequest createHBGRequest(ThRequestByDestBody requestBody) {
        return HBGRequestCreator.create(requestBody);
    }
}
