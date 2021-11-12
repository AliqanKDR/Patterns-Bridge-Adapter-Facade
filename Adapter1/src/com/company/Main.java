package com.company;

public class Main {

    public static void main(String[] args) {
	   MobileApplication mobileApplication = new Adapter();

	   mobileApplication.open();
	   mobileApplication.load();
	   mobileApplication.play();
	   mobileApplication.close();
    }
}
