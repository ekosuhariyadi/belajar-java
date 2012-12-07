package com.bits.belajar.eventbus.traditional;

import com.bits.belajar.eventbus.TemperatureContract;

public class Observer {
    private TemperatureContract contract;

    public void setContract(TemperatureContract contract) {
        this.contract = contract;
        processContract();
    }

    private void processContract() {
        System.out.println(String.format("Current Temperature is %d C", contract.getTemperature()));
    }
}
