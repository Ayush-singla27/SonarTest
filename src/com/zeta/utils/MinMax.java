package com.zeta.utils;

import java.util.*;

import com.training.GetternSetter;
import com.training.Log4jTest;

public class MinMax {
	public static int findMax(Collection temp ){
		int mx = 0;
		for(Object x : temp){
	    	mx = Math.max((int)mx,(int)x);
	    }
		return mx;
	}
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(2);
		
	    HashSet set1 = new HashSet();

	    set1.addAll(list);
	    
	    System.out.println(findMax(set1));

		
	}

}
