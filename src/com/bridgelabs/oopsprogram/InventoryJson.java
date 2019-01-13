package com.bridgelabs.oopsprogram;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelab.util.OopsUtility;

public class InventoryJson {
	
	 public static void main(String[] args) throws IOException {
	        String str = "/home/admin1/InventoryName.json";
	        ObjectMapper objectMapper = new ObjectMapper();
	        List<InventoryList> list2 = new ArrayList<InventoryList>();
	        InventoryList inventoryList = new InventoryList();
	        List<Inventory> liInventories = new ArrayList<Inventory>();
	        String file = "";
	        int k = 0;
	        do {
	            System.out.println("1.Display file\n2.Add to file\n3.Check for price\n4.exit");
	            int choice = OopsUtility.intValue();
	            switch (choice)
	            {
	            case 1:
	                file = OopsUtility.readFile(str);
	                System.err.println(file);
	                try {
	                    list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {
	                    });
	                    OopsUtility.display(list2);
	                } catch (Exception e) {
	                
	                    System.out.println("file is empty!! first add inputs on to file or select second choice");
	                }
	                break;
	            case 2:
	            	file = OopsUtility.readFile(str);
	            	 try {
		                    list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {
		                    });
		                    OopsUtility.display(list2);
		                } catch (Exception e) {
		                
		                    System.out.println("file is empty!! first add inputs on to file or select second choice");
		                }
	                String [] arr= {"","rice","wheat","pulses"};
	                System.out.println("Select the inventory name \n 1.rice 2.wheat 3.pulses");
	                int option=OopsUtility.intValue();
	                int op = 1, flag = 0;
	                while (op == 1) {
	                    for (InventoryList invenList : list2) {
	                        if (arr[option].equals(invenList.getInventoryName())) {
	                            liInventories = invenList.getInventorylist();
	                            Inventory inventory = OopsUtility.getInventoryValues();
	                            liInventories.add(inventory);
	                            flag = 1;
	                        }
	                    }
	                    if (flag == 0) {
	                        Inventory inventory = OopsUtility.getInventoryValues();
	                        liInventories.add(inventory);
	                        inventoryList = OopsUtility.insertInventoryList(arr[option], liInventories);
	                        list2.add(inventoryList);
	                    }
	                    System.out.println("wish to add some more inventory(1 or 0)");
	                    op = OopsUtility.intValue();
	                }

	                System.out.println("Entered elements has been added to list");
	                String json = objectMapper.writeValueAsString(list2);
	                OopsUtility.write(json);
	                System.out.println("Inventory list has been written on to file");
	                break;
	            case 3:
	                file = OopsUtility.readFile(str);
	                list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {});
	                OopsUtility.price(list2);
	                break;
	            case 4:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("please select valid input");
	                break;
	            }
	            System.out.println("Press 1 to continue");
	             k=OopsUtility.intValue();
	        
	       
	   
	    }while (k==1);
	}
	}


	 