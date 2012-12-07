package com.bits.belajar.lookupapi.provider;

import com.bits.belajar.lookupapi.service.MessageNotifier;
import org.openide.util.lookup.ServiceProvider;

import javax.swing.*;

@ServiceProvider(position = 1000, service = MessageNotifier.class)
public class OptionPaneMessageNotifier implements MessageNotifier {
    @Override
    public void notify(String message) {
        JOptionPane.showMessageDialog(null, "Pesan: " + message, "Message Notifier", JOptionPane.INFORMATION_MESSAGE);
    }
}
