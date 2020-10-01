package com.theerut.springj11.utils;

import javax.validation.constraints.NotNull;
import java.util.List;

public class VersionHelper {

    private VersionHelper() {
        throw new IllegalStateException("Utility class");
    }

    public static String getLatest(@NotNull List<String> versionList) {
        String maxVersion = versionList.get(0);
        for (int index = 1; index < versionList.size(); index++) {
            if (compare(maxVersion, versionList.get(index)) == -1)
                maxVersion = versionList.get(index);
        }
        return maxVersion;
    }

    public static int compare(@NotNull String left, @NotNull String right) {
        if (left.equals(right)) {
            return 0;
        }
        int leftStart = 0;
        int rightStart = 0;
        int result;
        do {
            int leftEnd = left.indexOf('.', leftStart);
            int rightEnd = right.indexOf('.', rightStart);
            Integer leftValue = Integer.parseInt(leftEnd < 0
                    ? left.substring(leftStart)
                    : left.substring(leftStart, leftEnd));
            Integer rightValue = Integer.parseInt(rightEnd < 0
                    ? right.substring(rightStart)
                    : right.substring(rightStart, rightEnd));
            result = leftValue.compareTo(rightValue);
            leftStart = leftEnd + 1;
            rightStart = rightEnd + 1;
        } while (result == 0 && leftStart > 0 && rightStart > 0);
        if (result != 0) {
            return result;
        }
        if (leftStart > rightStart) {
            return containsNonZeroValue(left, leftStart) ? 1 : 0;
        } else {
            return containsNonZeroValue(right, rightStart) ? -1 : 0;
        }
    }

    private static boolean containsNonZeroValue(String str, int beginIndex) {
        for (int i = beginIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '.') {
                return true;
            }
        }
        return false;
    }
}
