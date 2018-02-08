package com.bridge.entities;

import com.bridge.dto.threquests.ThRequestByDestBody;
import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.entities.hbgrequests.HBGRequest;

public class SearchByDestRequest  extends SearchRequest<ThRequestByDestBody> {

    public SearchByDestRequest(ThRequestHeader header, ThRequestByDestBody body) {
        super(header, body);
    }

    @Override
    public SearchContext createSearchContext(String apiKey) {
        //here we will relevant mapper
        HBGRequest request = new HBGRequest(body.getData() + " created from dest with apiKey " + apiKey);
        SearchMappingContext mappingContext = new SearchMappingContext("bydest mapping context");
        return new SearchContext(mappingContext,request);
    }
}
