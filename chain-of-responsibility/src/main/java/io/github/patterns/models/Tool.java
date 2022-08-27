package io.github.patterns.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Tool {
    private final ToolType type;
    private int usage;
    private String ownerName;
}
