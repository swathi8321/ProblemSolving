package com.Java.SystemDesign;
import java.util.*;
public class ParkingSystem {

	public ParkingSystem() {
		// TODO Auto-generated constructor stub
	}
	
	 Map<Integer,Integer> parkingMap = new HashMap<Integer,Integer>();

	    public ParkingSystem(int big, int medium, int small) {
	           parkingMap.put(1,big);
	            parkingMap.put(2,medium);
	            parkingMap.put(3,small);
	    }
	    
	    public boolean addCar(int carType) {
	        if(parkingMap.get(carType)>0){
	            parkingMap.put(carType,parkingMap.getOrDefault(carType,0)-1);
	            return true;
	        }
	        return false;
	    }
	    
	    int big = 1;
	    int medium = 2;
	    int small =3;

	    public void ParkingSystem1(int big, int medium, int small) {
	          this.big = big;
	        this.medium=medium;
	        this.small=small;
	    }
	    
	    public boolean addCar1(int carType) {
	        
	      if(carType == 1){
	          if(big<=0){
	              return false;
	          }else{
	              big--;
	          }
	         return true;   
	      }
	          if(carType == 2){
	          if(medium<=0){
	              return false;
	          }else{
	              medium--;
	          }
	            return true;
	      }
	          if(carType == 3){
	          if(small<=0){
	              return false;
	          }else{
	              small--;
	          }
	            
	      }  
	      return true;  
	    }
	}



