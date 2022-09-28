package com.example.freecodecamp.bedap.dt.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateResponse {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss OOOO").withZone(ZoneId.of("GMT"));
    private static final DateTimeFormatter parser = DateTimeFormatter.ofPattern("[dd MMMM yyyy, OOOO][yyyy-MM-dd]");

    private final Instant instant;

    public DateResponse() {
        this.instant = Instant.now();
    }

    public DateResponse(long milliSeconds) {
        this.instant = Instant.ofEpochMilli(milliSeconds);
    }

    public DateResponse(String date) {
        this.instant = LocalDate.parse(date, parser).atStartOfDay().toInstant(ZoneOffset.UTC);
    }

    public long getUnix() {
        return this.instant.toEpochMilli();
    }

    public String getUtc() {
        return DateResponse.formatter.format(this.instant);
    }

}
