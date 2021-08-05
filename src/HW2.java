import java.util.Scanner;

public class HW2 {
    private static String answer;

    public static void main(String[] args) {
        starsVariant1(10);
        starsVariant2();
        starsVariant11();
        starsVariant4();
        starsVariant5();
        starsVariant6();
        starsVariant7();
        starsVariant8();
        starsVariant10();
        puzzle();
    }


    public static void starsVariant1(int count) {
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < i; ++j)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void starsVariant2() {
        int i = 0;
        for (i = 10; i > 0; --i) {
            for (int j = 0; j < i; ++j)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void starsVariant11() {
        int i = 0;
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Переделать
    public static void starsVariant4() {
        int rectangle = 5;
        for (int i = 0; i < rectangle; i++) {

            for (int j = rectangle; j > i; j--) {
                if (i == 0) {
                    System.out.println("          *");
                } else {
                    System.out.println("*");
                }

                if (rectangle < 20) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
                if (rectangle < 4) {
                    System.out.print("Это оператор if");
                } else {
                    System.out.print("Это оператор else");
                }


                if (i == 0) {
                    System.out.println("-");
                }
            }

            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("+");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }

            for (int j = rectangle; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = rectangle; i >= 0; i--) {

            for (int j = rectangle; j > i; j--) {
                System.out.print(" ");
            }

            for (int j1 = 0; j1 <= i; j1++) {
                System.out.print("+");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }

            for (int j = rectangle; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void starsVariant5() {
        int num = 10;
        for (int i = 1; i <= num; ++i) {

            for (int j = num; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void starsVariant6() {
        int num = 10;
        for (int i = 1; i <= num; ++i) {

            for (int j = num; j > i; --j)
                System.out.print(" ");
            for (int j = 1; j < 1 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
    }


    public static void starsVariant8() {
        int num2 = 10;
        for (int i = 0; i <= num2; ++i) {

            for (int j = num2; j > i; --j)
                System.out.print("*");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print(" ");

            System.out.println();
        }
    }


    public static void starsVariant7() {
        int i = 10;

        for (i = 1; i <= 0; ++i) {

            for (int j = 0; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }

        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


    public static void starsVariant10() {
        int line = 10;
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < line; j++) {
                if (line - i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void puzzle() {
        String answers;
        boolean exit;
        System.out.println("Угадай! Сколько Василию сегодня стукнуло лет?");
        Scanner inputAnswer = new Scanner(System.in);

        exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit == true)
                break;
            answer = inputAnswer.next();
            switch (answer) {
                case ("42"):
                    System.out.println("Правильно!");
                    exit = true;
                    break;
                case (""):
                    System.out.println("Правильный ответ: 42 года");
                    exit = true;
                    break;
                default:
                    System.out.println("Пробуй ще");
            }
        }
    }
}