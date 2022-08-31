package com.Java.Strings;

import java.util.ArrayList;
import java.util.List;

public class IpAddressValidation {

	public IpAddressValidation() {
		// TODO Auto-generated constructor stub
	}
	
	
	    public String validIPAddress(String queryIP) {
	        String[] queryIpArray = queryIP.split(".");
	         
	            if(validIpV4(queryIpArray)){
	                return "IPv4";
	            }
	            if(validIpV6(queryIpArray)){
	                 return "IPv6";
	            }
	            return "Neither";
	        
	    }
	     private boolean validIpV6(  String[] queryIpArray){
	         
	           for(int i=0;i<queryIpArray.length;i++){
	            
	            char[] charArray=queryIpArray[i].toCharArray();
	            for(int j=0;j<charArray.length;j++){
	                if(!Character.isAlphabetic(charArray[j]) || !Character.isDigit(charArray[j])){
	                    return false;
	                }
	            }
	               
	               return true;
	           }
			return false;
	     }
	        
	    private boolean validIpV4(  String[] queryIpArray){
	        
	        for(int i=0;i<queryIpArray.length;i++){
	            if(queryIpArray.length > 3){
	                return false;
	            }
	            char[] charArray=queryIpArray[i].toCharArray();
	            for(int j=0;j<charArray.length;j++){
	                if(!Character.isDigit(charArray[j])){
	                    return false;
	                }
	                if(charArray[charArray.length-1]=='0' && charArray[charArray.length-2]=='0'){
	                    return false;
	                }
	            }
	            
	        }
	        return true;
	        
	    }
}
