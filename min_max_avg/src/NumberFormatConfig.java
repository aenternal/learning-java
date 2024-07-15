import java.util.Arrays;
import java.util.Locale;

public class NumberFormatConfig {
    private int mDecimalPlaces;

    // Конструктор класса
    public NumberFormatConfig(int decimalPlaces) {
        this.mDecimalPlaces = decimalPlaces;
    }

    // Геттер для количества знаков после запятой
    public int getDecimalPlaces() {
        return mDecimalPlaces;
    }

    // Сеттер для количества знаков после запятой
    public void setDecimalPlaces(int decimalPlaces) {
        this.mDecimalPlaces = decimalPlaces;
    }

    // Метод для округления массива чисел до указанного количества знаков после запятой
    public double[] roundArray(double[] numbers) {
        double scale = Math.pow(10, mDecimalPlaces);
        return Arrays.stream(numbers)
                .map(num -> Math.round(num * scale) / scale)
                .toArray();
    }

    // Метод для форматирования массива чисел с указанным количеством знаков после запятой
    public String[] formatArray(double[] numbers) {
        String format = "%." + mDecimalPlaces + "f";

        return Arrays.stream(numbers)
                .mapToObj(num -> String.format(Locale.US, format, num))
                .toArray(String[]::new);
    }
}
