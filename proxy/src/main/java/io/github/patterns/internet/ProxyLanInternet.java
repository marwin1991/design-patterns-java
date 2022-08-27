package io.github.patterns.internet;

import java.util.Arrays;

public class ProxyLanInternet implements Internet{
    private final Internet net;

    public ProxyLanInternet(Internet net) {
        this.net = net;
    }

    @Override
    public void connectTo(String serverHost) {
        String[] forbiddenList = new String[]{"github.com", "google.com"};
        if (Arrays.asList(forbiddenList).contains(serverHost)) {
            throw new IllegalArgumentException();
        }
        net.connectTo(serverHost);
    }
}
