package com.training;

public class RemoveSpace {
	public static void main(String[] args) {
		String ques = "Zeta Sodexo Zeta Sodexo Zeta SodexoZeta Sodexo";
		
		
		System.out.println(ques.replaceAll("\\s", ""));

	}
}
