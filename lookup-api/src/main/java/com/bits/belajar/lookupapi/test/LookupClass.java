package com.bits.belajar.lookupapi.test;

import com.bits.belajar.lookupapi.service.MessageNotifier;
import org.openide.util.Lookup;

public class LookupClass {
    public static void main(String[] args) {
        MessageNotifier notifier = Lookup.getDefault().lookup(MessageNotifier.class);
        notifier.notify("Hello World !");
    }
}
