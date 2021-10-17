package ie.itcarlow.Lab2;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class HotelRoom 
{
	private int roomNumber;
	private String roomType; // Either "Single" or "Double"
	private int occupancy; // Either "0" or "1"
	private double rate;
	
	public HotelRoom(int number, String type, int roomOccupied, int nightlyRate)
	{
		setRoomNumber(number);
		setRoomType(type);
		setOccupancy(roomOccupied);
		setRate(nightlyRate);
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public void setRoomNumber(int number)
	{
		roomNumber = number;
	}
	
	public String getRoomType()
	{
		return roomType;
	}
	
	public void setRoomType(String type)
	{
		roomType = type;
	}
	
	public HotelRoom()
	{
		
	}
	
	public int getOccupancy()
	{
		return occupancy;
	}
	
	public void setOccupancy(int roomOccupied)
	{
		occupancy = roomOccupied;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public void setRate(double nightlyRate)
	{
		rate = nightlyRate;
	}
	
	public boolean isOccupied()
	{
		if (occupancy == 1)	
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
