package io.github.patterns;


import io.github.patterns.internet.Internet;
import io.github.patterns.internet.LanInternet;
import io.github.patterns.internet.ProxyLanInternet;

public class Main {

    public static void main(String[] args) {

        LanInternet lan = new LanInternet();

        boolean test = Boolean.parseBoolean(System.getenv().get("TEST"));

        Internet internet = test ? new LanInternet() : new ProxyLanInternet(lan);
        internet.connectTo("ceneo.pl");
        internet.connectTo("github.com");

    }

}
