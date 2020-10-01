package com.theerut.springj11.utils;

import com.theerut.springj11.constant.PayloadConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.ThreadContext;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Slf4j
public class RandomRqIdGenerator {

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("YYMMddHHmmssS");
    private static final DateTimeFormatter DFT_WITH_TIME = DateTimeFormatter.ofPattern("YYMMddHHmmS");
    private static final String PREFIX_DG = "DG";
    private static final int RANDOM_WITH_3_LENGTH = 3;
    private static final int RANDOM_WITH_4_LENGTH = 4;
    private static final int RANDOM_WITH_7_LENGTH = 7;
    private static final Random random = new Random();

    private RandomRqIdGenerator() {
        throw new IllegalStateException("Utility class");
    }

    public static String generateRequestIdForExamWithCorrelationId() {
        String correlationId = ThreadContext.get(PayloadConstant.CORRELATION_ID_KEY);
        return PREFIX_DG + correlationId;
    }

    public static String generateRequestIdForExam() {
        LocalDateTime currentDate = LocalDateTime.now();
        String dateFormat = DTF.format(currentDate);
        String string7Length = generateRandomNumeric(RANDOM_WITH_7_LENGTH);
        return PREFIX_DG + dateFormat + string7Length;
    }

    public static String generateProviderRequestId() {
        LocalDateTime currentDate = LocalDateTime.now();
        String dateFormat = DTF.format(currentDate);
        String string5Length = generateRandomNumeric(RANDOM_WITH_3_LENGTH);
        return dateFormat + string5Length;
    }

    private static String generateRandomNumeric(int length) {
        final int min = (int) Math.pow(10L, (double) length - 1L);
        final int max = (min * 10) - 1;
        return String.valueOf(random.nextInt((max - min) + 1) + min);
    }

    public static Integer generateJournalSeqNum() {
        LocalTime time = LocalTime.now();
        int secondOfDay = time.toSecondOfDay();
        String string4Length = generateRandomNumeric(RANDOM_WITH_4_LENGTH);
        return Integer.parseInt(secondOfDay+ string4Length);
    }

    public static String generateGLRefNo(String journalSeqNum) {
        LocalDateTime currentDate = LocalDateTime.now();
        String dateFormat = DFT_WITH_TIME.format(currentDate);
        return dateFormat + journalSeqNum;
    }

}
