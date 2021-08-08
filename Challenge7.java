package com.technoElevate.challenges;
/*
 Create a for statement using a range of numbers from 1 to 1000 inclusive
Sum all the numbers that can be divided with both 3 and 5.
for those numbers that met the above conditions, print out the number
break out of the loop once you find 5 numbers that met the above condition
After breaking out of the loop print the sum of the numbers that met the above conditions.
 */
public class Challenge7 {
  public static int sumSeries(int num) {
	  int sum=0;
	  for (int i = 1; i <=num; i++) {
		if(i%3==0 && i%5==0) {
			System.out.print(i+" is divided by both 5 and 3 \n");
			sum=sum+i;
			break;
			
		}
		
	}
	return sum;
  }
  public static void main(String[] args) {
	System.out.println("\nsum of satisfied series number is: "+Challenge7.sumSeries(1000));
}
}
