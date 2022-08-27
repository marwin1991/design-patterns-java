package io.github.patterns.impl_list.handlers;

import io.github.patterns.models.Tool;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class ListAbstractHandler {

    public abstract boolean canRepair(Tool tool);

    public abstract Tool repair(Tool tool);

}
