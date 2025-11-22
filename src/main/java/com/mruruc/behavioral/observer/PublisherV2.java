package com.mruruc.behavioral.observer;

import java.util.HashMap;
import java.util.Map;

public class PublisherV2 {
    private Map<EventType, Subscriber> subscribers = new HashMap<>();


    public void subscribe(EventType eventType, Subscriber subscriber) {
        subscribers.putIfAbsent(eventType, subscriber);
    }

    public void publish(EventType eventType, Object payload) {
        if (!subscribers.containsKey(eventType)) {
            throw new UnsupportedOperationException("No Such a subscribers!");
        }

        subscribers.get(eventType).consume(payload);
    }

}
