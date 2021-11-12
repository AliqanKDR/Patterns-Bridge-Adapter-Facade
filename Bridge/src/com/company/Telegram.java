package com.company;

public class Telegram extends Program{

    protected Telegram(Developer developer){
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Telegram application  is developing");
        developer.developProgram();
    }
}
