package com.bridge.entities;

import com.bridge.dto.threquests.ThRequestByIdBody;
import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.entities.hbgrequests.HBGRequest;

public class SearchByIdRequest extends SearchRequest<ThRequestByIdBody> {

    public SearchByIdRequest(ThRequestHeader header, ThRequestByIdBody body) {
        super(header, body);
    }

    @Override
    public SearchContext createSearchContext(String apiKey) {
        //here we will relevant mapper
        HBGRequest request = new HBGRequest(body.getData() + " created from id with apiKey " + apiKey);
        SearchMappingContext mappingContext = new SearchMappingContext("byid mapping context");
        return new SearchContext(mappingContext,request);
    }
}
