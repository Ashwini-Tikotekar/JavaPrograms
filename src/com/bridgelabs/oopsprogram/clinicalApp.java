package com.bridgelabs.oopsprogram;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelab.util.CliniqueManager;
import com.bridgelab.util.OopsUtility;

public class clinicalApp {
	
		public static void main(String[] args) throws Exception {
			boolean run = true;
			while (run) {
				System.out.println("Enter the choice");
				System.out.println("1:Add\n2:Search\n3:Take Appointment\n4:Famous Doctor\n5.Famous Specialist\n6:Exit");
				int choice = OopsUtility.intValue();
				switch (choice) {
				case 1:
					CliniqueManager.add();
					run = true;
					break;
				case 2:
					CliniqueManager.search();
					run = true;
					break;
				case 3:
					CliniqueManager.takeAppointment();
					run = true;
					break;
				case 4:
					CliniqueManager.famousDoctor();
					run = true;
					break;
				case 5:
					CliniqueManager.famousSpecialist();
					run = true;
					break;
				case 6:System.out.println("Thank you");
					System.exit(0);
					run = true;
					break;
				default:
					System.out.println("Please select correct choice");
					run = true;
					break;
				}
			}
		}
	}

