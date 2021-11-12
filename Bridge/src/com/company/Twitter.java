package com.company;

public class Twitter extends Program{

    protected Twitter(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Twitter application  is developing");
        developer.developProgram();
    }
}
