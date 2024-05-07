package lesson20.CustomerDesk;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    String name;
    boolean isSending;

    public Customer(String name, boolean isSending) {
        this.name = name;
        this.isSending = isSending;

        if (isSending) {
            senders.add(name);
        } else {
            receivers.add(name);
        }
    }

    private static final List<String> senders = new LinkedList<>();
    private static final List<String> receivers = new LinkedList<>();

    public static List<String> getSenders() {
        return senders;
    }

    public static List<String> getReceivers() {
        return receivers;
    }


}
