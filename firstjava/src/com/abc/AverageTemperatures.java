package com.abc;
import java.util.*;
public class AverageTemperatures {
	public void main(String args[])
	{
		int cout;
		double average,next,sum;
		sum  = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������¶�:");
		for(cout = 0;cout < 7; cout++)
		{
			next = sc.nextDouble();
			sum+=next;
			
		}
		System.out.println(sum);
		average = sum/7;
		System.out.println("ƽ������Ϊ��"+average);
	}
}
