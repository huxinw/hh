package com.abc;

public class charsample1 {
	public static void main(String argc[])
	{
		char ch1 = '\b';
		char ch2 = '\t';
		char ch3 = '\n';
		char ch4 = '\r';
		char ch5 = '\"';
		char ch6 = '\'';
		char ch7 = '\\';
		System.out.println("南京" + ch1 + "长江大桥");
		System.out.println("南京" + ch2 + "长江大桥");
		System.out.println("南京" + ch3 + "长江大桥");
		System.out.println("南京" + ch4 + ch3 + "长江大桥");
		System.out.println(ch5 + "南京长江大桥" + ch5);
		System.out.println(ch6 + "南京长江大桥" + ch6);
		System.out.println(ch7 + "南京长江大桥" + ch7);
	}
}
