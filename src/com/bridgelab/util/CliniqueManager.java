package com.bridgelab.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class CliniqueManager {
	static List<Doctor> listofdoctor=new ArrayList<Doctor>();
	static List<Patient> listofpatients=new ArrayList<Patient>();
	static List<Appointment> listofappointments=new ArrayList<Appointment>();
	static String doctorFile="/home/admin1/Ashwini/Doctor.json";
	static String patientFile="/home/admin1/Ashwini/Patient.json";
	static String appointmentFile="/home/admin1/Ashwini/Appointment.json";
	static ObjectMapper objectMapper=new ObjectMapper();
	public static void add() throws Exception {
		System.out.println("Select your choice-\n1:To Add Doctor\n2:To Add Patient");
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			addDoctor();
			break;
		case 2:
			addPatient();
			break;
		}
	}

	public static void addDoctor() throws Exception {
		String string = OopsUtility.readFile(doctorFile);
		try {
			listofdoctor = OopsUtility.userReadValue(string, Doctor.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Doctor doctor = new Doctor();
		System.out.println("Doctor Id Automatically setted");
		doctor.setId(listofdoctor.size() + 1);
		System.out.println("Enter the doctor's name");
		doctor.setName(OopsUtility.StringValue());
		System.out.println("Enter the specialization");
		doctor.setSpecialist(OopsUtility.StringValue());
		System.out.println("Enter the availability (a.m/p.m)");
		doctor.setAvaliablity(OopsUtility.StringValue());
		listofdoctor.add(doctor);
		System.out.println("Doctor added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(listofdoctor);
		OopsUtility.writeToFile(json, doctorFile);
	}

	public static void addPatient() throws Exception {
		String string = OopsUtility.readFile(patientFile);
		try {
			listofpatients = OopsUtility.userReadValue(string, Patient.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Patient patient = new Patient();
		System.out.println("Patient Id Automatically setted");
		patient.setPatientid(listofpatients.size() + 1);
		System.out.println("Enter the patient's name");
		patient.setPatientname(OopsUtility.StringValue());
		System.out.println("Enter the age");
		patient.setPatientage(OopsUtility.intValue());
		System.out.println("Enter the phone number");
		patient.setPatientphno(OopsUtility.longValue());
		listofpatients.add(patient);
		System.out.println("Patient added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(listofpatients);
		OopsUtility.writeToFile(json, patientFile);
	}

	public static void searchDoctor() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("\n1:Search by ID \n2:Search By Name\n3:Search By Specialization\n4:Search By Availability");
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			List<Doctor> doctor1 =searchById();
			if (!doctor1.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		case 2:
			System.out.println("Searching by name");
			List<Doctor> doctor2 =searchByName();
			if (!doctor2.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 3:
			List<Doctor> doctor3 = searchBySpecialization();
			if (!doctor3.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 4:
			List<Doctor> doctor4 = searchByAvailability();
			if (!doctor4.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		default:
			System.out.println("Please select correct choice");
			break;

		}
	}

	public static void searchPatient() throws IOException {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			Patient patient1 = (Patient) searchByPatientId();
			if (patient1 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		case 2:
			System.out.println("Searching by Phone Number");
			Patient patient2 = searchByPhoneNo();
			if (patient2 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		}
	}

	public static void search() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Select choice:\n1:Search Doctor\n2:Search Patient");
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			searchDoctor();
			break;
		case 2:
			searchPatient();
			break;
		}
	}

	public static void takeAppointment() throws Exception {
		String string = OopsUtility.readFile(appointmentFile);
		try {
			listofappointments = OopsUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = (Patient) searchByPhoneNo();
		if (patient != null) {
			System.out.println("Patient data already exist!!\nTaking appointment now....");
			appoint(patient);
			String json = OopsUtility.userWriteValueAsString(listofappointments);
			OopsUtility.writeToFile(json, appointmentFile);
		} else {
			System.out.println("Patient data doesnot exist\nPlease first add patient detials on to database");
		}
	}

	public static void displayList(List<Doctor> docList) {
		for (Doctor doctor : docList) {
			System.out.println("Doctor's ID: " + doctor.getId());
			System.out.println("Doctor's name: " + doctor.getName());
			System.out.println("Doctor's specialization: " + doctor.getSpecialist());
			System.out.println("Doctor's availability: " + doctor.getAvaliablity());
		}
	}

	public static void searchDoc(List<Doctor> doctorList, Patient patient) {
		System.out.println("Enter id");
		int id = OopsUtility.intValue();
		try {
			for (Doctor doctor : doctorList) {
				if (id == doctor.getId()) {
					for (Appointment appointment : listofappointments) {
						if (doctor.getName().equals(appointment.getName())) {
							List<Patient> patientAppointmentList = appointment.getListofpatients();
							if (patientAppointmentList.size() < 5) {
								patientAppointmentList.add(patient);
								appointment.setListofpatients(patientAppointmentList);
								System.out.println("Appointment is set");
								break;
							} else {
								System.out.println(
										"Appointment is full !!! Please wait for the next schedule or Select different doctor");

							}
							break;
						} else {
							Appointment newAppointment = new Appointment();
							newAppointment.setName(doctor.getName());
							List<Patient> newPatientAppointmentList = new ArrayList<>();
							newPatientAppointmentList.add(patient);
							newAppointment.setListofpatients(newPatientAppointmentList);
							listofappointments.add(newAppointment);
							System.out.println("Appointment is set");

						}
					}
					if (listofappointments.size() == 0) {
						Appointment appointment2 = new Appointment();
						List<Patient> patientList1 = new ArrayList<Patient>();
						patientList1.add(patient);
						appointment2.setName(doctor.getName());
						appointment2.setListofpatients(patientList1);
						listofappointments.add(appointment2);
						System.out.println("Appointment is set");
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}
	}

	public static void appoint(Patient patient) throws IOException {
		System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			List<Doctor> doctorList =searchByName();
			displayList(doctorList);
			searchDoc(doctorList, patient);
			break;
		case 2:
			List<Doctor> doctorList1 = searchBySpecialization();
			displayList(doctorList1);
			searchDoc(doctorList1, patient);
			break;
		case 3:
			List<Doctor> doctorList2 =searchByAvailability();
			displayList(doctorList2);
			searchDoc(doctorList2, patient);
			break;
		}
	}

	public static void famousDoctor() throws IOException {
		String string = OopsUtility.readFile(appointmentFile);
		Map<String, Integer> map = new HashMap<>();
		try {
			listofappointments = OopsUtility.userReadValue(string, Appointment.class);
			for (int i = 0; i < listofappointments.size(); i++) {
				Appointment appointment = listofappointments.get(i);
				String doctorName = appointment.getName();
				Integer numberOfAppointments = appointment.getListofpatients().size();
				map.put(doctorName, numberOfAppointments);
			}
			int maxValue = Collections.max(map.values());
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxValue) {
					System.out.println(
							"Famous Doctor Name: " + entry.getKey() + "\nNo of appointments: " + entry.getValue());
				}
			}
		} catch (Exception e) {
			System.out.println("There are no doctors in the Hospital system.");
		}
	}

	public static void famousSpecialist() throws IOException {
		String string = OopsUtility.readFile(doctorFile);
		List<String> list = new ArrayList<>();
		try {
			listofdoctor = OopsUtility.userReadValue(string, Doctor.class);
			for (Doctor doctor : listofdoctor) {
				for (Doctor doctor1 : listofdoctor) {
					if (doctor.getSpecialist().equals(doctor1.getSpecialist())) {
						list.add(doctor.getSpecialist());
					}
				}
			}
			int max = 0;
			int curr = 0;
			String currKey = null;
			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
				curr = Collections.frequency(list, key);
				if (max < curr) {
					max = curr;
					currKey = key;
				}
			}
			System.out.println(currKey + " is the famous specialization.");
		} catch (Exception e) {
			System.out.println("There are no doctors in the Hospital system.");
		}
	}
	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listofdoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor'specailization to be searched");
			String specailization = OopsUtility.StringValue();
			System.out.println(specailization);
			for (Doctor doctor : CliniqueManager.listofdoctor) {
				if (specailization .equals(doctor.getSpecialist())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}
	public static List<Doctor> searchByName() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listofdoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String name = OopsUtility.StringValue();
			System.out.println(name);
			for (Doctor doctor : CliniqueManager.listofdoctor) {
				if (name.equals(doctor.getName())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}
	}
	public static List<Doctor> searchByAvailability() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listofdoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's avalaiblity to be searched");
			String avaliability = OopsUtility.StringValue();
			System.out.println(avaliability);
			for (Doctor doctor : CliniqueManager.listofdoctor) {
				if (avaliability.equals(doctor.getAvaliablity())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}
	}
	public static List<Doctor>searchById() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listofdoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's id to be searched");
			int id = OopsUtility.intValue();
			System.out.println(id);
			Object ob=(Object)id;
			for (Doctor doctor : CliniqueManager.listofdoctor) {
				if (ob.equals(doctor.getId())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}
	}
	public static Patient searchByPhoneNo() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.patientFile);
		try {
			CliniqueManager.listofpatients = OopsUtility.userReadValue(string, Patient.class);
			List<Patient> list = new ArrayList<>();
			System.out.println("Enter the patients phnumber to be searched");
			long phno = OopsUtility.longValue();
			System.out.println(phno);
			Object ob=(Object)phno;
			for (Patient patient : CliniqueManager.listofpatients) {
				if (ob.equals(patient.getPatientphno())) {
					list.add(patient);
				}
				return patient;
			}
			
		} catch (Exception e) {
			System.out.println("File is empty!");
			
		}
		return null;
	}
	public static Patient searchByPatientId() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.patientFile);
		try {
			CliniqueManager.listofpatients = OopsUtility.userReadValue(string, Patient.class);
			List<Patient> list = new ArrayList<>();
			System.out.println("Enter the patients id to be searched");
			int  patientid = OopsUtility.intValue();
			System.out.println( patientid);
			Object ob=(Object)patientid;
			for (Patient patient : CliniqueManager.listofpatients) {
				if ( ob.equals(patient.getPatientid())) {
					list.add(patient);
				}
				return patient;
			}
			
		} catch (Exception e) {
			System.out.println("File is empty!");
			
		}
		return null;
	}

}