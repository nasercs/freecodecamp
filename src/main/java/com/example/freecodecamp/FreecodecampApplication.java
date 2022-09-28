package com.example.freecodecamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class FreecodecampApplication {

//    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, OOOO").withZone(ZoneId.of("GMT"));

    public static void main(String[] args) {
//        System.out.println(formatter.format(Instant.now()));
//        LocalDate a = LocalDate.parse("05 October 2011, GMT", parser);
//        System.out.println(a);
//        LocalDateTime.parse("05 October 2011, GMT");
        SpringApplication.run(FreecodecampApplication.class, args);
    }

}
