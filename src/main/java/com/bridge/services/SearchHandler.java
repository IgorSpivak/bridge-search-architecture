package com.bridge.services;

import com.bridge.dto.threquests.ThRequestByDestBody;
import com.bridge.dto.threquests.ThRequestByIdBody;
import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.dto.thresponses.ThSearchResponse;

public interface SearchHandler {

    ThSearchResponse doWork(ThRequestHeader header, ThRequestByIdBody request);
    ThSearchResponse doWork(ThRequestHeader header, ThRequestByDestBody request);
}
