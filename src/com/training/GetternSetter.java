package com.training;
import com.zeta.Pojo.*;

public class GetternSetter {

	public static void main(String[] args) {
		ZetaPojo PojoObj = new ZetaPojo();
		PojoObj.setCname("Ayush");
		Log4jTest.helper(GetternSetter.class).error(PojoObj.getCname());
		
	}

}
