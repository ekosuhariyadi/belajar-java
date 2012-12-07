package com.bits.belajar.eventbus.traditional;


import com.bits.belajar.eventbus.TemperatureContract;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void publishContract(TemperatureContract contract) {
        for (Observer observer : observerList) {
            observer.setContract(contract);
        }
    }
}
