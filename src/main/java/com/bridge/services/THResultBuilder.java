package com.bridge.services;

import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.dto.thresponses.ThArrayOfHotels;
import com.bridge.entities.SearchMappingContext;

public interface THResultBuilder {

    ThArrayOfHotels create(HBGResponse hbgResponse,SearchMappingContext mappingContext);
}
