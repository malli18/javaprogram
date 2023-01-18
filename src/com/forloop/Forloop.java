package com.forloop;

public class Forloop {
	public static void main(String[] args) {
		int m=437;
		int sum=0;
		while(m>0);
		{
			int temp =m/10;
			sum=sum+temp;
			m=m%10;
		}
		System.out.print(sum);
		}
	}

