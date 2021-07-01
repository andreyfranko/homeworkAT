public class Domashka {
        public static void main(String[] args) {

            //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
            //Вывести на консоль количество максимальных чисел среди этих четырех.
            int a =10;
            int b =9;
            int c =8;
            int d =7;
            int minNumber = Math.min( Math.min(a,b), Math.min(c,d));
            int bigNumber = Math.max( Math.max(a,b), Math.max(c,d));
            System.out.println("Smallest number " + minNumber);
            System.out.println("Largest number " + bigNumber );



          //Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
            int e = 150;
            int f = 90;
            int g = 10;
            int h = 13;
            int i = 194;
            int min;
            int max;
            min = Math.min(e, Math.min(Math.min(f,g), Math.min(h,i)));
            max = Math.max(e, Math.max(Math.max(f,g), Math.max(h,i)));
            System.out.println(min);
            System.out.println(max);




            //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
            String name1 = "Andrey";
            String name2 = "Matvey";
            String result;

            if (name1.equalsIgnoreCase(name2)){
                result= "Эти 2 человека тезки!";
            }else
                result= "Эти 2 человека НЕ тезки!";
            System.out.println(result);




            //Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
            int monthNum=7;
            switch (monthNum){
                case 1:
                    System.out.println("Janyary");
                    break;
                case 2:System.out.println("February");
                    break;
                case 3: System.out.println("March");
                    break;
                case 4: System.out.println("April");
                    break;
                case 5: System.out.println("May");
                    break;
                case 6: System.out.println("June");
                    break;
                case 7: System.out.println("Jule");
                    break;
                case 8: System.out.println("August");
                    break;
                case 9:System.out.println("September");
                    break;
                case 10: System.out.println("October");
                    break;
                case 11: System.out.println("November");
                    break;
                case 12: System.out.println("December");

            }
        }
    }
