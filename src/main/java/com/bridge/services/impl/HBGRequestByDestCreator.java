package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.dto.threquests.ThRequestByDestBody;
import com.bridge.entities.SearchContext;
import com.bridge.entities.SearchMappingContext;
import com.bridge.services.HBGRequestCreator;
import org.springframework.stereotype.Service;

@Service
public class HBGRequestByDestCreator implements HBGRequestCreator<ThRequestByDestBody> {

    @Override
    public SearchContext create(ThRequestByDestBody thRequest, String apiKey) {
        HBGRequest request = new HBGRequest(thRequest.getData() + " created from dest with apiKey " + apiKey);
        SearchMappingContext mappingContext = new SearchMappingContext("bydest mapping context");
        return new SearchContext(mappingContext,request);
    }
}
