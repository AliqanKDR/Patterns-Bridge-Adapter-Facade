package com.company;

public class Program {

    private AndroidProgram androidProgram;
    private IosProgram iosProgram;
    private WebProgram webProgram;

    public Program(){
        androidProgram = new AndroidImpl();
        iosProgram = new IosImpl();
        webProgram = new WebProgramImpl();
    }

    public void writeMessage(){
        androidProgram.writeMessage();
    }

    public void getMessage(){
        androidProgram.getMessage();
    }

    public void writeIosMessage(){
        iosProgram.writeIosMessage();
    }

    public void getIosMessage(){
        iosProgram.getIosMessage();
    }

    public void writeWebMessage(){
        webProgram.writeWebMessage();
    }

    public void getWebMessage(){
        webProgram.getWebMessage();
    }

}
