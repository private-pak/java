package com.bilbil.xuexi.day04;

import java.util.Objects;

public class Text03 {
/*
 * 系统生成
 */
	//public static void main(String[] args) {
	

	//}
	
	private  int year;
	private int month;
	private int  day;
	public Text03(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "[year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text03 other = (Text03) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	

}
