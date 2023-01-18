package com.sum;

public class Sumofnumbers {
	public static void main(String[] args) {
			int m=23456;
			int sum = 0;
			while(m > 0)
			{
				int temp =m % 10;
				sum = sum + temp;
				m=m / 10;
			}
			System.out.println(" sum of digits " + sum);
			}
	}


