package com.company;

public class AndroidImpl implements AndroidProgram{
    @Override
    public void writeMessage() {
        System.out.println("Android write message");
    }

    @Override
    public void getMessage() {
        System.out.println("Android get message");
    }
}
