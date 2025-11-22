package com.mruruc.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();


    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public void publish(Object object) {
        for (Subscriber subscriber : subscribers) {
            subscriber.consume(object);
        }
    }

}
