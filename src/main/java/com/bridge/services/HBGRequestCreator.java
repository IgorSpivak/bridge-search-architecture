package com.bridge.services;

import com.bridge.entities.hbgrequests.HBGRequest;

public interface HBGRequestCreator<T> {

    HBGRequest create(T thRequest);

}
