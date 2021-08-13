import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class HW3 {

    public static void main(String[] args) {
//        vegetable();
//        vegetable2();
//        vegetable3();
//        vegetable4();
//        vegetable5();
//        vegetable6();
//        vegetable7();
//        vegetable8();
        vegetable9();
    }

    public static void vegetable() {
        ArrayList<String> vegetable = new ArrayList<String>();
        // добавим в список ряд элементов
        vegetable.add("Вишня");
        vegetable.add("Черешня");
        vegetable.add("Яблоко");
        vegetable.add("Груша");
        System.out.println(vegetable);

        vegetable.add(0, "Картофель");
        vegetable.add(5, "Картофель");
        System.out.println(vegetable);

    }

    public static void vegetable2() {
        ArrayList<String> vegetable = new ArrayList<String>();
        // добавим в список ряд элементов
        vegetable.add("Вишня");
        vegetable.add("Черешня");
        vegetable.add("Яблоко");
        vegetable.add("Груша");
        vegetable.add("Лимон");
        vegetable.add("Апельсин");
        System.out.println(vegetable);

        System.out.println(vegetable.get(0));
        vegetable.remove(0);

        System.out.println(vegetable.get(2));
        vegetable.remove(2);

        System.out.println(vegetable.get(3));
        vegetable.remove(3);

        System.out.println(vegetable);
    }

    public static void vegetable3() {
        ArrayList<String> vegetable = new ArrayList<String>();
        // добавим в список ряд элементов
        vegetable.add("Вишня");
        vegetable.add("Черешня");
        vegetable.add("Яблоко");
        vegetable.add("Груша");
        vegetable.add("Лимон");
        vegetable.add("Апельсин");
        System.out.println(vegetable);

        if (vegetable.contains("Лимон")) {

            System.out.println("ArrayList contains Лимон");
        }
    }

    public static void vegetable4() {
        ArrayList<String> vegetable = new ArrayList<String>();
        // добавим в список ряд элементов
        vegetable.add("Синий");
        vegetable.add("Белый");
        vegetable.add("Черный");
        vegetable.add("Оранжевый");
        vegetable.add("Фиолетовый");
        vegetable.add("Красный");
        System.out.println(vegetable);

        // перебор значений
        vegetable.indexOf("Фиолетовый");
        System.out.println(vegetable.indexOf("Фиолетовый"));
    }

    public static void vegetable5() {
        long[] numbersArray = new long[15];
        for (int i = 0; i < numbersArray.length; i++) {
            long xz = Math.round(Math.random() * 10);
            numbersArray[i] = xz;
            System.out.println(numbersArray[i]);
        }
    }

    public static void vegetable6() {
        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        int max = getMax(array);
        System.out.println("Максимальное значение: " + max);

        int min = getMin(array);
        System.out.println("Минимальное значение: " + min);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    //Почему не сортирует минусовые значения???
    public static void vegetable7() {
        ArrayList<Integer> vegetable = new ArrayList<>();
        vegetable.add(21);
        vegetable.add(22);
        vegetable.add(23);
        vegetable.add(24);
        vegetable.add(25);
        vegetable.add(26);
        vegetable.add(27);
        vegetable.add(28);
        vegetable.add(29);
        vegetable.add(200);
        vegetable.add(2000);
        vegetable.add(-2);
        vegetable.add(-27);

        for (Integer counter : vegetable) {
            System.out.print(counter + " ");
        }
    }

    //Почему не сортирует и не переворачивает минусовые значения???
    public static void vegetable8() {
        ArrayList<Integer> vegetable = new ArrayList<>();
        vegetable.add(21);
        vegetable.add(22);
        vegetable.add(23);
        vegetable.add(24);
        vegetable.add(25);
        vegetable.add(26);
        vegetable.add(27);
        vegetable.add(28);
        vegetable.add(29);
        vegetable.add(200);
        vegetable.add(2000);
        vegetable.add(-2);
        vegetable.add(-27);

        for (Integer counter : vegetable) {
            System.out.print(counter + " ");
        }
        Collections.sort(vegetable, Collections.reverseOrder());
        System.out.println(vegetable);
    }

    public static void vegetable9() {
        Random random = new Random();
        int[] ArrayList = {10, 20, 30, 40, 50, 60, 70};
        int[] newArray = new int[ArrayList.length];
        List<Integer> indexes = new ArrayList<>(ArrayList.length);
        int count = 0;
        while (true) {
            int var = random.nextInt(ArrayList.length);
            if (!indexes.contains(var)) {
                indexes.add(var);
                newArray[var] = ArrayList[count++];
            }
            if (count == ArrayList.length) {
                break;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}