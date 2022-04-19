package com.training.intial;
import java.util.*;
public class Electricity {
	
	
//	public static int[] getArray() {
//		
//		Scanner scan1=new Scanner(System.in);
//		System.out.println("enter number of consumers");
//		String scan2=scan1.nextLine();
//		
//	String[] arrayData = scan2.split(" ");
//	final int Size=arrayData.length;
//	int[] intArr=new int[Size];
//
//	for(int i=0;i<Size;i++) {
//		intArr[i]=Integer.parseInt(arrayData[i]);
//	}scan1.close();
//	return intArr;
//	}
//	
//	public static void printArray(int[] array) {
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("Consumer: " +" " );
//		}
//			
//		}
	
	
public static void main (String args[]){
	
	
	
//int units =0;
double amount=0.0;
Scanner scan=new Scanner(System.in);

//System.out.print("Enter number of unit you consumed: ");
System.out.print("Enter Consumerno, name, units ");
//units=scan.nextInt();//taking input from user for usage unit
String Getdata = scan.nextLine();
try {
String[] arrayData = Getdata.split(",");
//System.out.print("Consumer Number: "+arrayData[0]);
//System.out.print("Name: "+arrayData[1]);
double units = Double.parseDouble(arrayData[2]);
//System.out.print("Total unit is: "+units);
//System.out.print("Units Used: "+arrayData[2]);

String[] da=new String[3];
da[0]="Consumerno";
da[1]="name";
da[2]="units";


ArrayList data=new ArrayList();

data.add(arrayData[0]);
data.add(arrayData[1]);
data.add(arrayData[2]);
System.out.println(data);

if (units <= 50) {
	throw new Exception();
}
else
{
	double unitRate1 = 1.25;
	double unitRate2 = 1.00;
	double unitRate3 = 0.75;


	if(0<units && units<=200){
	    amount=50;
	}
	else if(units>201 && units<=500){
	    amount=units * unitRate1;
			
		
	}
	else if (units>501 && units<=1000){
		amount=units * unitRate2;
	}
	else if(units>1001){
		amount=units * unitRate3;
	}
	else{
	    amount=0;
	}
	
	System.out.println("Total amount is: "+amount);
	
}
}
catch (Exception e) {
	
	System.out.println("No of units can not be less than 50");
}
//int[] myArr= getArray();
//printArray(myArr);

}
}

