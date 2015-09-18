package com.marketflip.products;

import java.util.Locale;
import java.util.Date;
import java.util.Calendar;

/*
 * @author David Walters
 * Price holds date related to the price of the object.
 * Updated - 09/18/2015
 * TODO:
 * 	-custom date string parse.
 */

public class Price {
	
	private double price;
	private Date date;
	
	public Price () {
		this.price = 0.00;                      
		this.date = Calendar.getInstance().getTime();
	}
	
	/**
	 * Returns the price of the Price object
	 * @return double The price of the price object.
	 */
	public double getPrice () {
		return this.price;
	}
	
	/**
	 * Returns the date and time associated with this Price object.
	 * @return Date The date associated to this Price object.
	 */
	public Date getDate () {
		return this.date;
	}
	
	/**
	 * Set the price of this Price object
	 * @param price The price to be set to the Price object.
	 */
	public void setPrice (double price) {
		this.price = price;
	}
	
	/**
	 * Set the date object associated with the price.
	 * @param date The Date object associated with the Price object.
	 */
	public void setDate (Date date) {
		this.date = date;
	}
	
	/**
	 * TODO - Parse string object to set custom date format without needing the date
	 * Not supported yet.
	 * @param dateString
	 */
	public void setDate (String dateString) {
		System.err.println ("Not supported yet.")
	}
	
	
	

}
