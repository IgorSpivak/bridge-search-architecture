package com.bridge.services.impl;

import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.entities.thresponses.ThBodyInfo;
import com.bridge.services.BodyInfoBuilder;
import org.springframework.stereotype.Service;

@Service
public class BodyInfoBuilderImpl implements BodyInfoBuilder {
    @Override
    public ThBodyInfo create(ThRequestHeader header) {
        ThBodyInfo result = new ThBodyInfo(header.getData() + " as result");
        return result;
    }
}
