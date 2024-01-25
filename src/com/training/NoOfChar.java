package com.training;

public class NoOfChar {

	public static void main(String[] args) {
		String ques = "Zeta Sodexo Zeta Sodexo Zeta SodexoZeta Sodexo";
		int sz = ques.length();
		int aCnt=0;
		int SCnt =0;
		for(int x=0;x<sz;x++){
			if(ques.charAt(x) == 'a') aCnt++;
			if(ques.charAt(x) == 'S') SCnt++;
		}
		
		System.out.println("No. of a : "+aCnt );
		System.out.println("No. of S : "+SCnt );
		System.out.println("No. of chars : "+sz );

	}

}
