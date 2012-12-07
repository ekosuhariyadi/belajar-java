package com.bits.belajar.eventbus.eventbus;

import com.bits.belajar.eventbus.TemperatureContract;
import org.bushe.swing.event.EventBus;
import org.bushe.swing.event.EventSubscriber;

public class EventBusObserver implements EventSubscriber<TemperatureContract> {
    private TemperatureContract contract;

    public EventBusObserver() {
        selfRegister();
    }

    private void selfRegister() {
        EventBus.subscribe(TemperatureContract.class, this);
    }

    private void processContract() {
        System.out.println(String.format("Current Temperature is %d C", contract.getTemperature()));
    }

    @Override
    public void onEvent(TemperatureContract contract) {
        this.contract = contract;
        processContract();
    }
}
