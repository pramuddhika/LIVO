package com.livo.system.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class DateTimeUtil {

	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy.MM.dd");

	private DateTimeUtil() {
	}

	// Date only (time = 00:00:00)
	public static Date today() {
		return Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	// Date + Time (CURRENT)
	public static Date now() {
		return Date.from(Instant.now());
	}

	// yyyy.MM.dd
	public static String todayFormatted() {
		return LocalDate.now().format(DATE_FORMAT);
	}
}
