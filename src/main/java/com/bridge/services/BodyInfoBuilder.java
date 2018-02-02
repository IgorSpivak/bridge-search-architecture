package com.bridge.services;

import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.entities.thresponses.ThBodyInfo;

public interface BodyInfoBuilder {

    ThBodyInfo create(ThRequestHeader header);
}
