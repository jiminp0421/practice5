package com.javaex.ex06;

public class Goods {
	
	public static double rate;
	

    public static void setRate(double r){
        Goods.rate = r;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }

}
