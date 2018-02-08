package com.bridge.services;

import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.entities.SearchContext;

public interface SearchInternalRequest {
    ThRequestHeader getHeader();
    SearchContext createSearchContext(String apiKey);
}
