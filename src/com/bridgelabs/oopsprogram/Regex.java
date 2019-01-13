package com.bridgelabs.oopsprogram;

import java.io.FileNotFoundException;
import java.util.Date;

import com.bridgelab.util.OopsUtility;

public class Regex {
	public static void main(String args[]) throws FileNotFoundException {
		OopsUtility u = new OopsUtility();
		Userdetails user = new Userdetails();
		// asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setFirstName(OopsUtility.StringValue());
		System.out.println();

		System.out.println("Enter LastName:");
		user.setLastName(OopsUtility.StringValue());
		System.out.println();

		System.out.println("Enter Mobile Number:");
		user.setMobileNo(OopsUtility.longValue());
		System.out.println();

		user.setDate(u.getFormatedDate());
		String str = u.readFile2("/home/admin1/newfile.txt");
		System.out.println(u.convertString(user, str));
	}
}
