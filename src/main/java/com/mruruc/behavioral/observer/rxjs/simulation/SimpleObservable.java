package com.mruruc.behavioral.observer.rxjs.simulation;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservable<T> {

    private List<Observer<T>> subscribers = new ArrayList<>();
    private boolean isCompleted = false;

    public void subscribe(Observer<T> observer) {
        if (isCompleted) {
            observer.complete();
            return;
        }
        subscribers.add(observer);
    }


    public void next(T data) {
        if (isCompleted) return;

        for (Observer<T> subscriber : subscribers) {
            subscriber.next(data);
        }
    }

    public void error(Exception exception) {
        if (isCompleted) return;

        for (Observer<T> subscriber : subscribers) {
            subscriber.error(exception);
        }

        this.isCompleted = true;

        subscribers.clear();
    }

    public void complete() {
        if (isCompleted) return;

        for (Observer<T> subscriber : subscribers) {
            subscriber.complete();
        }

        this.isCompleted = true;
        subscribers.clear();
    }

}
