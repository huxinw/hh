package com.abc;
import java.util.*;
public class AverageTemperatures {
	public void main(String args[])
	{
		int cout;
		double average,next,sum;
		sum  = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入七天温度:");
		for(cout = 0;cout < 7; cout++)
		{
			next = sc.nextDouble();
			sum+=next;
			
		}
		System.out.println(sum);
		average = sum/7;
		System.out.println("平均气温为："+average);
	}
}
