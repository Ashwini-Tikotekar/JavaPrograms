package com.bridgelabs.oopsprogram;

import java.io.IOException;

import com.bridgelab.util.AddressBookManager;
import com.bridgelab.util.OopsUtility;

public class AddressBookApp {
	public static void main(String[] args) throws IOException{
		AddressBookManager ab= new AddressBookManager();
		boolean run= true;
		while (run==true)
		{
			System.out.println("1.create book 2.open book 3.save book 4.saveAs book 5.close book 6.address book ");
			int choice=OopsUtility.intValue();
			switch(choice) {
			case 1:
				ab.createBook();
				run=true;
				break;

			case 2:
				ab.openBook();
				run=true;
				break;

			case 3:
				ab.saveBook();
				run=true;
				break;

			case 4:
				ab.saveAsBook();
				run=true;
				break;

			case 5:
				ab.closeBook();
				run=true;
				break;

			case 6:
				System.exit(0);
				break;
			default: System.out.println("please enter the correct choice");
			}

		}

	}
}
