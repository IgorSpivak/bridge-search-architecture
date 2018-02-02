package com.bridge.services;

import com.bridge.entities.threquests.ThRequestHeader;

public interface APIKeyResolver {
    String create(ThRequestHeader header);
}
