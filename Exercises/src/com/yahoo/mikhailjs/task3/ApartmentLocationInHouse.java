package com.yahoo.mikhailjs.task3;

import java.util.Scanner;
import java.util.regex.Pattern;

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
        while (true) {
			if (sc.hasNextInt()) {
				apartmentNumber = sc.nextInt();
				if (!((apartmentNumber > 0) && (apartmentNumber <= apartmentsInHouse))) {
					System.out.println("Wrong apartment number (enter from 1 to "
                                       + apartmentsInHouse + "):");
					continue;
				}
				sc.close();
				break;
			} else {
				sc.next(Pattern.compile(".++"));
				System.out.println("Enter integer value:");
				continue;
			}
		}
		
		/*
		 * apartment 4 mast be on floor 1, not floor 2.
		 * and apartment 36 mast be in entrance 1 on floor 9.
		 */
		int apartments = apartmentNumber - 1; 
		int entranceN;
		int floorN;
		
		entranceN = apartments / apartmentsInEntrance;
		if (entranceN > 0) {
			floorN = (apartments % (entranceN * apartmentsInEntrance))
                      / APARTMENSBYFLOOR;
		} else {
			floorN = apartments / APARTMENSBYFLOOR;
		}
		
        String entrance = "";
		
        switch (entranceN) {
		case 0:
			entrance = "First";
			break;
		case 1:
			entrance = "Second";
			break;
		case 2:
			entrance = "Third";
			break;
		case 3:
			entrance = "Fourth";
		}
        
        String floor = "";

		switch (floorN) {
		case 0:
			floor = "first";
			break;
		case 1:
			floor = "second";
			break;
		case 2:
			floor = "third";
			break;
		case 3:
			floor = "fourth";
			break;
		case 4:
			floor = "fifth";
			break;
		case 5:
			floor = "sixth";
			break;
		case 6:
			floor = "seventh";
			break;
		case 7:
			floor = "eighth";
			break;
		case 8:
			floor = "ninth";
			break;
		}
		
		System.out.println(entrance + " entrance, " + floor + " floor.");
	}

}
