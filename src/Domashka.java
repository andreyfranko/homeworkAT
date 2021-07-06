public class HW1 {
    public static void main(String[] args) {

        checkMonth();
    }

    public static void checkMonth() {
        //Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        int month = 3;
        String season;
        if(month == 1 || month == 2 || month == 12)
            season = "Зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Введите валидное число от 1-го до 12 ?";
        System.out.println(season);
    }

    public static void checkName() {
        //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
        String name1 = "Andrey";
        String name2 = "Matvey";
        String result;

        if (name1.equalsIgnoreCase(name2)) {
            result = "Эти 2 человека тезки!";
        } else
            result = "Эти 2 человека НЕ тезки!";
        System.out.println(result);
    }
    public static void checkNumberMax() {
        //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
        //Вывести на консоль количество максимальных чисел среди этих четырех.
        int a = 10;
        int b = 9;
        int c = 8;
        int d = 7;
        int minNumber = Math.min(Math.min(a, b), Math.min(c, d));
        int bigNumber = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Smallest number " + minNumber);
        System.out.println("Largest number " + bigNumber);
    }

    public static void checkNumberMin() {
        //Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
        int e = 100;
        int f = 90;
        int g = 80;
        int h = 70;
        int i = 60;
        int min;
        int max;
        min = Math.min(e, Math.min(Math.min(f, g), Math.min(h, i)));
        max = Math.max(e, Math.max(Math.max(f, g), Math.max(h, i)));
        System.out.println(min);
        System.out.println(max);
    }
}

