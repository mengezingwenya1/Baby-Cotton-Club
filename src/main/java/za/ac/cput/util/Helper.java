package za.ac.cput.util;

import java.util.regex.Pattern;

public class Helper {
    public static boolean isNullOrEmpty(String srt) {
        if (srt.isEmpty() || srt == null)
            return true;
        return false;
    }
    public static class PriceValidator {

        private static final Pattern PRICE_PATTERN = Pattern.compile(
                "^\\s*[R$€]?(0|[1-9]\\d*)(\\.\\d{1,2})?\\s*$"
        );

        public static boolean isValid(String price) {
            if (price == null || price.trim().isEmpty()) {
                return false;
            }
            return PRICE_PATTERN.matcher(price).matches();
        }
    }

}
