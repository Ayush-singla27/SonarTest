package com.training;

public class AlternateCaps {
	public static void main(String[] args) {
		String ques = "lenovo";
		int sz = ques.length();
		String ans="";
		for(int x=0;x<sz;x++){
			if(x%2==0){
				ans += (char)(ques.charAt(x)-32);
			}
			else ans += ques.charAt(x);
		}
		System.out.println(ans);
	}
}
