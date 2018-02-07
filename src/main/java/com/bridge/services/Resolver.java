package com.bridge.services;

public interface Resolver<T,R> {
    R resolve(T data);
}
