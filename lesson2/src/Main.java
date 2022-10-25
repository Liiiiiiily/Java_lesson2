public class Main {
    public static void main(String[] args) {

        }
//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
// от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean within10and20(int a, int b) {
        int c = a + b;

        if (c > 9 && c < 21) {
            return true;
        } else {
            return false;
        }
    }
//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void positiveOrNegative(int t) {

            if (t % 2 > 0) {
                System.out.println("Это положительное число.");
            if (t == 0) {
                    System.out.println("Это положительное число.");
                }
            } else {
                System.out.println("Это отрицательное число.");
            }
        }

//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
// если число отрицательное, и вернуть false если положительное.

    public static boolean positiveTrueOrFalse(int o) {

        if (o % 2 == 0) {
            return true;
        } else {
            return false;
            }
        }
//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
// в консоль указанную строку, указанное количество раз;

    public static void printWords(String words, int times) {
        for (int i=0; i<times; i++)
            System.out.println(words);
                // или System.out.println(words.repeat(times)); без for

        }

//5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
// не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

//         НЕ РАБОТАЕТ, ДОДЕЛАЮ НА ЛЕКЦИИ С РАЗБОРОМ ДЗ
//
//    public static boolean leapYear(int year) {
//        if (year%100!=0 && year%4==0 && year%400 ==0) {
//            return false;
//        } else {
//            return true;
//        }
//     }
//    }
