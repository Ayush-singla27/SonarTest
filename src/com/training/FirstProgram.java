package com.training;

public class FirstProgram {

	public static void main(String[] args) {
		
		try{
			int temp = Integer.parseInt(args[0]);
			System.out.println("Integer");
		}
		catch(Exception  e){
			System.out.println("Character");
		}
		
		
	}

}
