package com.bridgelabs.oopsprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelab.util.DataStructureUtility;
import com.bridgelab.util.LinkedList;
import com.bridgelab.util.OopsUtility;
import com.bridgelab.util.QueueLinkedList;
import com.bridgelab.util.SinglyLinkedList;
import com.bridgelab.util.StackLinkedList;
import com.bridgelab.util.Stock;

public class StockAgency {

	
	  static List<Stock> liOfStock = new ArrayList<Stock>();
	    static Set<Stock> set = new HashSet<Stock>();
	    //static Transactions transactions=new Transactions();
	    static List<Stock> tempList =new ArrayList<Stock>();
	    static final String str = "/home/admin1/StockManagement/ss.json";
	    static Stock s=null;
	    static int index=-1;
	    static StackLinkedList<String> stack=new StackLinkedList<String>();
	    static QueueLinkedList<String> queue=new QueueLinkedList<String>();
	    static SinglyLinkedList<String> linkedList=new  SinglyLinkedList<String>();   
	    @SuppressWarnings("unlikely-arg-type")
	    public static void buy() throws Exception {
	        Stock s=new Stock();
	        liOfStock = new ArrayList<Stock>();
	        String fileArray[]=listFilesInsideDirectory();
	        String accName=searchFile(fileArray);
	        System.out.println(accName);
	        liOfStock=StockPortfolio.displayStock1("/home/admin1/Ashwini/ss.json");   
	        System.out.println("Enter the name of the stock which you want to Buy");
	        String s1=DataStructureUtility.StringValue();
	        s.setStockname(s1);
	        int flag=checkStockName(s1);
	        System.out.println(flag);
	        if(flag<0) {
	            System.out.println("Stoke name not found");
	            String[] str1= {};
	            StockApp.main(str1);
	        }
	        else {
	            System.out.println("Enter the amount of share you wish to buy");
	            //System.out.println(flag);
	            s=liOfStock.get(index);
	            s.setDate();
	            //tempList.add(s);
	          int share=DataStructureUtility.intValue();
	            if(s.getNumberofshares()>share && share>0) {
	                System.out.println("Present share=="+s.getNumberofshares());
	               int temp=s.getNumberofshares();
	                share=s.getNumberofshares()-share;
	                s.setTransaction("added");
	                queue.enqueue(s.getDate());
	                stack.push(s.getTransaction());
	                linkedList.add(s.getStockname());
	                s.setNumberofshares(share);
	                System.out.println("share=="+s.getNumberofshares());
	                //s.setTransaction("daswd");
	                tempList.add(s);
	                String json = OopsUtility.userWriteValueAsString(tempList);
	                StringBuffer sb= new StringBuffer("/home/admin1/Ashwini//");
	                sb.append(accName);
	                OopsUtility.writeToFile(json, sb.toString());
	                
	                System.out.println("Written successfully");               
	                s.setNumberofshares(temp-share);               
	                liOfStock.add(s);
	                set.addAll(liOfStock);
	                String json1 = OopsUtility. userWriteValueAsString(set);
	                OopsUtility.writeToFile(json1,"/home/admin1/Ashwini/ss.json");
	                System.out.println("Written successfully");
	            }
	            else
	                System.out.println("Please enter a stock less than "+s.getNumberofshares());
	        }
	    }
	    public static int checkStockName(String s1) {
	        index=-1;
	        for(Stock ss:liOfStock)
	        {
	            ++index;
	            if(ss.getStockname().equals(s1)) {
	                System.out.println("found");
	                break;
	            }
	        }
	        return index;
	    }
	///////////////////////////////////////////////////////////////////////////////////////////////
	    public static void sell() throws Exception {
	        Stock s=new Stock();
	        tempList=new ArrayList<Stock>();
	        liOfStock=StockPortfolio.displayStock1("/home/admin1/Ashwini/ss.json");   
	        String fileArray[]=listFilesInsideDirectory();
	        String accName=searchFile(fileArray);
	       // String json = OopsUtility.userWriteValueAsString(tempList);
            StringBuffer sb= new StringBuffer("/home/admin1/Ashwini//");
            sb.append(accName);
	        tempList=StockPortfolio.displayStock1(sb.toString());
	        System.out.println("Enter the name of the Stoke which you want to Sell");
	        String s1=DataStructureUtility.StringValue();
	        int flag=0;
	        flag=checkStockName(s1);
	        System.out.println(flag);
	        System.out.println(index);
	        if(index<0)System.out.println("Stoke name not found");
	        else {
	          int shareInCompany=liOfStock.get(flag).getNumberofshares();
	            //liOfStock.remove(flag);
	            StockPortfolio.displayStock();
	            System.out.println("Enter the amount of share you wish to sell");
	            s=tempList.get(0);
	           int share1=DataStructureUtility.intValue();
	            if(s.getNumberofshares()>share1 && share1>0) {
	                System.out.println("Present shares=="+s.getNumberofshares());
	                ///s.getNumberOfShare();
	                //liOfStock.remove(s);
	                int  share=s.getNumberofshares()-share1;
	                System.out.println("share=="+s.getNumberofshares());
	                s.setNumberofshares(share);
	                s.setDate();
	                s.setTransaction("sold");
	                queue.enqueue(s.getDate());
	                stack.push(s.getTransaction());
	                linkedList.add(s.getStockname());
	                tempList.clear();
	                tempList.add(s);
	                String json2 =  OopsUtility.userWriteValueAsString(tempList);
	                StringBuffer sb11=new StringBuffer("/home/admin1/Ashwini//");
	                sb11.append(accName);
	                OopsUtility.writeToFile(json2,sb11.toString());
	                System.out.println("Written successfully");
	                s.setNumberofshares(shareInCompany+share1);
	                System.out.println("Company Share = "+s.getNumberofshares());
	                liOfStock.add(s);
	                String json1 =  OopsUtility.userWriteValueAsString(liOfStock);
	                OopsUtility.writeToFile(json1, "/home/admin1/Ashwini/ss.json");
	                System.out.println("Written successfully");
	            }
	            else
	                System.out.println("Please enter a stock less than "+s.getNumberofshares());
	        }
	    }

	    public static void save() {
	        System.out.println("File successfully saved");

	    }
	    public static void printStock() throws FileNotFoundException {
	        try{
	            System.out.println("Share details of the company");
	            liOfStock=StockPortfolio.displayStock1("/home/admin1/Ashwini/ss.json");   
	            System.out.println("///////////////////////////////////////");
	            System.out.println("Shares details of the person");
	            tempList=StockPortfolio.displayStock1("/home/admin1/Ashwini/personstock.json");
	            System.out.println("Stack/Queue elements are");

	        }
	        catch(FileNotFoundException e){
	            System.out.println("Please enter the valid file name/path");
	        }
	    }
	   
	    public static String creatAccount(String ffname) {
	       // System.out.println("Enter the account name");
	        StringBuffer sb=new StringBuffer("/home/admin1/Ashwini/");
	       // String ffname=DataStructureUtility.StringValue();
	        sb.append(ffname);
	        File stockFile = new File(sb.toString());
	        boolean flag=false;

	        try {
	            flag = stockFile.createNewFile();

	        } catch (IOException ioe) {
	            System.out.println("Error while Creating File in Java" + ioe);
	        }

	        System.out.println("stock file" + stockFile.getPath() + " created ");
	        return ffname;
	    }

	    public static String[] listFilesInsideDirectory()
	    {
	        File dir = new File("/home/admin1/Ashwini//");
	        String[] children = dir.list();

	        if (children == null) {
	            System.out.println("does not exist or is not a directory");
	        } else {
	            for (int i = 0; i < children.length; i++) {
	                String filename = children[i];
	                System.out.println(filename);
	            }
	        }
	        return children;
	    }
	    public static String searchFile(String[] strings) {
	        System.out.println("Enter your account name");
	        String str=DataStructureUtility.StringValue();
	        for(String s:strings) {
	            if(s.compareToIgnoreCase(str)==0) {
	                System.out.println("Account found");
	                break;
	            }
	            else {
	                str=creatAccount(str);
	                break;
	            }
	        }
	        return str;
	    }

	    public static void displayStackQueueLinkedList(String fName) throws FileNotFoundException {
	        try {
	            System.out.print("Share Name  := " );
	            linkedList.traverse();
	            System.out.println("Last Transaction Time/Date  : "+ queue.dequeue());
	            System.out.println("Last Transaction status     : " + stack.pop());

	            System.out.println("-------------------------------------------------------");
	        }
	        catch(Exception e) {
	            System.out.println("No transaction innitiated yet");
	        }
	    }
	    public static void displayQueue(String fName,QueueLinkedList<Stock> q1) throws FileNotFoundException {
	        try {
	            for(int i=0;i<q1.size;i++) {
	            //System.out.print("Share Name  := " );
	            System.out.println("Last Transaction Time/Date  : "+ q1.dequeue()+"  Share name  : "+q1.dequeue());
	            System.out.println("-------------------------------------------------------");
	        }}
	        catch(Exception e) {
	            System.out.println();
	        }
	    }
	}
