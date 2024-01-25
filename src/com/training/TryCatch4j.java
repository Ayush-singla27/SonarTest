package com.training;

public class TryCatch4j {

	public static void main(String[] args) {
		try{
			int temp = 0;
			int z = 1/temp;
		}
		catch(Exception e){
			Log4jTest.helper(TryCatch4j.class).error(e);
			
		}
		
		

	}

}
