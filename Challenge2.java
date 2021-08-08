package com.technoElevate.challenges;

public class Challenge2 {
public static void main(String[] args) {
		
		System.out.println(area(5.6));
		System.out.println(area(-10));
		System.out.println(area(10,15));
		System.out.println(area(-1,-10));
	}
	
	public static double area(double radius) {
        if (radius >= 0) {
            return  radius * radius;
        } else return -1;

    }
	
	public static double area(double x, double y) {
		if(x>=0 && y>=0) {
			return x*y;
		}else return -1;
	}
}

