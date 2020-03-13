package tool;

import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();

    private RandomUtil() {
    }

    public static int generate(int to) {
        return random.nextInt(to);
    }
}