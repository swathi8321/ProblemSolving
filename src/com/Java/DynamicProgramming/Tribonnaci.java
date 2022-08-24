package com.Java.DynamicProgramming;

public class Tribonnaci {

	public Tribonnaci() {
		// TODO Auto-generated constructor stub
	}
	int[] saveAnswer;
	public  int tribonacci(int n) {
		saveAnswer= new int[n+1];
		
		return tribonnaciHelper(n);
		
	}

	private int tribonnaciHelper(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}

		saveAnswer[n]= tribonnaciHelper(n - 3) + tribonnaciHelper(n - 2) + tribonnaciHelper(n - 1);
		return saveAnswer[n];
	}

	public static void main(String[] args) {
		Tribonnaci t = new Tribonnaci();
		// TODO Auto-generated method stub
		System.out.println(t.tribonacci(34));
	}

}
