package com.bridge.services;

import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.entities.thresponses.ThSearchResponse;

public interface SearchRequestHandler<T, R extends HBGRequestCreator<T>> {

    ThSearchResponse create(ThRequestHeader requestHeader, T requestBody);

}
