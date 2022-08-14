package io.github.patterns.handlers;

import io.github.patterns.models.Mytype;
import io.github.patterns.models.Tool;

class AxeHandler extends AbstractHandler{
    public AxeHandler() {
        super(new HoeHandler());
    }

    @Override
    public Tool repair(Tool tool) {
        if(tool.getType()== Mytype.AXE) {
            tool.setUsage(100);
            return tool;
        } else {
            return successor.repair(tool);
        }
    }
}
