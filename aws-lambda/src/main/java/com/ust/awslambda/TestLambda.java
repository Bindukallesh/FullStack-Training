package com.ust.awslambda;

import com.amazonaws.services.lambda.runtime.Context;

public class TestLambda {
//	public String status(String x) {
//		Integer x1=Integer.parseInt(x);
//		return (x1*x1)+"";
//	}
	public String handleRequest(Data obj,Context context ) {
		return (obj.getX()+obj.getY())+"";
	}
}
