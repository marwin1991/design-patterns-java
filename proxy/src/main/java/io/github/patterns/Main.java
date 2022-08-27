package io.github.patterns;


import io.github.patterns.internet.Internet;
import io.github.patterns.internet.LanInternet;
import io.github.patterns.internet.ProxyLanInternet;

public class Main {

    public static void main(String[] args) {

        LanInternet lan = new LanInternet();
        Internet internet = new ProxyLanInternet(lan);
        internet.connectTo("ceneo.pl");
        internet.connectTo("github.com");

    }

}
