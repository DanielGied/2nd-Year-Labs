package ie.itcarlow.Lab2;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class lab2aq4 
{

	public static void main(String[] args) 
	{
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
		
		// Room A Values
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setRate(100);
		roomA.setOccupancy(1);
		
		//Room B Values
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setRate(80);
		roomB.setOccupancy(0);
		
		//RoomA
		System.out.println("The Number of RoomA is: " + roomA.getRoomNumber());
		System.out.println("The Type of RoomA is: " + roomA.getRoomType());
		
		// Occupancy for roomA
		if(roomA.getOccupancy() == 0)								
		{
			System.out.println("RoomA is Vacant");
		}
		else
		{
			System.out.println("RoomA is Occupied");
		}
		
		System.out.println("The Rate of RoomA is: " + roomA.getRate());
		
		System.out.println();
		
		//RoomB
		System.out.println("The Number of RoomB is: " + roomB.getRoomNumber());
		System.out.println("The Type of RoomB is: " + roomB.getRoomType());
		
		// Occupancy for roomB
		if(roomB.getOccupancy() == 0)											
		{
			System.out.println("RoomB is Vacant");
		}
		else
		{
			System.out.println("RoomB is Occupied");
		}
		
		System.out.println("The Rate of RoomB is: " + roomB.getRate());	
		
		System.out.println();
		
		//RoomC
		System.out.println("The Number of RoomC is: " + roomC.getRoomNumber());
		System.out.println("The Type of RoomC is: " + roomC.getRoomType());
		
		// Occupancy for roomB
		if(roomC.getOccupancy() == 0)											
		{
			System.out.println("RoomC is Vacant");
		}
		else
		{
			System.out.println("RoomC is Occupied");
		}
		
		System.out.println("The Rate of RoomC is: " + roomC.getRate());
		
		System.out.println();
		
		if (roomB.isOccupied() == false)
		{
			roomB.setOccupancy(1);
			System.out.println("RoomB is set to occupied");
		}
		else
		{
			System.out.println("RoomB is already occupied");
		}

	}

}
