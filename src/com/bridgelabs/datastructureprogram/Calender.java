package com.bridgelabs.datastructureprogram;

import com.bridgelab.util.DataStructureUtility;

public class Calender {
	 public static void main(String[] args) {
         //

         //Prompt the user to enter year
         System.out.print("Enter year: ");
         int year = DataStructureUtility.intValue();

         // Prompt the user to enter month
         System.out.print("Enter month  ");
         int month = DataStructureUtility.intValue();

         // Print calendar for the month of the year
          if (month < 1 || month > 12 || year < 1700)
           System.out.println("Wrong input!");
           else
              DataStructureUtility.printMonth(year, month);

       }

}
