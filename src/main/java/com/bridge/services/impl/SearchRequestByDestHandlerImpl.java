package com.bridge.services.impl;

import com.bridge.dto.threquests.ThRequestByDestBody;
import com.bridge.entities.SearchContext;
import com.bridge.services.HBGRequestCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchRequestByDestHandlerImpl extends SearchRequestHandlerBase<ThRequestByDestBody> {

    @Autowired
    private HBGRequestCreator<ThRequestByDestBody> HBGRequestCreator;

    @Override
    protected SearchContext createHBGRequest(ThRequestByDestBody requestBody, String apiKey) {
        return HBGRequestCreator.create(requestBody,apiKey);
    }
}
