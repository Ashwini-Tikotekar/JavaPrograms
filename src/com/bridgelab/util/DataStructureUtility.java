package com.bridgelab.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.bridgelabs.datastructureprogram.BalancedParenthesis.Node;


public class DataStructureUtility
{
	static Scanner sc = new Scanner(System.in);

	public static int intValue()
	{


		return sc.nextInt();
	}


	public static double doubleValue()
	{
		return sc.nextDouble();
	}


	public static String StringValue()
	{

		return sc.next();
	}
	public static boolean booleanvalue()
	{
		return sc.hasNextBoolean();
	}

	//calender
	public static void printMonth(int year, int month) {

		//Print the headings of the calendar
		printMonthTitle(year, month);

		//Print the body of the calendar
		printMonthBody(year, month);
	}

	/** Print the month title, e.g., May, 1999 */

	static void printMonthTitle(int year, int month) {

		System.out.println("         " + getMonthName(month) + " " + year);
		System.out.println("–––––––––––––––––––––––––––––");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

	}

	/** Get the English name for the month */
	static String getMonthName(int month) {
		//String monthName = null;
		String[] m = {"", "January","Feb","March","April","May","June","July","August","September","October","November","December"};
		System.out.println(m[month]);

		return m[month];
	}

	/** Print month body */
	static void printMonthBody(int year, int month) {

		// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);

		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			if (i < 10)
				System.out.print("   " + i);
			else
				System.out.print("  " + i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

	/** Get the start day of the first day in a month */

	static int getStartDay(int year, int month) {

		//Get total number of days since 1/1/1800
		int startDay1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		//Return the start day
		return (totalNumberOfDays + startDay1800) % 7;
	}

	static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		//Get the total days from 1800 to year - 1
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		//Add days from January to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}
	static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2) return isLeapYear(year) ? 29 : 28;

		return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	public static String[] intTostring(int[] abc) {
		String strarray[]=new String[abc.length];
		int l=0;
		for(int i=0;i<abc.length;i++) {
			if(abc[i]!=0) {
				String str=String.valueOf(abc[i]);
				strarray[l]=str;
				l++;
			} 
		}
		return strarray;
	}

// prime
	
	public static List<Integer> primeNumbers(int m,int n) {
	    List<Integer> lst=new ArrayList<Integer>();
	    int temp;

	    //swapping of bounds if the given lower bound is greater than upper bound
	    if(m>n) {
	        temp=m;
	        m=n;
	        n=temp;}
	    int flag=1;
	    //try all the possible values from lower bound to upper bound
	    //if the number has the factor then it must be checked within lower bound
	    for(int i=m;i<=n;i++){
	        for(int j=2;j<i;j++){
	            //If the number is divisible by any of the number then
	            //initializing flag to zero and break
	            //else flag is initialized to one
	            if(i%j==0){
	                flag=0;
	                break;}
	            else
	                flag=1;}
	        //If the number is prime which is indicated by the flag,
	        //then adds the number into an ArrayList.
	        if(flag==1)
	            lst.add(i);}
	    return lst;
	}
	}


