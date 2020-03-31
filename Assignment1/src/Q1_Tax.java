import java.util.*;
public class Q1_Tax {
// program that takes the age of the employee and the amount of salary from 
		//the user and then calculates the tax.
	public static void main(String[] args) {
		
		int salary,age;
		double tax;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter age of employee= ");
		age=input.nextInt();
		System.out.println("Enter salary of employee=");
		salary=input.nextInt(); 
		if(age>=18 && age<=95) 
		{if(age>=18 && age<=35) {
			tax=0.16*17000+0.25*(salary-17000);
			System.out.println("Tax is:"+tax);}
	else if(age>=36 && age<=50) {
			tax=0.16*23000+0.25*(salary-23000);
			System.out.println("Tax is:"+tax);}
	else if(age>=51 && age<=74) {
			tax=0.16*29000+0.25*(salary-29000);
			System.out.println("Tax is:"+tax);}
		else if(age>=75 && age<=95) {
				tax=0.16*14000+0.25*(salary-14000);
				System.out.println("Tax is:"+tax);
	}}
		else {System.out.println("Age must be between 18 and 95");}}
}

