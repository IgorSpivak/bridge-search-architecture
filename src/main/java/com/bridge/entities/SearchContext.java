package com.bridge.entities;

import com.bridge.entities.hbgrequests.HBGRequest;

public class SearchContext {
    private SearchMappingContext mappingContext;
    private HBGRequest hbgRequest;

    public SearchContext(SearchMappingContext mappingContext, HBGRequest hbgRequest) {
        this.mappingContext = mappingContext;
        this.hbgRequest = hbgRequest;
    }

    public SearchMappingContext getMappingContext() {
        return mappingContext;
    }

    public void setMappingContext(SearchMappingContext mappingContext) {
        this.mappingContext = mappingContext;
    }

    public HBGRequest getHbgRequest() {
        return hbgRequest;
    }

    public void setHbgRequest(HBGRequest hbgRequest) {
        this.hbgRequest = hbgRequest;
    }
}
