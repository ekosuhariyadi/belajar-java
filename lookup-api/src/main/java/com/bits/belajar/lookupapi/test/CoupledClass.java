package com.bits.belajar.lookupapi.test;

import com.bits.belajar.lookupapi.provider.SystemOutMessageNotifier;
import com.bits.belajar.lookupapi.service.MessageNotifier;

public class CoupledClass {
    public static void main(String[] args) {
        MessageNotifier notifier = new SystemOutMessageNotifier();
        notifier.notify("Hello World !");
    }
}
