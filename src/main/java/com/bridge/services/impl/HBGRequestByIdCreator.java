package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.dto.threquests.ThRequestByIdBody;
import com.bridge.entities.SearchContext;
import com.bridge.entities.SearchMappingContext;
import com.bridge.services.HBGRequestCreator;
import org.springframework.stereotype.Service;

@Service
public class HBGRequestByIdCreator implements HBGRequestCreator<ThRequestByIdBody> {

    @Override
    public SearchContext create(ThRequestByIdBody data, String apiKey) {
        HBGRequest request = new HBGRequest(data.getData() + " created from id with apiKey " + apiKey);
        SearchMappingContext mappingContext = new SearchMappingContext("byid mapping context");
        return new SearchContext(mappingContext,request);
    }
}
