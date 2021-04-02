package com.company.statePattern;

// In state pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern

// In state pattern, we create objects which represent various states and a context object whose behaviour varies as its state  object changes.
public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
