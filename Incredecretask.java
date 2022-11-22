package com.task1;

public class Incredecretask 
{
	int c;
	static int e;
	Incredecretask()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) 
	{
	int a=34;
	int b=21;
	new Incredecretask().c-=a++ + ++b;
	int d=--a + --b + new Incredecretask().c--;
	e=a + +b+ + new Incredecretask().c+d--;
	int f=-a + b-- + -new Incredecretask().c-d++;
	int sum=a+b+new Incredecretask().c+d+e+f;
	System.out.println("sum="+sum);
	}
}
