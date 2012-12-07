package com.bits.belajar.eventbus.traditional;

import com.bits.belajar.eventbus.TemperatureContract;

public class TraditionalPublishSubscriber {
    public static void main(String[] args) {
        Observable observable = new Observable();
        Observer observer = new Observer();

        observable.addObserver(observer);

        observable.publishContract(new TemperatureContract(37));
    }
}
