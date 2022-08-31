package com.Java.Maths;

public class ConsecutiveNumbers {

	public ConsecutiveNumbers() {
		// TODO Auto-generated constructor stub
	}
	
public int consecutiveNumbersSum(int n) {
        
        int sum = 0;
        int count =0;
        for(int i=1;i<n;i++){
            
                sum = i+(i+1);
                System.out.println(sum);
                if(sum==n){
                    count++;
                    break;
                }
            
        }
        return count;
    }

public static void main(String args[]) {
	ConsecutiveNumbers cn = new ConsecutiveNumbers();
	System.out.println(cn.consecutiveNumbersSum(9));
	System.out.print("bit count is "+Integer.bitCount(2));
}
}
