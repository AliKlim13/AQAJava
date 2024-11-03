package Lesson_3;

public class Tasks {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumber() {
        int a = 10;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void printSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return true;
        }
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void multiplyLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Вызов методов
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();

        System.out.println(checkSum(5, 5));
        System.out.println(checkSum(1, 2));

        printSign(10);
        printSign(-5);

        System.out.println(isNegative(10));
        System.out.println(isNegative(-5));

        printStringMultipleTimes("Hello", 3);

        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2023));

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr1);
        System.out.print("Измененный массив: [");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] arr2 = new int[100];
        fillArray(arr2);
        System.out.print("Заполненный массив: [");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThan6(arr3);
        System.out.print("Измененный массив: [");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i < arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[][] arr4 = new int[5][5];
        fillDiagonal(arr4);
        System.out.println("Двумерный массив:");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr5 = createArray(10, 5);
        System.out.print("Созданный массив: [");
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]);
            if (i < arr5.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
