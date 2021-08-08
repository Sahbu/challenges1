package com.technoElevate.challenges;

public class Challenge1 {
  public static String getDuration(int minutes, int second) {
	  if (minutes>=0 && second>=0 && second<=59) {
		int hours = minutes/60;
		minutes = minutes%60;
		return "Time=>: "+hours+"HRS: "+minutes+"MINS :"+second+" SECS";
	}else {
		return "Invalid Value";
	}
  }
  public static String getDuration(int seconds) {
	  String checkPoint = "";
      if (seconds >= 0) {
    	  checkPoint = getDuration(seconds/60, seconds % 60);
      }else {
      	return "Invalid value";
      }
      return checkPoint;
  }
  public static void main(String[] args) {
	System.out.println(Challenge1.getDuration(6000));
}
}
