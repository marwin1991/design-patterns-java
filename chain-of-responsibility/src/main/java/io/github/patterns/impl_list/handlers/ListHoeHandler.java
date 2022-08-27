package io.github.patterns.impl_list.handlers;

import io.github.patterns.models.Tool;
import io.github.patterns.models.ToolType;

public class ListHoeHandler extends ListAbstractHandler {


    @Override
    public boolean canRepair(Tool tool) {
        return tool.getType() == ToolType.HOE;
    }

    @Override
    public Tool repair(Tool tool) {
        System.out.println("Repairing by: " + this.getClass().getSimpleName());
        tool.setUsage(100);
        return tool;
    }
}
