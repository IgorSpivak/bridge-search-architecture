package com.bridge.services;

import com.bridge.entities.threquests.ThRequestByDestBody;
import com.bridge.entities.threquests.ThRequestByIdBody;
import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.entities.thresponses.ThSearchResponse;

public interface SearchHandler {

    ThSearchResponse create(ThRequestHeader header, ThRequestByIdBody request);
    ThSearchResponse create(ThRequestHeader header, ThRequestByDestBody request);
}
