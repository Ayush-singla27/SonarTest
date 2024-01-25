package com.zeta.utils;

import java.util.ArrayList;

public class ParaSort {

	public static void main(String[] args) {
		ArrayList chr = new ArrayList();
		ArrayList symb = new ArrayList();
		
		String str = "gi73eg8oew7g87&^i6d7988$#";
		int sz = str.length();
		for(int x=0;x<sz-1;x++){
			if(((int)str.charAt(x) > 47 && (int)str.charAt(x) < 58) && (int)str.charAt(x+1) > 47 && (int)str.charAt(x+1) < 58){
				x++;
				symb.add('&');
			}
			
		}

	}

}
