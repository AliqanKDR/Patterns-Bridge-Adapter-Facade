package com.company;

public class WebProgramImpl implements WebProgram{
    @Override
    public void writeWebMessage() {
        System.out.println("Web app write message");
    }

    @Override
    public void getWebMessage() {
        System.out.println("Web app get message");
    }
}
