package com.OOP;

import java.lang.*;
import java.util.EnumSet;

enum Level{
	BEGINNER("A"),INTERMEDIATE("B"),ADVANCED("C");
	
	private String abbr;
	Level(String ab){
		abbr = ab;
		}
	public String getAbbr() {
		return abbr;
	}

//	public void setAbbr(String abbr) {
//		this.abbr = abbr;
//	}

}

enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;
}

public class Enum {

	public static void main(String[] args) {
		
		Level level = Level.BEGINNER;
		System.out.println(level);
		System.out.println(level.getAbbr());
		
		//System.out.println(level.ordinal());
		//System.out.println(level.toString());
		
		Level level1 = Level.INTERMEDIATE;
		System.out.println(level1);
		
		System.out.println(level1.getAbbr());
		
		Level level2 = Level.ADVANCED;
		System.out.println(level2);
		
		System.out.println(level2.getAbbr());
		System.out.println("-------------------");
		
		Day day = Day.SUNDAY;
		System.out.println("Holiday");

		for(Day day1 : EnumSet.range(Day.MONDAY, Day.FRIDAY) ) {
			System.out.println(day1);
		}
		System.out.println("Working Day");
		

	}

}
