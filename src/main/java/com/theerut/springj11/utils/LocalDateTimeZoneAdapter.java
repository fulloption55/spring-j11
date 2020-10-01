package com.theerut.springj11.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeZoneAdapter extends XmlAdapter<String, LocalDateTime> {
    private final DateTimeFormatter ZONED_DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX");

    @Override
    public LocalDateTime unmarshal(String dateTimeStr) {
        if (dateTimeStr != null) {
            final ZoneId zoneBangkok = ZoneId.of("Asia/Bangkok");
            final ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeStr, ZONED_DATETIME_FORMATTER);
            return zonedDateTime.withZoneSameInstant(zoneBangkok).toLocalDateTime();
        }
        return null;
    }

    @Override
    public String marshal(LocalDateTime dateTime) {
        if (dateTime != null) {
            final ZoneId zoneBangkok = ZoneId.of("Asia/Bangkok");
            ZonedDateTime date = ZonedDateTime.now(zoneBangkok);
            return dateTime.atOffset(date.getOffset()).format(ZONED_DATETIME_FORMATTER);
        } else {
            return null;
        }
    }
}


//    String sssd = "2018-10-11T18:29:11.000001+07:00";