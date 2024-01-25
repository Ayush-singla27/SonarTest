package com.training;

public class Pattern {

	public static void main(String[] args) {
//		System.out.print(0+" ");
//		for(int x=65;x<123;x++){
//			System.out.print(x-64);
//			System.out.print((char)x);
//			System.out.print(" ");
//		}
		
		
		int val = 26;
        char chr = 'a';

        do {
            System.out.print(val + "" + chr + " ");
            val--;
            chr++;
        } while (val > 0 && chr <= 'z');

	}

}
