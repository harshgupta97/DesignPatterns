package com.company;

import com.company.statePattern.Canvas;
import com.company.statePattern.EraserTool;
import com.company.statePattern.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool((new EraserTool()));
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
