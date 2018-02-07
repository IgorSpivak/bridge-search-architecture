package com.bridge.services.impl;

import com.bridge.dto.threquests.ThRequestByIdBody;
import com.bridge.entities.SearchContext;
import com.bridge.services.HBGRequestCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchRequestByIdHandlerImpl extends SearchRequestHandlerBase<ThRequestByIdBody> {

    @Autowired
    private HBGRequestCreator<ThRequestByIdBody> HBGRequestCreator;

    @Override
    protected SearchContext createHBGRequest(ThRequestByIdBody requestBody, String apiKey) {
        return HBGRequestCreator.create(requestBody,apiKey);
    }
}
