import java.util.ArrayList;
import java.util.Arrays;

public class HW3 {

    public static void main(String[] args) {
//        vegetable();
//        vegetable2();
        vegetable3();
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
}
