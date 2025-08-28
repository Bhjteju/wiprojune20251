package com.wipro.annonymus;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class ConsumerDemo2 {

	public static void main(String[] args) {
		
		Consumer<ZoneId> printTime = zone -> {
            ZonedDateTime time = ZonedDateTime.now(zone);
            System.out.println("Current time in " + zone + ": " + time.toLocalTime());
        };

        printTime.accept(ZoneId.of("Asia/Kolkata"));

	}

}
