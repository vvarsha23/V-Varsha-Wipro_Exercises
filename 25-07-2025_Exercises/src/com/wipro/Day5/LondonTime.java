package com.wipro.Day5;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.function.Consumer;

public class LondonTime {
	public static void main(String[] args) {
		Consumer<ZoneId> printTime = zone -> {
            ZonedDateTime currentTime = ZonedDateTime.now(zone);
            System.out.println("Current time in " + zone + ": " + currentTime);
        };
        printTime.accept(ZoneId.of("Europe/London"));
	}

}
