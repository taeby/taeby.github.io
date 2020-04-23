/**
 * Created by wymstar on 6/27/16.
 */
public class StringCalculator {
    public int sum(String source) {
        int[] numbers = Splitter.splitToIntList(source);
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
