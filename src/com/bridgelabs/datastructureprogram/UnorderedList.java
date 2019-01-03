package com.bridgelabs.datastructureprogram;

import java.io.IOException;

import com.bridgelab.util.DataStructureUtility;
import com.bridgelab.util.LinkedList;

public class UnorderedList {
    
	static String fileName="/home/admin1/Ashwini/abc.txt";
    public static void main(String[] args) throws IOException{
   
    	LinkedList LinkedList=new LinkedList();
        LinkedList=LinkedList.readFile(LinkedList);
        LinkedList printList=(LinkedList);
        while(true)
        {
            System.out.println("please select one option");
            System.out.println("1.Display list 2.to search element 3.Display modified File  ");
            int option=DataStructureUtility.intValue();
            switch(option) {
            case 1: LinkedList.printList(LinkedList);
            break;
            case 2:System.out.println("Enter the key element to be searched");
            String key=DataStructureUtility.StringValue();
            int k= LinkedList.delete(LinkedList, key);
            System.out.println(k);
            if(k==0) {
            	 LinkedList.insert(LinkedList, key);
            }
            String[] fileContent =  LinkedList.toStrinConv(LinkedList);
            LinkedList.usingFileWriter(LinkedList,fileContent,fileName);
            break;
            case 3:    LinkedList.dispFile(fileName);
            break;
            default:System.out.println("Please enter an valid option");
            break;
            }
        }
    }
	
}
