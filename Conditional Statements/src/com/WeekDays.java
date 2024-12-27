package com;

public class WeekDays {

	public static void main(String[] args) {
//		Important Note: Switch not compare the values using the data type as float, double and boolean
		int week_day = 2;
		
		switch (week_day) {
		case 1:System.out.println("it is Sunday");break;
		case 2:System.out.println("it is Monday");break;
		case 3:System.out.println("it is Tuesday");break;
		case 4:System.out.println("it is Wednesday");break;
		case 5:System.out.println("it is Thursday");break;
		case 6:System.out.println("it is Friday");break;
		case 7:System.out.println("it is Saturday");break;

		default:System.out.println("invalid number");break;
		}

	}

}
