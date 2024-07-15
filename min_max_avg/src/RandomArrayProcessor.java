import java.util.Arrays;

public class RandomArrayProcessor {

    // Генерация массива случайных чисел
    public static double[] generateRandomArray(int size) {
        return Arrays.stream(new double[size])
                .map(num -> Math.random())
                .toArray();
    }

    // Нахождение максимального значения в массиве
    public static double findMax(double[] numbers) {
        return Arrays.stream(numbers)
                .max()
                .orElse(Double.NaN);
    }

    // Нахождение минимального значения в массиве
    public static double findMin(double[] numbers) {
        return Arrays.stream(numbers)
                .min()
                .orElse(Double.NaN);
    }

    // Нахождение среднего значения в массиве
    public static double findAverage(double[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN);
    }
}
