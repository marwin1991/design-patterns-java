package io.github.patterns.handlers;

import io.github.patterns.models.Tool;

class NotFoundHandler extends AbstractHandler{
    public NotFoundHandler() {
        super(null);
    }

    @Override
    public Tool repair(Tool tool) {
        throw new IllegalStateException();
    }
}
