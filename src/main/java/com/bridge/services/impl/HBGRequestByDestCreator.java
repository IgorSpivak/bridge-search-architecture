package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.threquests.ThRequestByDestBody;
import com.bridge.services.HBGRequestCreator;
import org.springframework.stereotype.Service;

@Service
public class HBGRequestByDestCreator implements HBGRequestCreator<ThRequestByDestBody> {
    @Override
    public HBGRequest create(ThRequestByDestBody thRequest) {
        HBGRequest request = new HBGRequest(thRequest.getData() + " created from dest");
        return request;
    }
}
