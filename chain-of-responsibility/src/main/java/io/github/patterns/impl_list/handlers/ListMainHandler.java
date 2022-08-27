package io.github.patterns.impl_list.handlers;

import io.github.patterns.models.Tool;

import java.util.ArrayList;
import java.util.List;

public class ListMainHandler {
    private final List<ListAbstractHandler> handlers;

    public ListMainHandler() {
        this.handlers = new ArrayList<>();
        handlers.add(new ListAxeHandler());
        handlers.add(new ListHoeHandler());
        handlers.add(new ListShovelHandler());
    }

    public Tool repair(Tool tool){
//        for (ListAbstractHandler handler : handlers){
//            if (handler.canRepair(tool)){
//                return handler.repair(tool);
//            }
//        }
//        throw new IllegalStateException();

        return handlers.stream()
                .filter(h -> h.canRepair(tool))
                .findFirst()
                .orElseThrow(IllegalStateException::new)
                .repair(tool);

    }
}
