package com.mruruc.behavioral.observer.rxjs.simulation;

public interface Observer<T> {

    void next(T data); // handle data

    void error(Exception exception); // handle error

    void complete();                // handle stream finishes
}
