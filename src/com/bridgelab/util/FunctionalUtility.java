package com.bridgelab.util;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




//replace string//
public class FunctionalUtility<E> { 
	static Scanner sc = new Scanner(System.in);


	public static int intValue()
	{
		try
		{

			return sc.nextInt();   

		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		return 0;
	}   

	public static String StringValue()
	{
		try
		{

			return sc.next(); 

		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		return null;
	}
	public static boolean booleanValue()
	{
		try
		{

			return sc.hasNext();  

		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		return false; 
	}

	public static double doubValue()
	{
		try
		{

			return sc.nextDouble();	                    
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		return 0.0; 
	}

	public static long longValue()
	{
		try
		{

			return sc.nextLong();  

		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		return 0; 
	}



	public static void replaceString(String str) {
		 String uname = FunctionalUtility.StringValue();
		
	        if (str.length()>=3) {
	            str = str.replaceFirst("<<username>>", uname);
	            System.out.println(str);
	        } else
	            System.out.println("cannot be replaced");
	    }
	

	//leapyear//
	public void leapYear() {
		int year = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any year");
		year = s.nextInt();
		s.close();

		if (String.valueOf(year).length() == 4) {
			if (year % 4 == 0 && year % 400 == 0) {
				System.out.println("year is leap year");
			} else if (year % 100 == 0) {
				System.out.println("year is not leap year");
			} else {
				System.out.println("year is not leap year");
			}
		}
	}


	//power
	public void power() {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int count = 0;
		if (n > 0 && n < 31) {
			for (int i = 0; i <=n; i++) {
				System.out.println(Math.pow(2, count));
				count++;

			}

		}

		else {
			System.out.println("out of range");

		}
	}


	//harmonic
	public void harmonic() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int i;
		float sum = 0;

		for (i = 1; i <= n; i++) {
			sum = sum + (float) 1 / i;
		}

		System.out.println(sum);
	}

	//prime
	public void Prime() {

		int i, m = 0, flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
		System.out.print("Factors of " + n + " are: ");
		for (int i1 = 1; i1 <= n; ++i1) {
			if (n % i1 == 0) {
				System.out.print(i1 + " ");

			}
		}
	}


	//flipcoin
	public void flipCoin(int count) {
		int head = 0;
		int tail = 0;
		int i = count;
		Random result = new Random();
		while (count > 0) {
			int r = result.nextInt(2);
			if (r == 0)
				tail++;
			else
				head++;
			count--;
		}

		System.out.println("Number of heads=" + head * 100 / i);
		System.out.println(head);
		System.out.println(tail);

		System.out.println("Number of tails=" + tail * 100 / i);
	}


	//gambler
	public void Gambler(int Stake,int Goal,int n) {

		int bets=0,wins=0,loss=0;
		for(int i=0;i<n;i++)
		{
			int money=Stake;
			while(money>0 && money<Goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					money--;   //wins $1

				}
				else
					money++;   //loss $1

			}
			if(money==Goal)

				wins++;
			else
				loss++;

		}
		System.out.println(wins+ ":"+loss+ ":"+n);    
		System.out.println("percentage of wins:" +100*wins/n);
		System.out.println("percentage of loss:" +100*loss/n);
		System.out.println("bet is" +bets);   
	}	



	//Triplets
	public static List<String> sumOfThree(int[] arr) {

		boolean flag = false;
		List<String> tripletList = new ArrayList<>();
		for (int p = 0; p < arr.length - 2; p++) {
			for (int q = p + 1; q < arr.length - 1; q++) {
				for (int r = q + 1; r < arr.length; r++) {

					if (arr[p] + arr[q] + arr[r] == 0) {
						System.out.println("description\n" + arr[p] + arr[q] + arr[r]);
						tripletList.add("" + arr[p] + arr[q] + arr[r]);
					}
				}
			}

		}
		return tripletList;

	}

	//array2d
	public  static void array2D() {
		FunctionalUtility f1=new FunctionalUtility();
		System.out.println("enter the number of rows:");
		int m=FunctionalUtility.intValue();    
		System.out.println("enter the number of column:");
		int n=FunctionalUtility.intValue();    
		System.out.println("1:Integer  2:Double  3:Boolean" );
		int flag=FunctionalUtility.intValue();
		switch(flag)
		{
		case 1:Integer[][] array=new Integer[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=FunctionalUtility.intValue();
			}
		}
		f1.displayArray(array,m,n);
		break;


		case 2:Double[][] darray=new Double[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{

				darray[i][j]=FunctionalUtility.doubValue();            }
		}
		f1.displayArray(darray,m,n);
		break;

		case 3:Boolean[][] barray=new Boolean[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				barray[i][j]=FunctionalUtility.booleanValue();
			}
		}
		f1.displayArray(barray,m,n);
		break;

		default: System.out.println("Select among the choice");
		}

		//FunctionalUtility.close();
	}
	public   void displayArray(E[][]garray,int m,int n)
	{
		for(int i=0;i< m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(garray[i][j] +" ");
			}
			System.out.println();
		}

	}

	//distance//
	public void distance() {


		int x1,x2,y1,y2;

		double dis;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter x1 point");

		x1=sc.nextInt();

		System.out.println("enter y1 point");

		y1=sc.nextInt();

		System.out.println("enter x2point");

		x2=sc.nextInt();

		System.out.println("enter y2 point");

		y2=sc.nextInt();

		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

		System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	} 



	//quadratic equation
	public static void quadraticEquation() {



		int a, b, c;

		double root1, root2, d;

		Scanner s = new Scanner(System.in);

		System.out.println("Given quadratic equation:ax^2 + bx + c");

		System.out.print("Enter a:");

		a = s.nextInt();

		System.out.print("Enter b:");

		b = s.nextInt();

		System.out.print("Enter c:");

		c = s.nextInt();

		System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);

		d = b * b - 4 * a * c;

		if(d > 0)

		{

			System.out.println("Roots are real and unequal");

			root1 = ( - b + Math.sqrt(d))/(2*a);

			root2 = (-b - Math.sqrt(d))/(2*a);

			System.out.println("First root is:"+root1);

			System.out.println("Second root is:"+root2);

		}

		else if(d == 0)

		{

			System.out.println("Roots are real and equal");

			root1 = (-b+Math.sqrt(d))/(2*a);

			System.out.println("Root:"+root1);

		}

		else

		{

			System.out.println("Roots are imaginary");

		}

	}

	//windchill
	public static void windChill() {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a temperature between -58F and 
		// 41F and a wind speed greater than or equal to 2.
		System.out.print("Enter the temperature in Fahrenheit " +
				"between -58ºF and 41ºF: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = input.nextDouble();

		// Compute the wind chill index
		double windChill = 35.74 + 0.6215 * temperature -
				35.75 * Math.pow(speed, 0.16) +
				0.4275 * temperature * Math.pow(speed, 0.16);

		// Display result
		System.out.println("The wind chill index is " + windChill);
	}

	//stopwatch

	//to start timer
	public  static long start()
	{
		long startTimer=System.currentTimeMillis();
		return startTimer;
	}

	// to stop timer
	public static long stop()
	{
		long stopTimer=System.currentTimeMillis();
		return stopTimer;
	}

	public static long getElapsedTime(long startTimer, long stopTimer) 
	{
		long elapsed=stopTimer-startTimer;
		return elapsed;

	}	



	//primefactors
	public static void primeFactors(int number) 
	{

		for (int i = 2; i <= number; i++) {

			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}

		//        if (number >2) //brute force
		//        	System.out.println();
	}


	//coupen number
	public int couponNumber(int n)
	{
		boolean[] collect= new boolean[n]; 
		int count = 0;                          
		int dist = 0;                       
		while (dist< n)
		{
			Random r=new Random();
			int value =r.nextInt(n);
			count++;                                
			if (collect[value]==false)
			{
				dist++;
				System.out.println(dist);
			}
			else
			{
				collect[value] = true;
			}
		}

		return  count;
	}
	// permutation
	public static List<String> recursion(String str, int initial, int last,List<String> arr) {

		if (initial == last) {
			arr.add(str);
		} else {
			for (int i = initial; i < last; i++) {
				str = swap(str, initial, i);
				recursion(str, (initial + 1), last,arr);
				//       str = swap(str, initial, i);
			}
		}
		return arr;
	}

	/**
	 * static method is used to swap the string alphabets
	 * @param str string value
	 * @param i index of string
	 * @param j index of string
	 * @return String
	 */
	public static String swap(String str, int i, int j) {
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);

	}

	/**
	 * 
	 * static method is used to possible iterations we can do it for a string
	 * @param s is the string value
	 * @return arr array of string
	 */
	public static List<String> iteration(String str) {
		List<String> arr = new ArrayList<>();
		arr.add(String.valueOf(str.charAt(0)));
		for (int i = 1; i < str.length(); i++) {
			for (int j = arr.size() - 1; j >= 0; j--) {
				String s = arr.remove(j);
				for (int k = 0; k <= s.length(); k++) {
					arr.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
				}
			}
		}
		return arr;
	}

	/**
	 * static method is used to sort the array list
	 * @param arr is arraylist
	 * @return arraylist
	 */
	public static List<String> listSort(List<String> arr)
	{
		Collections.sort(arr);
		return arr;
	}

	/**
	 * static method is used to compare 2 array list
	 * @param arr1 array list1
	 * @param arr2 array list2
	 * @return integer value
	 */
	@SuppressWarnings("unused")
	public static int comparision(List<String> arr1,List<String> arr2)
	{
		for(int i=0;i<arr1.size();i++)
		{
			if(arr1.get(i).compareTo(arr2.get(i))==0)
			{
				return 1;
			}
			else
				return 0;
		}
		return 0;
	}


	//tictaktoe
	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;

	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -10;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}

	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o |");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x |");
				} else
					System.out.print("   |");
			}
			System.out.println("|");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}
	/*
	 * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
	 * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
	 */

	public static void putVal() 
	{
		int i;
		int j;
		if (player % 2 == 1)
		{
			i = (int) (Math.random() * 10) % 3;
			j = (int) (Math.random() * 10) % 3;
		} else
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter value of x and y by space");
			i = s.nextInt();
			j = s.nextInt();
		}
		if (BOARD[i][j] == -10)
		{
			if (player % 2 == 0)
			{
				BOARD[i][j] = 0;
			} else {
				BOARD[i][j] = 1;
				System.out.println("Coumputer Choosing " + i + " " + j);
			}
		} 
		else
			putVal();

	}

	public static boolean win() {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	}
	public static void play() 
	{
		initBoard();
		while (isEmpty)
		{
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win())
			{
				System.out.println("Player won");
				return;
			}
		}
	}
}
