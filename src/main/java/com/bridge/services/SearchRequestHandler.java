package com.bridge.services;

import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.entities.thresponses.ThSearchResponse;

public interface SearchRequestHandler<T> {

    ThSearchResponse create(ThRequestHeader requestHeader, T requestBody);

}
