package com.bits.belajar.eventbus.eventbus;


import com.bits.belajar.eventbus.TemperatureContract;
import org.bushe.swing.event.EventBus;

public class EventBusObservable {

    public EventBusObservable() {
    }

    public void publishContract(TemperatureContract contract) {
        EventBus.publish(contract);
    }
}
