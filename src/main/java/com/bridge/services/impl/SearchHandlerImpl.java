package com.bridge.services.impl;

import com.bridge.dto.threquests.ThRequestByDestBody;
import com.bridge.dto.threquests.ThRequestByIdBody;
import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.dto.thresponses.ThSearchResponse;
import com.bridge.entities.SearchByDestRequest;
import com.bridge.entities.SearchByIdRequest;
import com.bridge.entities.SearchRequest;
import com.bridge.services.SearchHandler;
import com.bridge.services.SearchRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchHandlerImpl implements SearchHandler {

    @Autowired
    private SearchRequestHandler searchHandler;

    @Override
    public ThSearchResponse doWork(ThRequestHeader header, ThRequestByIdBody request) {
        ThSearchResponse result = searchHandler.doWork(new SearchByIdRequest(header,request));
        return result;
    }

    @Override
    public ThSearchResponse doWork(ThRequestHeader header, ThRequestByDestBody request) {
        ThSearchResponse result = searchHandler.doWork(new SearchByDestRequest(header,request));
        return result;
    }
}
