package com.training;

public class StringBufferEmail {

	public static void main(String[] args) {
		//.biz,.milt,.com,.in
		//asf@ .buz --> invalid
		//validate email   @ should be present
		String input = "asdfvoyvoyvooyvyuf@DG.om";
		input.trim();
		int sz = input.length();
		
		//check for buffer limit
		if(sz> 18) {
			System.err.print("Buffer Size Excceded !");
			return;
		}
		
		StringBuffer t = new StringBuffer(18);
		
		t.append(input);
		int atPos = t.indexOf("@");
		int dotPos = t.indexOf(".");
		
		// spaceCheck 
		for(int x=0;x<sz;x++){
			if(t.charAt(x)==' '){
				System.err.print("Invalid Email1!");
				return;
			}
		}
		
		if(dotPos - atPos  <= 1){
			System.err.print("Invalid Email2");
			return;
		}
		
		//check for .com, .milt etc
		String lastStr = t.substring(dotPos+1,sz);
		if(lastStr.equals("biz") || lastStr.equals("milt") ||lastStr.equals("com") ||lastStr.equals("in") ){
			System.err.print("Valid Email");
		}
		else{
			System.err.print("Invalid Email3");
		}
		
		//System.out.println(t.capacity());
		//System.err.print();
		
	}

}
