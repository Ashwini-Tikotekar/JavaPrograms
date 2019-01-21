package com.bridgelab.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import com.bridgelab.util.QueueLinkedList;
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
	public static boolean isLeapYear(int year) {
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

	//binary search tree
	public static double binomialCoeff(double n, double k) {
		double res = 1.0;
		for (int i = 0; i < k; ++i) {
			res =res * (n - i);
			res =res /(i + 1);
		}
		return res;
	}

	public static double countBinary(double n) {
		double c = binomialCoeff(2 * n, n);
		double count = c / (n + 1);
		return count;
	}
	////find prime

	public static List<Integer> findPrime(int low,int high) {
		int flag = 1;
		int i;
		List<Integer> arr = new ArrayList<>();
		for (i = low; i < high; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			if (flag == 1) {
				arr.add(i);
			}
		}
		return arr;
	}
	//////
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.anagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return primeAnagram;
	}

	public static void printPrimeAndAnagram(List<List<Integer>> list1)
	{
		List<Integer> demo = new ArrayList<Integer>();
		for (int i = 0; i < list1.size(); i++) {
			demo = list1.get(i);
			if (i == 0) {
				System.out.println("Numbers which are prime and anagram are:"+demo.size());
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			} else {
				System.out.println("Numbers which are prime but not anagram are:"+demo.size());
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			}
			System.out.println();
		}
	}

	//prime anagram stack
	public static Stack<Integer> primeAnagramstack(List<Integer> primeList) {
		//	Set<Integer> primeAnagram = new HashSet<>();
		Stack<Integer> stack=new Stack<Integer>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.anagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					stack.push(primeList.get(i));
					stack.push(primeList.get(j));
				}
			}
		}
		return stack;
	}

	//prime anagram queue


	public static Queue<Integer> primeAnagramqueue(List<Integer> primeList) {
		Queue<Integer> queue=new Queue<Integer>(1000);
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.anagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					queue.enqueue(primeList.get(i));
					queue.enqueue(primeList.get(j));
				}
			}
		}
		return queue;
	}
	//caleder



	public static int day(int month, int i, int year)
	{ 
		int y = year - (14 - month) / 12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (i + x + (31*m)/12) % 7;
		return d;
	}

	/**
	 * to find leap year or not
	 * @param year of integer type
	 * @return of boolean type
	 */
	//////////////////////////////////////////////////
	public static QueueLinkedList<QueueLinkedList<String>> deckQueueStore(String[] deck )
	{
		QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
		QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
		System.out.println("Total number of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];

			}
			String[] str2 = AlgorithmUtility.sortArray1(demo);
			for (int k = 0; k < str2.length; k++) {
				queueLinkedList.enqueue(str2[k]);
			}
			mainQueue.enqueue(queueLinkedList);
			queueLinkedList = new QueueLinkedList<String>();
			//continue;
		}
		return mainQueue;
	}

	//////////////////////////////////////////
	public static void displayDeck(QueueLinkedList<QueueLinkedList<String>> mainQueue)
	{
		for (int i = 0; i < mainQueue.getSize(); i++) {
			QueueLinkedList<String> queue2 = mainQueue.dequeue();
			System.out.println("------------------- Person " + (i + 1)
					+ " ------------------");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.println(queue2.dequeue() + " ");
			}
			System.out.println();
		}
	}
}