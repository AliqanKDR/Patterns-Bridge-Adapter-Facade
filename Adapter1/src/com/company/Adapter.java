package com.company;

public class Adapter extends PcApplication implements MobileApplication{

    @Override
    public void open() {
        openApp();
    }

    @Override
    public void load() {
        loadApp();
    }

    @Override
    public void play() {
        playApp();
    }

    @Override
    public void close() {
        closeApp();
    }
}
