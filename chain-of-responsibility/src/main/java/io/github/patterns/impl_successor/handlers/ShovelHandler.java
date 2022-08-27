package io.github.patterns.impl_successor.handlers;

import io.github.patterns.models.ToolType;
import io.github.patterns.models.Tool;

class ShovelHandler extends AbstractHandler{
    public ShovelHandler() {
        super(new NotFoundHandler());
    }

    @Override
    public Tool repair(Tool tool) {
        if(tool.getType()== ToolType.SHOVEL) {
            System.out.println("Repairing by: " + this.getClass().getSimpleName());
            tool.setUsage(100);
            return tool;
        } else {
            System.out.println("Passing to next handle: " + successor.getClass().getSimpleName());
            return successor.repair(tool);
        }
    }
}
