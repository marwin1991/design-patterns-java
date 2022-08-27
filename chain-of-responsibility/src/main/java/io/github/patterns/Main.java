package io.github.patterns;

import io.github.patterns.impl_list.handlers.ListMainHandler;
import io.github.patterns.impl_successor.handlers.SuccessorMainHandler;
import io.github.patterns.models.Tool;
import io.github.patterns.models.ToolType;

public class Main {

    public static void main(String[] args) {

        Tool tool = new Tool(ToolType.HOE, 10, "Peter");

//        SuccessorMainHandler handler = new SuccessorMainHandler();
//        handler.repair(tool);
//
//        System.out.println(tool);

        ListMainHandler listMainHandler = new ListMainHandler();

        listMainHandler.repair(tool);

        System.out.println(tool);

    }

}
