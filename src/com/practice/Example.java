package com.practice;

public class Example {
	  
	private  final double pi = 3.14;
	
	// Method to Swap two number with help of 3 digit
	 void swapWithDigit(double a, double b) {
		double temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value after swap "+a+ " "+b);
	}
	
	public  void perimeterCircle(double r) {
		System.out.println(" Periment or circle is "+ (2*pi*r));
	}
	
	public  void AreaCircle(double r) {
		System.out.println(" Area or circle is "+ (pi*r*r));
	}
	
	// Getting Installed Java details on System.
	public void JavaVersion() {
		System.out.println("\nJava Version: "+System.getProperty("java.version"));
	    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: "+System.getProperty("java.home"));
	    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	}
	
	public void IntergerCompariosn(int number1, int number2) {
		if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );  
	}
	// Method to calculate Sum of given digit
	public void SumOfDigit(int n) {
		
		String str =Integer.toString(n);
		int len =str.length();
		int sum=0;
		for(int i =0;i<len;i++) {
			//System.out.println(str.charAt(arg0));
			sum=sum+Integer.parseInt((Character.toString(str.charAt(i))));
			
		}
		
		System.out.println("Sum of digit is :"+sum);
	}
	
	public void ReverseString(String s) {
		char[] newString = s.toCharArray();
		int size = newString.length;
		//char[] reverseArray = new char[size];
		for(int i=size-1;i>=0;i--) {
			System.out.print(newString[i]);
		}
	}
	
	public void sqrRoot(double n) {
		if(n==0||n==1) {
			System.out.println("Sqr root is "+n);
		}
		else {
			
		}
	}
	
	public void Checkpalindrome(int o) {
		String str =Integer.toString(o);
		char[] ch = str.toCharArray();
		
		int size = ch.length;
		char[] newCh = new char[size];
		int j=0;
				
		for(int i=size-1;i>=0;i--) {
			newCh[j]=ch[i];
			j++;
		}
		
		String valueOf = String.valueOf(newCh);
		System.out.println(valueOf);
		if(valueOf.equals(str)) {
			System.out.println(" palindrome String");
		}
		else {
			System.out.println(" NOT palindrome String");
		}
	}
	
	
public void SumOfDigitTillSingleDigit(int n) {

	String str =Integer.toString(n);
	int sum=0;
	while(str.length()!=1) 
	{
		int len =str.length();
		
		for(int i =0;i<len;i++) {
			//System.out.println(str.charAt(arg0));
			sum=sum+Integer.parseInt((Character.toString(str.charAt(i))));
			

		}
		System.out.println("Sum of number "+n+" is "+sum);
        
		SumOfDigitTillSingleDigit(sum);
	
		//if()
		break;
	}
	
	//break;
	
	
}
	
public void CoinStaricage(int givennumber) {
	if(givennumber>0) {
		
	
	int count=0;
	int remaining = givennumber;
	for(int i=1;i<givennumber;i++) {
		if(remaining<i) {
			break;
		}
		for(int j=1;j<=i;j++) {
			if(count==givennumber) {
				break;
			}

			System.out.print("$");
			count++;	
			remaining = givennumber-count;


		}

		System.out.println();


	}
	}
	else {
		System.out.println("Please enter Positive Number");
	}
}
	
	
		
}

