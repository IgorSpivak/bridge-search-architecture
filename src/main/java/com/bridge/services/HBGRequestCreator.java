package com.bridge.services;

import com.bridge.entities.SearchContext;

public interface HBGRequestCreator<T>{
    SearchContext create(T request, String apikey);
}
