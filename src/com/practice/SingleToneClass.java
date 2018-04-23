package com.practice;

public class SingleToneClass {

	private static SingleToneClass sigle=null;
	public String s;
	
	private SingleToneClass() {
		s="This is singlton class";
	}
	
	public static SingleToneClass getInstance() {
		if(sigle==null) {
			sigle=new SingleToneClass();
		}
		return sigle;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleToneClass x = SingleToneClass.getInstance();
		SingleToneClass y = SingleToneClass.getInstance();
		SingleToneClass z = SingleToneClass.getInstance();
		x.s="My Name is Praveen";
		y.s="My Name is Praveen1";
		z.s="My Name is Praveen2";
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		

	}

}
