package io.github.patterns.handlers;

import io.github.patterns.models.Mytype;
import io.github.patterns.models.Tool;

class ShovelHandler extends AbstractHandler{
    public ShovelHandler() {
        super(new NotFoundHandler());
    }

    @Override
    public Tool repair(Tool tool) {
        if(tool.getType()== Mytype.SHOVEL) {
            tool.setUsage(100);
            return tool;
        } else {
            return successor.repair(tool);
        }
    }
}
