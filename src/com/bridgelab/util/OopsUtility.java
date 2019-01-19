package com.bridgelab.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabs.oopsprogram.Inventory;
import com.bridgelabs.oopsprogram.InventoryList;
import com.bridgelabs.oopsprogram.Userdetails;

public class OopsUtility {
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


	//**********************************************************//

	//JSON//

	public static String readFile(String str) throws FileNotFoundException {
		FileReader f = new FileReader(str);

		BufferedReader read = new BufferedReader(f);
		String line = "";
		try {
			String word="";
			while ((word = read.readLine()) != null) {
				line = word;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}
	////////////////////
	public static void display(List<InventoryList> list2)
	{
		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getInventorylist().size(); j++) {
				System.out.println("name :" + it.getInventorylist().get(j).getName());
				System.out.println("price :" + it.getInventorylist().get(j).getPrice());
				System.out.println("weight :" + it.getInventorylist().get(j).getWeight());
				System.out.println();
			}
			System.out.println("---------------------------------------------");
		}
	}
	///////////////////
	public static InventoryList insertInventoryList(String inventoryName,List<Inventory> listOfInventories)
	{
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName(inventoryName);
		inventoryList.setInventorylist(listOfInventories);
		return inventoryList;
	}


	///////////////////////////////////////

	public static void price(List<InventoryList> list2)
	{

		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventorylist());
			for (int j = 0; j < it.getInventorylist().size(); j++) {
				System.out.println("name :" + it.getInventorylist().get(j).getName());
				double sum=it.getInventorylist().get(j).getPrice()*it.getInventorylist().get(j).getWeight();
				System.out.println("total price to be given is :"+sum);
			}
			System.out.println("---------------------------------------------");
		}
	}

	///////////////////

	public static void write(String json) throws IOException
	{
		FileWriter fw = new FileWriter("/home/admin1/InventoryName.json");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.flush();
	}

	public static Inventory getInventoryValues() {
		Inventory inventory = new Inventory();
		System.out.println("Enter name of inventory");
		inventory.setName(OopsUtility.StringValue());
		System.out.println("Enter weight of inventory in kilograms");
		inventory.setWeight(OopsUtility.doubValue());
		System.out.println("Enter price of inventory in rupees");
		inventory.setPrice(OopsUtility.doubValue());
		return inventory;

	}


	//Regex//

	BufferedReader br;
	private final String REGEX_NAME = "<{2}+\\w+>{2}";
	private final String REGEX_FULLNAME = "<{2}+\\w+ +\\w+>{2}";//"<{2}+//W>{2} ";
	private final String REGEX_MOBILE_NO = "x{10}";
	private final String REGEX_DATE = "\\d{2}+/+\\d{2}+/+\\d{4}";
	Userdetails ud=new Userdetails();
	//constructor to initialize bufferedReader
	public void  Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	//Regex pattern matcher match the string and replace the regex pattern with user details.
	public String convertString(Userdetails userdetails,String message){

		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message); 
		message = m.replaceAll(userdetails.getFirstName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(userdetails.getFirstName()+" "+userdetails.getLastName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message); 
		String mobileNo=userdetails.getMobileNo();
		message = m.replaceAll(mobileNo);

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message); 
		message = m.replaceAll(userdetails.getDate());

		return message;
	}

	public static String readFile2(String str) throws FileNotFoundException {
		FileReader f = new FileReader(str);
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		try {
			String word="";
			while ((word = read.readLine()) != null) {
				line = word;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return line;
	}
	public static void writeToFile(String data,String fileName)throws Exception{
	System.out.println("File name is = "+fileName);
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file);
	//	Writes the content to the file
		writer.write(data);
		writer.flush();
		writer.close();
	}
	public String getFormatedDate(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();  
		String date=dtf.format(now);
		return date;
	}
	public java.util.Date printDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException pe){
			return null;
		}
	}
	public static String inputString() {
		return sc.next();
	}
	///////

	public static <T> List<T> userReadValue(String str, Class<?> cls)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper=new ObjectMapper();
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, cls);
		return objectMapper.readValue(str, colletion);
	}

	public static <T> String userWriteValueAsString(List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.writeValueAsString(list);
	}


	public static QueueLinkedList<QueueLinkedList<String>> deckQueueStore(String[] deck )
	{
		QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
		QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
		System.out.println("Total numver of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];
			}
			String[] str2 = AlgorithmUtility.sortArray1(demo);
			for (int k = 0; k < str2.length; k++) {
				queueLinkedList.enqueue(str2[k]);
			}
			mainQueue.enqueue(queueLinkedList);
			queueLinkedList = new QueueLinkedList<String>();
			continue;
		}
		return mainQueue;
	}
	public static void deal(QueueLinkedList<QueueLinkedList<String>> mainQueue)
	{
		for (int i = 0; i < mainQueue.getSize(); i++) {
			QueueLinkedList<String> queue2 = mainQueue.dequeue();
			System.out.println("---------------------------------------- Person " + (i + 1)
					+ " -------------------------------------------");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.print(queue2.dequeue() + " ,");
			}
			System.out.println();
		}
	}
	
	
	  public static <T> String userWriteValueAsString(Set<T> list1) throws JsonGenerationException, JsonMappingException, IOException{
		  ObjectMapper objectMapper=new ObjectMapper();
		  return objectMapper.writeValueAsString(list1);
      }
	 
}	











