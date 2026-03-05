public class Say {

    private static final String[] UNITS = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine" };
    private static final String[] TEENS = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen" };
    private static final String[] TENS = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
            "ninety" };
    private static final String[] THOUSANDS = { "", "thousand", "million", "billion" };

    public String say(long number) {
        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException("Number must be between 0 and 999,999,999,999 inclusive.");
        }

        if (number == 0) {
            return "zero";
        }

        StringBuilder result = new StringBuilder();
        int thousandCounter = 0;

        while (number > 0) {
            int chunk = (int) (number % 1000);
            if (chunk > 0) {
                StringBuilder chunkResult = new StringBuilder();

                if (chunk >= 100) {
                    chunkResult.append(UNITS[chunk / 100]).append(" hundred");
                    chunk %= 100;
                }

                if (chunk >= 20) {
                    if (chunkResult.length() > 0) {
                        chunkResult.append(" ");
                    }
                    chunkResult.append(TENS[chunk / 10]);
                    chunk %= 10;
                } else if (chunk >= 10) {
                    if (chunkResult.length() > 0) {
                        chunkResult.append(" ");
                    }
                    chunkResult.append(TEENS[chunk - 10]);
                    chunk = 0;
                }

                if (chunk > 0) {
                    if (chunkResult.length() > 0) {
                        chunkResult.append(" ");
                    }
                    chunkResult.append(UNITS[chunk]);
                }

                if (thousandCounter > 0) {
                    if (chunkResult.length() > 0) {
                        chunkResult.append(" ");
                    }
                    chunkResult.append(THOUSANDS[thousandCounter]);
                }

                if (result.length() > 0 && chunkResult.length() > 0) {
                    result.insert(0, " ");
                }
                result.insert(0, chunkResult);
            }
            number /= 1000;
            thousandCounter++;
        }
        return result.toString();
    }
}
