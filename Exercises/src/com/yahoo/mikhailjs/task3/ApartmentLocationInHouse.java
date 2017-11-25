package com.yahoo.mikhailjs.task3;

import java.util.Scanner;

public class ApartmentLocationInHouse {

	public static void main(String[] args) {
		int FLOORS = 9;
		int ENTRANCES = 4;
		int APARTMENSBYFLOOR = 4;
		int apartmentsInEntrance = FLOORS * APARTMENSBYFLOOR;
		int apartmentsInHouse = FLOORS * APARTMENSBYFLOOR * ENTRANCES;

		int apartmentNumber;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter apartment number (from 1 to "
                                    + apartmentsInHouse + "):");
		apartmentNumber = sc.nextInt();
		sc.close();

		int entrance;
		int floor;

		if ((apartmentNumber > 0) && (apartmentNumber <= apartmentsInHouse)) {
			/*
			 * apartment 4 mast be on floor 1, not floor 2.
			 * and apartment 36 mast be in entrance 1 on floor 9.
			 */
			int apartments = apartmentNumber - 1; 
			
			entrance = apartments / apartmentsInEntrance;
			if (entrance > 0) {
				floor = (apartments % (entrance * apartmentsInEntrance))
						/ APARTMENSBYFLOOR;
			} else {
				floor = apartments / APARTMENSBYFLOOR;
			}
			
			/*
			 * entrances & floors enumeration starts from 1.
			 */
			entrance += 1; 
			floor += 1;
			System.out.println(String.format("Entrance %d floor %d.",
					entrance, floor));
		} else {
			System.out.println("Wrong apartment number.");
		}
	}

}
