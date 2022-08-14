package io.github.patterns.handlers;

import io.github.patterns.models.Tool;

public class MainHandler extends AbstractHandler{

    public MainHandler() {
        super(new AxeHandler());
    }

    public Tool repair(Tool tool) {
        return successor.repair(tool);
    }
}
