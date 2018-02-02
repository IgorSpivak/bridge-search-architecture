package com.bridge.services.impl;

import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.entities.thresponses.ThArrayOfHotels;
import com.bridge.services.THResultBuilder;
import org.springframework.stereotype.Service;

@Service
public class THResultBuilderImpl implements THResultBuilder {

    @Override
    public ThArrayOfHotels create(HBGResponse hbgResponse) {
        ThArrayOfHotels result = new ThArrayOfHotels(hbgResponse.getData() + " th result created");
        return result;
    }
}
