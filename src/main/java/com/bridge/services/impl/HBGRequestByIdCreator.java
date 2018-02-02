package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.threquests.ThRequestByIdBody;
import com.bridge.services.HBGRequestCreator;
import org.springframework.stereotype.Service;

@Service
public class HBGRequestByIdCreator implements HBGRequestCreator<ThRequestByIdBody> {

    @Override
    public HBGRequest create(ThRequestByIdBody thRequest) {
        HBGRequest request = new HBGRequest(thRequest.getData() + " created from id");
        return request;
    }
}
