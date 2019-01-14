package com.bridgelab.util;
import java.util.ArrayList;
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
		    
		    System.out.println("Enter the temperature in  Celsius:");
		    Scanner sc=new Scanner(System.in);
		    float Celsius=sc.nextFloat();
		     float Fahrenheit=( Celsius*9/5) + 32;

		    System.out.println("Temperature in  Fahrenheit:"+Fahrenheit);
		  }
	 



//sqrt
public static void sqrt(int n) {
	 double c=n;
     double epsilon = 1e-15;    // relative error tolerance
     double t=c;              // estimate of the square root of c

     // repeatedly apply Newton update step until desired precision is achieved
     while (Math.abs(t - c/t) > epsilon*t) {
         t = (c/t + t) / 2.0;
     }
     System.out.println(t);

     // print out the estimate of the square root of c
    
	
	
	
}

//day of week
public static int dayOfWeek(int m,int d,int y) {
	
	
	int y0 = y - (14 - m) / 12;
    int  x = y0 + y0/4 - y0/100 + y0/400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
	int	d0 = (d + x + 31*m0 / 12) % 7;
    return d0;
	
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
static int rem;
static int i=0;
static int total=0;
  public static int calculate(int money,int[]notes)
{
    //Method to calculate the notes to be dispatched
   
    if(money==0)
    {
        return -1 ;
    }
    else
    {
        if(money>=notes[i])
        {
            int calNotes =money/notes[i];
            rem = money%notes[i];
            money =rem;
            total += calNotes;
            System.out.println(notes[i]+  "rs Notes are  " +calNotes );
        }
        i++;
        return calculate(money, notes);//method recursion
    }
}
		


//find your number
  public  static void binarySearch(int lower,int upper,int middle,int count,String input,int n)
  {
      
      System.out.println("Is your number:"+middle);
      System.out.println();
      System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
      input=AlgorithmUtility.StringValue();
      
      do
      {
          if (input.equals("high"))
          {
              lower= middle;
              count++;
          }
          else if (input.equals("yes"))
          {
              System.out.println("The number you thought was: "+middle);
              int no=count+1;
              System.out.println("It takes "+no+" times to find your exact number" );
              break;
          }
          else if(input.equals("low"))
          {
              upper=middle;
              count++;
          }
          if(count<n)
          {
              middle=(lower+ upper+1)/2;
              System.out.println("Is your number "+middle+":");
              input=AlgorithmUtility.StringValue();
          }
      }
      while(lower<=upper);
      if (count>n)
      {
          System.out.println("Number not found");
      }
      else
      {
          System.exit(0);
      }

}


//DECIMALTOBINARY

public static int[] toBinary(int num) {
    int bin[] = new int[8];
    int index = 0;
    while (num > 0) {
        bin[index++] = num % 2;
        num = num / 2;
    }
    return bin;
}

//swap nibbles
 public static int swapNibbles(int x) 
{ 
   
	  return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);     

	 
} 
	
 
//anagram
 public static boolean anagram(String str1, String str2) {
		
		
	 char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		if (ch1.length != ch2.length) {
			return false;
		} else {
			ch1 = sortChar(ch1);
			ch2 = sortChar(ch2);
			str1 = String.valueOf(ch1);
			str2 = String.valueOf(ch2);
			boolean b = str1.equals(str2);
			{
				if (b == true)
					return true;
			}
		}
	
return false;
 }
public static char[] sortChar(char[] ch) {
	char[] b = new char[ch.length];
	for (int i = 0; i < ch.length; i++) {
		int count = 0;
		for (int j = 0; j < ch.length; j++) {
			if (ch[i] < ch[j]) {
				count++;
			}
		}
		b[count] = ch[i];
	}
	return b;
}
 
 
//insertion sort
 
 public static String[] insertionSort(String array[], int f){
     String temp="";
     for(int i=0;i<f;i++){
     for(int j=i+1;j<f;j++){
     if(array[i].compareToIgnoreCase(array[j])>0){
     temp = array[i];
     array[i]=array[j];
     array[j]=temp;
     }
     }
     }
     return array;
     }
 
 //merge sort
 
 public static void mergeSort(String array[],int low,int high)
 {
     int n=high-low;
     if(n<=1)
         return;
     int mid=low+n/2;
     mergeSort(array,low,mid);
     mergeSort(array,mid,high);
     String[] temparr=new String[n];
     int i=low,j=mid;
     for(int k=0;k<n;k++)
     {
         if(i==mid)
             temparr[k]=array[j++];
         else if(j==high)
             temparr[k]=array[i++];
         else if(array[j].compareTo(array[i])<0)
             temparr[k]=array[j++];
         else
             temparr[k]=
             array[i++];
     }

     for(int k=0;k<n;k++)
     {
         array[low +k]=temparr[k];
     }
 }
 //binarysearchword
 public static int binSearch(String [] str,String key)
 {
     //int n=str.length;
     int first  = 0;
     int last   = str.length - 1;
     int middle = (first + last)/2;

     while( first <= last )
     {
       if ( str[middle].compareTo(key)<0 )
         first = middle + 1;    
       else if ( str[middle].equalsIgnoreCase(key) )
       {
        return middle;
       }
       else
          last = middle - 1;

       middle = (first + last)/2;
    }
  return -1;
 }

 
 //prime anagram palindrome
 public static boolean Pallindrome(int n) {
     int temp = n;
     int sum = 0;
     while (temp != 0) {
         int r = temp % 10;
         sum = sum * 10 + r;
         temp = temp / 10;
     }
     if (sum == n) {
         return true;
     }
     return false;
 }
 /**
  * to check the values are anagrams or not
  *
  * @param n1 input number1
  * @param n2 input number2
  * @return
  */
 public static boolean anagram(int n1, int n2) {
     int[] n1count = count(n1);
     int[] n2count = count(n2);
     for (int i = 0; i < n2count.length; i++) {
         if (n1count[i] != n2count[i]) {
             return false;
         }
     }
     return true;
 }
 public static void primePallindrome() {
     System.out.println();
     boolean b;
     for (int j = 2; j <= 1000; j++) {
         b = true;
         for (int i = 2; i < j / 2; i++) {
             if (j % i == 0) {
                 b = false;
                 break;
             }
         }
         if (b && Pallindrome(j))
             System.out.print(j + " ");
     }
 }

 /**
  * Function to check if no is anagram or not
  */
 public static void primeAnagrams() {
     ArrayList<Integer> ar = new ArrayList<Integer>();
     System.out.println();
     boolean b;
     for (int i = 2; i <= 1000; i++) {
         b = true;
         for (int j = 2; j < i / 2; j++) {
             if (i % j == 0) {
                 b = false;
                 break;
             }
         }
         if (b)
             ar.add(i);
     }
     for (int i = 0; i < ar.size(); i++) {
         for (int j = i + 1; j < ar.size(); j++) {
             if (anagram(ar.get(i), ar.get(j))) {
                 System.out.println(ar.get(i)+" "+ar.get(j));

             }
         }
     }
 }



 /**
  * Function to count the value in given integer be place
  *
  * @param n the integer value to count
  * @return the integer array for the count value
  */
 public static int[] count(int n) {
     int[] count = new int[10];
     int temp = n;
     while (temp != 0) {
         int r = temp % 10;
         count[r]++;
         temp = temp / 10;
     }
     return count;
 }

}
	
	
	
	 
	
	
	
	
	
	
	
		
		
		
		

			
		







