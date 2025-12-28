package com.livo.system.utils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateTimeUtil {

    private static final DateTimeFormatter DATE_FORMAT =
            DateTimeFormatter.ofPattern("yyyy.MM.dd");

    private DateTimeUtil() {
    }

    // Date only → yyyy.MM.dd
    public static Date today() {
        return Date.valueOf(LocalDate.now());
    }

    // Date + time
    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    // If you need formatted string
    public static String todayFormatted() {
        return LocalDate.now().format(DATE_FORMAT);
    }
}
