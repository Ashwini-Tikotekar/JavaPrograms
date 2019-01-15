package com.bridgelab.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {
	static List<Persondetails> liOfPerson = new ArrayList<Persondetails>();
	Persondetails person = null;

	public void addPerson() {
		person = new Persondetails();
		System.out.println("Enter first name");
		person.setFirstname(OopsUtility.StringValue());;
		System.out.println("Enter last name");
		person.setLastname(OopsUtility.StringValue());
		System.out.println("Enter phone number");
		person. setPhonenno(OopsUtility.longValue());
		Addressdetails address = new Addressdetails();
		System.out.println("Enter street");
		address.setStreet(OopsUtility.StringValue());
		System.out.println("Enter city");
		address.setCity(OopsUtility.StringValue());
		System.out.println("Enter state");
		address.setState(OopsUtility.StringValue());
		System.out.println("Enter Zip Code");
		address.setZipcode(OopsUtility.longValue());
		person.setAddressdetails(address);
		liOfPerson.add(person);
	}

	public static List<Persondetails> getLiOfPerson() {
		return liOfPerson;
	}

	public static void setLiOfPerson(List<Persondetails> liOfPerson) {
		AddressBook.liOfPerson = liOfPerson;
	}

	public void editPerson() {
		System.out.println("Enter the first name of the person which has to be edited");
		String fName = OopsUtility.StringValue();
		System.out.println("Enter the last name of the person which has to be edited");
		String lName = OopsUtility.StringValue();
		int flag = 0;
		for (Persondetails per : liOfPerson) {
			if (fName.equals(per.getFirstname()) && lName.equals(per.getLastname())) {
				boolean run = true;
				while (run == true) {
					System.out.println("Whate do you want to edit");
					System.out.println("1.Phone Number 2.Address 3.Go Back");
					int choice1 = OopsUtility.intValue();
					switch (choice1) {
					case 1:
						System.out.println("Enter the phone number which has to be edited");
						per.setPhonenno (OopsUtility.longValue());
						System.out.println("Phone number updated");
						run = true;
						break;
					case 2:
						System.out.println("Editing address now");
						Addressdetails add = per.getAddressdetails();
						boolean run2 = true;
						while (run2 == true) {
							System.out.println("1.Street\n2.City\n3.State\n4.Zip Code\n5.To go back");
							int choice2 = OopsUtility.intValue();
							switch (choice2) {
							case 1:
								System.out.println("Enter street which has to be edited");
								add.setStreet(OopsUtility.StringValue());
								run2 = true;
								break;
							case 2:
								System.out.println("Enter city which has to be edited");
								add.setCity(OopsUtility.StringValue());
								run2 = true;
								break;
							case 3:
								System.out.println("Enter state which has to be edited");
								add.setState(OopsUtility.StringValue());
								run2 = true;
								break;
							case 4:
								System.out.println("Enter Zip code which has to be edited");
								add.setZipcode(OopsUtility.longValue());
								run2 = true;
								break;
							case 5:
								run2 = false;
							default:
								System.out.println("Please select correct choice");
								break;
							}
						}
						per.setAddressdetails(add);
						run = true;
						break;
					case 3:
						run = false;
						break;
					default:
						System.out.println("Please select correct choice");
						run = true;
						break;
					}
				}
			}
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Entered first name and last name does not exist in address book");
		}
	}

	public void displayAddress() {
		if (!liOfPerson.isEmpty()) {
			for (Persondetails per2 : liOfPerson) {
				System.out.println("First name : " + per2.getFirstname());
				System.out.println("Last name : " + per2.getLastname());
				System.out.println("Phone number : " + per2.getPhonenno());
				Addressdetails addr = per2.getAddressdetails();
				System.out.println("Address :\n");
				System.out.println("Street : " + addr.getStreet());
				System.out.println("City : " + addr.getCity());
				System.out.println("State : " + addr.getState());
				System.out.println("Zip Code : " + addr.getZipcode());
				System.out.println("--------------------------------------");
			}
		} else {
			System.out.println("Address book is empty");
		}

	}

	public void deletePerson() {
		System.out.println("Enter the first name of the person which has to be deleted");
		String fName = OopsUtility.StringValue();
		System.out.println("Enter the last name of the person which has to be deleted");
		String lName = OopsUtility.StringValue();
		int flag = 0;
		if (!liOfPerson.isEmpty()) {
			for (Persondetails per : liOfPerson) {
				if (fName.equals(per.getFirstname()) && lName.equals(per.getFirstname())) {
					liOfPerson.remove(per);
					System.out.println("Person removed from the address book ");
					break;
				}
				flag = 1;
			}
		} else {
			System.out.println("Address book is empty");
		}
		if (flag == 0) {
			System.out.println("Entered first name and last name does not exist in address book");
		}
	}

	public void sortByLastName() {
		Collections.sort(liOfPerson, (person1, person2) -> person1.getFirstname().compareTo(person2.getFirstname()));
		System.out.println("Sorted by last Name");
	}

	public void sortByZipCode() {
		Collections.sort(liOfPerson,
				(person1, person2) -> person1.getAddressdetails().getZipcode() > person2.getAddressdetails().getZipcode() ? 1
						: person1.getAddressdetails().getZipcode() < person2.getAddressdetails().getZipcode() ? -1
								: person1.getAddressdetails().getZipcode() == person2.getAddressdetails().getZipcode() ? 0 : -10);
		System.out.println("Sorted via Zip code");

	}
}

