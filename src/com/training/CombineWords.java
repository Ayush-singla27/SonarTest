package com.training;

public class CombineWords {

	public static void main(String[] args) {
		String a = "Zeta", b = "infy";
		//output c = "Zain"
		int sz = a.length();
		String ans = "";
		
		ans += a.charAt(0);
		ans += a.charAt(sz-1);
		ans += b.charAt(0);
		ans += b.charAt(1);
		
		System.out.println(ans);
	}

}
