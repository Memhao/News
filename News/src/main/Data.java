package main;

public class Data {
	private int day;
	private int year;
	private int month;
	public Data(int day,int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString()
	{
		return this.day+":"+this.month+":"+this.year;
	}
}
