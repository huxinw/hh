package com.abc;

class point{
	double x,y;
	public void setXY(double a,double b)
	{
		x = a;
		y = b;
	}
	public double getX()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
	public void disp()
	{
		System.out.println("点的当前坐标为：("+x+","+y+")");
	}
}
public class javaTest {

	public static void main(String args[])
	{
		point p1 = new point();
		p1.disp();
		p1.setXY(3.2,5.6);
		p1.disp();
		
	}

}
