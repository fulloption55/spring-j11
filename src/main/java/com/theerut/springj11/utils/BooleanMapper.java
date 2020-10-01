package com.theerut.springj11.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BooleanMapper {
    private static final String Y_KEY = "Y";
    private static final String N_KEY = "N";

    private BooleanMapper() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean convert(String ynString) {
        try {
            switch (ynString) {
                case Y_KEY:
                    return true;
                case N_KEY:
                    return false;
                default:
                    throw new IllegalArgumentException("Error while mapping boolean type :" + ynString);
            }
        } catch (NullPointerException e) {
            log.error("Error can not convert to boolean, default return [false] ");
            return false;
        }

    }

}
