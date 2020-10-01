package com.theerut.springj11.utils;

import lombok.extern.slf4j.Slf4j;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Slf4j
public class DateUtils {

    private DateUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static LocalDate convertStringToLocalDate(String dateString) {
        try {
            XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateString);
            return cal.toGregorianCalendar().getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (DatatypeConfigurationException ex2) {
            log.error(ex2.getMessage());
            return null;
        }
    }

    public static ZonedDateTime convertTimeZone(LocalDateTime localDateTime) {
        ZonedDateTime zoneDateTime = localDateTime.atZone(ZoneId.of("UTC"));
        return zoneDateTime.withZoneSameInstant(ZoneId.of("UTC+7"));
    }

}
