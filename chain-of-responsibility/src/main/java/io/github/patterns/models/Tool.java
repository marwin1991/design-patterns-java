package io.github.patterns.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Tool {
    private final Mytype type;
    private int usage;
    private String ownerName;
}
