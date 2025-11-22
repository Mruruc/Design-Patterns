package com.mruruc.behavioral.observer;


@FunctionalInterface
public interface Subscriber {
    void consume(Object object);
}
