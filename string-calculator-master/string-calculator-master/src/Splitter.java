import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wymstar on 6/27/16.
 */
public class Splitter {
    private static String CUSTOM_DELI_REGX = "^[//].+[\n]";

    public static int[] splitToIntList(String source) {
        source = nullValue(source);
        String deli = extractCustomDelimiter(source);
        String realSource = extractSource(source);
        return convertToNumbers(deli, realSource);
    }

    private static int[] convertToNumbers(String deli, String realSource) {
        String[] arr = realSource.split("["+deli+"]");
        int[] numbers = new int[arr.length];
        for (int i=0, len=arr.length ; i<len ; i++) {
            numbers[i] = convertToInt(arr[i]);
        }
        return numbers;
    }

    private static String extractSource(String source) {
        return source.replaceAll(CUSTOM_DELI_REGX, "");
    }

    private static String extractCustomDelimiter(String source) {
        Pattern customPattern = Pattern.compile(CUSTOM_DELI_REGX);
        Matcher matcher = customPattern.matcher(source);

        if ( matcher.find()) {
            String result = matcher.group();
            return result.replaceAll("[//]", "").replaceAll("[\n]","");
        }
        return ",|:";
    }

    private static String nullValue(String source) {
        if (source == null)
            return "";
        return source;
    }

    private static int convertToInt(String source) {
        try {
            int result = Integer.parseInt(source);
            if (result < 0 )
                throw new NegativeNumberException();
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}
