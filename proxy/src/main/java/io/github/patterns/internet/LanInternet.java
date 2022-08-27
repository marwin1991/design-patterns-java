package io.github.patterns.internet;

public class LanInternet implements Internet{
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connected to " + serverHost);
    }
}
