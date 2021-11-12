package com.company;

public class Main {

    public static void main(String[] args) {
	    Program [] programs = {
	            new Telegram(new AndroidDeveloper()),
                new Twitter(new IosDeveloper())
        };

	    for (Program program: programs){
	        program.developProgram();
        }
    }
}
