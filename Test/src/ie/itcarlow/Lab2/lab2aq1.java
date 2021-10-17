package ie.itcarlow.Lab2;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class lab2aq1 
{

	public static void main(String[] args) 
	{
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		// Room A Values
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		
		//Room B Values
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		
		System.out.println("The Number of RoomA is: " + roomA.getRoomNumber());
		System.out.println("The Type of RoomA is: " + roomA.getRoomType());
		
		System.out.println();
		
		System.out.println("The Number of RoomB is: " + roomB.getRoomNumber());
		System.out.println("The Type of RoomB is: " + roomB.getRoomType());

	}

}
