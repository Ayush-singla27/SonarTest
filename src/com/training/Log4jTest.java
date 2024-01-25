package com.training;

import org.apache.log4j.Logger;

public class Log4jTest {
	
	
	public static Logger helper(Class temp) {
		Logger lg = Logger.getLogger(temp);
		return lg;
	}

}
