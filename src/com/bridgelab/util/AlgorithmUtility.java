package com.bridgelab.util;
import java.util.Scanner;
import java.util.Stack;
public class AlgorithmUtility{
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
	                    
	                 return sc.nextLine();   
	                    
	                  }
	                 catch(Exception e)
	                 {
	                     e.printStackTrace();
	                    
	                 }
	                 return null; 
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

	     
	     
	     
	     
	     
	     
	     
	     
	    // 
	private static String[] args;




	public void Prime()
	{
	   
	        
		int start=1, end=1000, i, j, count=0;

        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter the Range :\n");
		
        System.out.print("Enter Starting Number : ");
        start = scan.nextInt();
        System.out.print("Enter Ending Number : ");
        end = scan.nextInt();
	        System.out.print("Prime Numbers Between " + start + " and " +end+ " is :\n");
	        for(i=start; i<=end; i++)
	        {
	            count = 0;
	            for(j=2; j<i; j++)
	            {
	                if(i%j == 0)
	                {
	                    count++;
	                    break;
	                }
	            }
	            if(count == 0)
	            {
	                System.out.print(i + " ");
	            }
	        }
	}
   
	 public int[] bubbleSort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n; i++) 
	            for (int j = i+1; j < n; j++) 
	                if (arr[i] > arr[j]) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    int temp = arr[i]; 
	                    arr[i] = arr[j]; 
	                    arr[j] = temp; 
	                } 
	        return arr;
	    } 	        
	 public void tempconversion() {
		  
		    System.out.println("Enter the temperature in Fahrenheit: ");
		    Scanner scanner=new Scanner(System.in);
		    float fahrenheit=scanner.nextFloat();
		    float celsius=(fahrenheit-32)*5/9;
		    System.out.println("Temperature in Celsius: "+celsius);
		  }
	 



//sqrt
public static void sqrt(int n) {
	 double c=n;
     double epsilon = 1e-15;    // relative error tolerance
     double t=c;              // estimate of the square root of c

     // repeatedly apply Newton update step until desired precision is achieved
     while (Math.abs(t - c/t) > epsilon*t) {
         t = (c/t + t) / 2.0;
         System.out.println(t);
     }

     // print out the estimate of the square root of c
    
	
	
	
}
//insertion sort
public static void insertionSort() {
	char temp;
	String sortedString="";
	Scanner inputString=new Scanner(System.in);
	System.out.println("enter the string");
	String str=inputString.next();
	inputString.close();
	char[] chArr=str.toCharArray();
	for( int i=0;i<chArr.length;i++) { 
		for( int j=0;j<chArr.length;j++) {
			if(chArr[i]<chArr[j]) {
				temp=chArr[i];
				chArr[i]=chArr[j];
				chArr[j]=temp;
				
			}
		}
	}
	for( int k=0;k<chArr.length;k++) {
		sortedString=sortedString+chArr[k];
	}
	System.out.println("our sorted string is"+sortedString);
	
}

//day of week
public static void dayOfWeek(int m,int d,int y) {
	
	
	int y0 = y − (14 − m) / 12;
		int 	x = y0 + y0/4 − y0/100 + y0/400;
	int		m0 = m + 12 × ((14 − m) / 12) − 2;
		int	d0 = (d + x + 31m0 / 12) mod 7;

	
}
	
	
	//monthly payment//
public  static void monthlyPayment(int P,double R,int Y)
{
    double r=R/(12*100);
    double n=12*Y;

    double c=Math.pow((1+r),-n);
    double payment=((P*r)/1-c);
    System.out.println(payment);
}

//vending machine	
public  void calculate(int money,int[]notes )
	{
	int i=0;
  	int total=0;

  //Initialization of New Array
  	
		//calling calculate Function
    int rem;
	if(money==0)
	{
		System.out.println("no money");
	}
	else
	{ 
		for(i=0;i<notes.length;i++) {
	
		if(money>=notes[i])
		{
			// logic for Calculating The notes
			int calNotes =money/notes[i];
			rem = money%notes[i];
			money =rem;
			total += calNotes;
			System.out.println(notes[i]+   " Notes ---> " +calNotes );
		}
		
		
	}
}
}
//find your number
public void findNumber(String value,int low, int up, int mid, int count, int n)
{
   
       System.out.println("Is this the number you taught?:"+mid);
   
//       System.out.println("If the number you taught is greater than " +mid+ " then enter HIGH");
//       System.out.println();
//   System.out.println("If the number you taught is greater than " +mid+ " then enter LOW");
//   System.out.println();
//   System.out.println("If the number you taught is same as " +mid+ " then enter YES");
//      
    System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
    value=AlgorithmUtility.StringValue();
       do
    {
      
            if (value.equals("high"))
        {
            low= mid;
            count++;
            mid=(low+ up+1)/2;
            findNumber(value,low,  up,  mid, count, n);
        }
            
            else if(value.equals("low"))
         {
             up=mid;
             count++;
             mid=(low+ up+1)/2;
             findNumber(value,low,  up,  mid,count, n);
         }
            
            
        else if (value.equals("yes"))
        {
            System.out.println("The number you thought was: "+mid);
            int no=count+1;
            System.out.println("It takes "+no+" times to find the number which you taught");
           
            break;
        }

    }
    while(low<=up);
        if (count>n)
        {
            System.out.println("Number is not found");
        }
        else
        {
            System.exit(0);
        }
        }


//DECIMALTOBINARY

public static void decimaltobinary()
{Scanner in = new Scanner(System.in);

// Create Stack object
Stack<Integer> stack = new Stack<Integer>();

// User input 
System.out.println("Enter decimal number: ");
int num = in.nextInt();
while (num != 0)
{
  int d = num % 2;
  stack.push(d);
  num /= 2;
} 

System.out.print("\nBinary representation is:");
while (!(stack.isEmpty() ))
{
  System.out.print(stack.pop());
}
System.out.println();
}
}




	
	
	
	
	
	
	
	

	





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		

			
		







