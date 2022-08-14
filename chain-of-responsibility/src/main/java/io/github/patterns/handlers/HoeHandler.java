package io.github.patterns.handlers;

import io.github.patterns.models.Mytype;
import io.github.patterns.models.Tool;

class HoeHandler extends AbstractHandler{
    public HoeHandler() {
        super(new ShovelHandler());
    }

    @Override
    public Tool repair(Tool tool) {
        if(tool.getType()== Mytype.HOE) {
            tool.setUsage(100);
            return tool;
        } else {
            return successor.repair(tool);
        }
    }
}
