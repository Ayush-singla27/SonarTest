package com.training;

public class LeapYear {

	public static void main(String[] args) {
		// taking cmd input
		int temp = Integer.parseInt(args[0]);
		
		//If year is divisible by 100 and not 400 then it is 
		//not a leap year  
		//AND
		//If it not divisible by 4 then it is not a leap year
		//ELSE
		//it is a leap year
		if(temp%4 == 0){
			if(temp%100 == 0){
				if(temp%400 == 0){
					System.out.println("Leap year");
				}
				else{
					System.out.println("Not a Leap year");
				}
			}
			else{
				System.out.println("Leap year");
			}
		}
		else{
			System.out.println("Not a Leap year");
		}

	}

}
