package io.github.patterns.impl_successor.handlers;

import io.github.patterns.models.Tool;

public class SuccessorMainHandler extends AbstractHandler{

    public SuccessorMainHandler() {
        super(new AxeHandler());
    }

    public Tool repair(Tool tool) {
        System.out.println("Passing to next handle: " + successor.getClass().getSimpleName());
        return successor.repair(tool);
    }
}
