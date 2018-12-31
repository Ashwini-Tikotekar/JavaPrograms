package com.bridgelab.util;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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



	public void replaceString(String s) {
		if (s.length() >= 3) {
			System.out.println(s.replaceAll("username", "ash"));

		} else
			System.out.println("please enter more than three characters");
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
		        System.out.println("percentage of wins:" +wins*100/n);
		        System.out.println("percentage of loss:" +loss*100/n);
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
}

