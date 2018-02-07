package com.bridge.services.impl;

import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.dto.thresponses.ThBodyInfo;
import com.bridge.services.BodyInfoBuilder;
import org.springframework.stereotype.Service;

@Service
public class BodyInfoBuilderImpl implements BodyInfoBuilder {

    @Override
    public ThBodyInfo resolve(ThRequestHeader header) {
        ThBodyInfo result = new ThBodyInfo(header.getData() + " as result");
        return result;
    }
}
