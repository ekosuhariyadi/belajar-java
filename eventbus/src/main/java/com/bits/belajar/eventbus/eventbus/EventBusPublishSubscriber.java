package com.bits.belajar.eventbus.eventbus;

import com.bits.belajar.eventbus.TemperatureContract;

public class EventBusPublishSubscriber {
    public static void main(String[] args) {
        EventBusObservable observable = new EventBusObservable();
        EventBusObserver observer = new EventBusObserver();

        observable.publishContract(new TemperatureContract(37));
    }
}
