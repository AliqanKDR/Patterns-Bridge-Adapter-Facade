package com.company;

public class IosImpl implements IosProgram{
    @Override
    public void writeIosMessage() {
        System.out.println("Ios app write message");
    }

    @Override
    public void getIosMessage() {
        System.out.println("Ios app get message");

    }
}
