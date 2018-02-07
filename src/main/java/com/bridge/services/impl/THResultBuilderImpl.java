package com.bridge.services.impl;

import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.dto.thresponses.ThArrayOfHotels;
import com.bridge.entities.SearchMappingContext;
import com.bridge.services.THResultBuilder;
import org.springframework.stereotype.Service;

@Service
public class THResultBuilderImpl implements THResultBuilder {

    @Override
    public ThArrayOfHotels create(HBGResponse hbgResponse, SearchMappingContext mappingContext) {
        ThArrayOfHotels result = new ThArrayOfHotels(hbgResponse.getData() + " th result created using mapping " + mappingContext.getData());
        return result;
    }
}
