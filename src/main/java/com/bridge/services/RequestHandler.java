package com.bridge.services;

public interface RequestHandler<T,R> {
    R doWork(T request);
}
