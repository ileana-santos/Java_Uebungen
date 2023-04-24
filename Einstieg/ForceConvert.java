public class ForceConvert {
	public static void main(String[] args) {
		//Convert a double to a int
		int n1 = (int)1.9;
		System.out.println("n1= " + n1);

		//Convert int to byte
		int n2 = 200;
		byte b1 =(byte)n2;
		System.out.println("b1= " + b1); //

		//int x =(int)10*3.5 + 6*1.5; //Incompatible types: possible lossy conversion from double to int
		//double darf nicht nicht in int

		int y = (int)(10*3.5 + 6*1.5);// Add the parentesis so in that way the code fallows the mathematical order of operrations
		System.out.println(y);

		char c1 = 100;
		int m = 100;
		char c2 = m;//int darf nicht int char; Incompatible types: conversion from int to char
		char c3 = (char)m;// It works
		System.out.println(c3);

		long l1 = 100;
		float f1 = l1;// It works beacause (long past in float)
		System.out.println(f1);
	}
}