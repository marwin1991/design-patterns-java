package io.github.patterns.handlers;

import io.github.patterns.models.Tool;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractHandler {

    final AbstractHandler successor;
    public abstract Tool repair(Tool tool);
}
