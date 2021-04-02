package com.company.statePattern;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser on");
    }

    @Override
    public void mouseUp() {
        System.out.println("Eraser erase");
    }
}
