package com.bits.belajar.lookupapi.provider;

import com.bits.belajar.lookupapi.service.MessageNotifier;

public class SystemOutMessageNotifier implements MessageNotifier {
    @Override
    public void notify(String message) {
        System.out.println("Pesan: " + message);
    }
}
