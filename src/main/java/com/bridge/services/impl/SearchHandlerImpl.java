package com.bridge.services.impl;

import com.bridge.entities.threquests.ThRequestByDestBody;
import com.bridge.entities.threquests.ThRequestByIdBody;
import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.entities.thresponses.ThSearchResponse;
import com.bridge.services.SearchHandler;
import com.bridge.services.SearchRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchHandlerImpl implements SearchHandler {

    @Autowired
    private SearchRequestHandler<ThRequestByIdBody> searchByIdHandler;

    @Autowired
    private SearchRequestHandler<ThRequestByDestBody> searchByDestHandler;

    @Override
    public ThSearchResponse create(ThRequestHeader header, ThRequestByIdBody request) {
        ThSearchResponse result = searchByIdHandler.create(header,request);
        return result;
    }

    @Override
    public ThSearchResponse create(ThRequestHeader header, ThRequestByDestBody request) {
        ThSearchResponse result = searchByDestHandler.create(header,request);
        return result;
    }
}
