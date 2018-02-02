package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.threquests.ThRequestByDestBody;
import com.bridge.entities.threquests.ThRequestByIdBody;
import com.bridge.services.HBGRequestCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchRequestByIdHandlerImpl extends SearchRequestHandlerBase<ThRequestByIdBody,HBGRequestCreator<ThRequestByIdBody>> {

   /* @Autowired
    private HBGRequestCreator<ThRequestByIdBody> HBGRequestCreator;

    @Override
    protected HBGRequest createHBGRequest(ThRequestByIdBody requestBody) {
        return HBGRequestCreator.create(requestBody);
    }*/
}
