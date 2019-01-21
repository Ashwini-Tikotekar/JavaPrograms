package com.bridgelabs.designpatterns.creational.singleton;

public class EagerInitialization {
	
    private final static EagerInitialization instance = new EagerInitialization();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return instance;
    }
}


