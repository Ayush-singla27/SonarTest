package com.day2Hw;

public class AddBytes {
	
	public static byte addBytes(byte a, byte b) throws ZetacExeption {
        int result = (int) a + (int) b;
        
        if (result < Byte.MIN_VALUE || result > Byte.MAX_VALUE) {
            throw new ZetacExeption("Byte addition may result in overflow");
        }

        return (byte)result;
    }
	
	public static void main(String[] args) {
		try{
			byte a = 100;
			byte b = 100;
            byte result = addBytes(a, b);
            System.out.println(result);
        } catch (ZetacExeption e) {
            System.out.println( e.getMessage());
        }

	}

}
