package com.bridgelabs.oopsprogram;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelab.util.DataStructureUtility;
import com.bridgelab.util.OopsUtility;
import com.bridgelab.util.Stock;

public class StockPortfolio {


	static List<Stock> liOfStock = new ArrayList<Stock>();
	static Stock stock = null;
	static final String str = "/home/admin1/Ashwini/ss.json";


	public static void addStock() throws Exception {
		String string = OopsUtility.readFile(str);
		System.out.println(string);
		try {
			liOfStock= OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			System.out.println("Adding data.....");
		} catch (Exception e) {
			System.out.println("File is empty!");
			System.out.println("Adding data.....");
		}
		stock = new Stock();
		System.out.println("Enter the stock name");
		stock.setStockname(DataStructureUtility.StringValue());
		System.out.println("Enter total number of shares");
		stock.setNumberofshares(DataStructureUtility.intValue());
		System.out.println("Enter price per share");
		stock.setShareprice(DataStructureUtility.doubleValue());
		liOfStock.add(stock);
		System.out.println("Stock added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(liOfStock);
		OopsUtility.writeToFile(json, str);
	}

	public static void displayStock() throws FileNotFoundException {
		String string = OopsUtility.readFile(str);
		try {
			liOfStock = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (Stock stock : liOfStock) {
			System.out.println("Stock Name         : " + stock.getStockname());
			System.out.println("Stock share        : " + stock.getNumberofshares());
			System.out.println("Stock price        : " + stock.getShareprice());

		}
	}
	public static List<Stock> displayStock1(String fname) throws FileNotFoundException {
		String string = OopsUtility.readFile(fname);
		try {
			liOfStock = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (Stock stock : liOfStock) {
			System.out.println("Stock Name         : " + stock.getStockname());
			System.out.println("Stock share        : " + stock.getNumberofshares());
			System.out.println("Stock price        : " + stock.getShareprice());

		}
		return liOfStock;
	}
	public static void valueOfEachStock() throws FileNotFoundException {
        String string = OopsUtility.readFile(str);
        try {
            liOfStock = OopsUtility.userReadValue(string, Stock.class);
        } catch (Exception e) {
            System.out.println("File is empty!!! Nothing in data to display");
        }
        for (Stock stock : liOfStock) {
            System.out.println("Stock Name               : " + stock.getStockname());
            System.out.println("Value of this stock is           :" + stock.getNumberofshares() * stock.getShareprice());
            System.out.println("------------------------------------------------------");
        }
    }

    public static void totalStockValue() throws FileNotFoundException {
        String string =OopsUtility.readFile(str);
        try {
            liOfStock = OopsUtility.userReadValue(string, Stock.class);
        } catch (Exception e) {
            System.out.println("File is empty!!! Nothing in data to display");
        }
        double sum = 0;
        for (Stock stock : liOfStock) {
            sum += (stock.getNumberofshares() * stock.getShareprice());
        }
        System.out.println("Total value of stock is :" + sum + "\n");

    }
}



