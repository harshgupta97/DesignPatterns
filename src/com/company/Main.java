package com.company;

public class Main {

    public static void main(String[] args) {

        User user = new User("Harsh");
        System.out.println(user.name);

        TaxCalculator calculator = getCalculator();

        drawUIControl(new CheckBox());
    }

    // Coupling and interface
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }

    // Polymorphism and abstract
    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
