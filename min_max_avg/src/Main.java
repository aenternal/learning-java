import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Создаем объект NumberFormatConfig с количеством знаков после запятой
        NumberFormatConfig config = new NumberFormatConfig(2);

        // Генерируем массив случайных чисел
        int arraySize = 10;
        double[] numbers = RandomArrayProcessor.generateRandomArray(arraySize);

        // Округляем и форматируем массив чисел
        double[] roundedNumbers = config.roundArray(numbers);
        String[] formattedNumbers = config.formatArray(roundedNumbers);

        // Выводим отформатированный массив случайных чисел
        System.out.printf("Массив случайных чисел: %s%n", Arrays.toString(formattedNumbers));

        // Вычисляем и выводим максимальное, минимальное и среднее значения
        double max = RandomArrayProcessor.findMax(roundedNumbers);
        double min = RandomArrayProcessor.findMin(roundedNumbers);
        double avg = RandomArrayProcessor.findAverage(roundedNumbers);

        // Локаль US для отображения точки как разделителя целой и дробной части числа
        Locale.setDefault(Locale.US);

        System.out.printf(
                "Максимальное значение: %.2f%n" +
                "Минимальное значение: %.2f%n" +
                "Среднее значение: %.2f%n",
                max, min, avg
        );
    }
}