package com.bits.belajar.eventbus;

import org.bushe.swing.event.EventServiceEvent;

public class TemperatureContract implements EventServiceEvent {
    private int temperature;

    public TemperatureContract(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public Object getSource() {
        return null;
    }
}
