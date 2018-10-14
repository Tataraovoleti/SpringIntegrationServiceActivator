package com.tata.springintegration.serviceact;

import org.springframework.integration.annotation.ServiceActivator;

public class PrinterService {
 
	    @ServiceActivator
	    public void printValue(String value){
	    	
	    	StringBuilder builder = new StringBuilder();
	    	builder.append("/*********************\n");
	    	builder.append(value+"\n");
	    	builder.append("/*********************");
	    	
	    	System.out.println("/*********************");
	        System.out.println(value);
	        System.out.println("*********************/");
	        
	    //    return builder.toString();
	    }
}
