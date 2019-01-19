package com.bridgelab.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Stock {
private String stockname;
private int numberofshares;
private double shareprice;
public String getStockname() {
	return stockname;
}
public void setStockname(String stockname) {
	this.stockname = stockname;
}
public int getNumberofshares() {
	return numberofshares;
}
public void setNumberofshares(int numberofshares) {
	this.numberofshares = numberofshares;
}
public double getShareprice() {
	return shareprice;
}
public void setShareprice(double shareprice) {
	this.shareprice = shareprice;
}
//transcation

private String date;
private String transaction;
//private String time;

public void setDate() {
    
    this.date = null;  
}
public String getDate() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();  
       System.out.println();  
       date=dtf.format(now);
       return date;
}
public String getTransaction() {
    transaction="Completed";
    return transaction;
}
public void setTransaction(String s) {
    this.transaction = s;
}


}
