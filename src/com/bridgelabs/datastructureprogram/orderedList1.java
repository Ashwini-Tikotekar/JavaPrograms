package com.bridgelabs.datastructureprogram;

import java.io.IOException;

import com.bridgelab.util.DataStructureUtility;
import com.bridgelab.util.LinkedList;

public class orderedList1 {
	static String sortFile="/home/admin1/Ashwini/od.txt";
    static String fName="/home/admin1/Ashwini/xyz.txt";
    public static void main(String[] args) throws IOException
    {
    	LinkedList LinkedList=new LinkedList();
        LinkedList=LinkedList.readFile(LinkedList);
        LinkedList.printList(LinkedList);
        while(true)
        {
            System.out.println("please select one option");
            System.out.println("1.Display list 2.to search element 3.Display modified File  ");
            int option=DataStructureUtility.intValue();
            switch(option) {
            case 1:LinkedList.printList(LinkedList);
            break;
            case 2:System.out.println("Enter the key element to be searched");
            int key=DataStructureUtility.intValue();
            String key1=String.valueOf(key);
            int k=LinkedList.delete(LinkedList, key1);
            System.out.println(k);
            if(k==0) {
            	LinkedList.insert(LinkedList, key1);
            }
            int[] fileContent = LinkedList.toIntConv(LinkedList);
            String[] fileContent1 = LinkedList.toStrinConv(LinkedList);
            int[] arr=LinkedList.stringSort(fileContent);
            String[] sarray=new String[arr.length];
            //int[] arry = DataStructureUtility.toIntConv(LinkedList);
            for(int i=0;i<arr.length;i++) {
                if(arr[i]!=0) {
                	
                     sarray[i]=String.valueOf(arr[i]);
                    i++;
                }
            }
            LinkedList.usingFileWriter(LinkedList,sarray,sortFile);
            //DataStructureUtility.writeIntFile(fName,arr);
            break;
            
            case 3:    LinkedList.dispFile(sortFile);
            break;
            default:System.out.println("Please enter an valid option");
            break;
            }
        }
    }

}




