package com.training;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String amount = sc.next();
		int sz = amount.length();
		String[] ones = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
	    String[] tens = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
	    
	    String ans = "";
	    
	    if(sz == 4){
	    	amount = "0" + amount;
	    }
	    if(sz == 3){
	    	amount = "00" + amount;
	    }
	    if(sz == 2){
	    	amount = "000" + amount;
	    }
	    if(sz == 1){
	    	amount = "0000" + amount;
	    }
	    if(amount.charAt(0)== '0' && amount.charAt(1)== '0'){
	    	ans+="";
	    }
	    else if(amount.charAt(0) < '2'){
    		String curVal = amount.substring(0,2);
    		int temp = Integer.parseInt(curVal);
    		ans += ones[temp];
    		ans+=" Thousand";
    		
    	}
    	else{
    		int temp = amount.charAt(0) - '0';
    		int temp2 = amount.charAt(1) - '0';
    		ans+= tens[temp];
    		ans+= ones[temp2];
    		ans+=" Thousand";
    	}
    	
    	if(amount.charAt(2) != '0'){
    		ans += ones[amount.charAt(2)-'0'];
    		ans += " Hundred";
    	}
    	if(amount.charAt(3) < '2'){
    		String curVal = amount.substring(3,5);
    		int temp = Integer.parseInt(curVal);
    		ans += ones[temp];
    		
    	}
    	else{
    		int temp = amount.charAt(3) - '0';
    		int temp2 = amount.charAt(4) - '0';
    		ans+= tens[temp];
    		ans+= ones[temp2];
    	}
    	System.out.println(ans);
	    
	}

}
