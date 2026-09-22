import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    //методы
    public double fraction(double x) {
        int a = (int) x;
        return x - a;
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean is2Digits(int x) {
        return (x > 9 && x < 100)||(x < -9 && x > - 100);
    }

    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        return a % b == 0 || b % a == 0;
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && a == c;
    }

    //if else

    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        else if (x % 3 == 0 || x % 5 == 0) {
            return true;
        }
        return false;
    }

    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public String age(int x) {
        if (x % 100 >= 11 && x % 100 <= 14) {
            return x + " лет";
        }
        if (x % 10 == 1) {
            return x + " год";
        }
        if (x % 10 >= 2 && x % 10 <= 4) {
            return x + " года";
        }
        return x + " лет";
    }

    public void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("Понедельник");
            case "вторник":
                System.out.println("Вторник");
            case "среда":
                System.out.println("Среда");
            case "четверг":
                System.out.println("Четверг");
            case "пятница":
                System.out.println("Пятница");
            case "суббота":
                System.out.println("Суббота");
            case "воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }

    //forIwhile
    public String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += i + " ";
        }
        return res;
    }

    public int pow(int x, int y) {
        int num = 1;
        for (int i = 0; i < y; i++) {
            num = num * x;
        }
        return num;
    }

    public boolean equalNum(int x) {
        int digits = x % 10;
        x = x / 10;
        while (x > 0) {
            if (x % 10 != digits) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void guessGame() {
        Random random = new Random(); //объект для генерации
        int number = random.nextInt(10); //загаданное число (некстинт(10)) это от 0-9

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            System.out.println("Введите число от 0 до 9: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
            x = scanner.nextInt();
            count++;

            if (x == number) {
                System.out.println("Вы угадали!");
            }
            else {
                System.out.println("Вы не угадали!");
            }
        } while (x != number);

        System.out.println("Вы отгадали число за " + count + " попытки.");
    }

    //списки

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int copy = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = copy;
        }
    }

    public int[] reverseBack(int [] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }

    public int check(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        Main n = new Main();
        Scanner scanner = new Scanner(System.in);
        String menu = """
                Лабараторная работа номер 1
                Вариант - 7
                Выберите задачу:
                Задание 1:
                1)  - 1 Дробная часть числа
                2)  - 4 Проверка на положительное число
                3)  - 5 Проверка на двузначное число
                4)  - 8 Проверка на делитель
                5)  - 9 Проверка равенства трех чисел
                
                Задание 2:
                6)  - 3 Проверка делимости на 3 или 5
                7)  - 5 Максимум из трех чисел
                8)  - 7 Двойная сумма
                9)  - 8 Определение возраста
                10) - 10 Вывод дней недели
                
                Задание 3:
                11) - 2 Числа наоборот (от X до 0)
                12) - 4 Степень числа
                13) - 6 Проверка одинаковых цифр
                14) - 9 Правый треугольник
                15) - 10 Игра Угадайка
                
                Задание 4:
                16) - 1 Поиск первого элемента в массиве
                17) - 3 Максимальный элемент по модулю
                18) - 6 Разворот массива
                19) - 7 Возвратный разворот массива
                20) - 8 Объединение двух массивов
                21) - ВЫХОД ИЗ ПРОГРАММЫ
                """;

        System.out.print(menu);
        System.out.println();

        while (true) {

            System.out.print("Выберите один из пунктов от 1 до 21: ");
            int choice = n.check(scanner);

            if (choice == 21) {
                System.out.println("Программа завершена.");
                break;
            }

            if (choice < 1 || choice > 20) {
                System.out.println("Ошибка! Выберите пункт от 1 до 21.");
                continue;
            }
            //int choice = scanner.nextInt();

            switch (choice) {

                case 1: {
                    System.out.print("Введите число: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Ошибка! Введите число.");
                        scanner.next();
                    }

                    double x = scanner.nextDouble();

                    System.out.println("Дробная часть: " + n.fraction(x));
                    break;
                }

                case 2: {
                    System.out.print("Введите целое число: ");
                    int x = n.check(scanner);

                    System.out.println("Результат: " + n.isPositive(x));
                    break;
                }

                case 3: {
                    System.out.print("Введите целое число: ");
                    int x = n.check(scanner);

                    System.out.println("Результат: " + n.is2Digits(x));
                    break;
                }

                case 4: {
                    System.out.print("Введите первое число: ");
                    int a = n.check(scanner);

                    System.out.print("Введите второе число: ");
                    int b = n.check(scanner);

                    System.out.println("Результат: " + n.isDivisor(a, b));
                    break;
                }

                case 5: {
                    System.out.print("Введите первое число: ");
                    int a = n.check(scanner);

                    System.out.print("Введите второе число: ");
                    int b = n.check(scanner);

                    System.out.print("Введите третье число: ");
                    int c = n.check(scanner);

                    System.out.println("Результат: " + n.isEqual(a, b, c));
                    break;
                }

                case 6: {
                    System.out.print("Введите целое число: ");
                    int x = n.check(scanner);

                    System.out.println("Результат: " + n.is35(x));
                    break;
                }

                case 7: {
                    System.out.print("Введите первое число: ");
                    int x = n.check(scanner);

                    System.out.print("Введите второе число: ");
                    int y = n.check(scanner);

                    System.out.print("Введите третье число: ");
                    int z = n.check(scanner);

                    System.out.println("Максимальное число: " + n.max3(x, y, z));
                    break;
                }

                case 8: {
                    System.out.print("Введите первое число: ");
                    int x = n.check(scanner);

                    System.out.print("Введите второе число: ");
                    int y = n.check(scanner);

                    System.out.println("Результат: " + n.sum2(x, y));
                    break;
                }

                case 9: {
                    System.out.print("Введите возраст: ");
                    int x = n.check(scanner);

                    if (x < 0) {
                        System.out.println("Возраст не может быть отрицательным.");
                    } else {
                        System.out.println(n.age(x));
                    }
                    break;
                }

                case 10: {
                    scanner.nextLine();

                    System.out.print("Введите день недели: ");
                    String x = scanner.nextLine();

                    n.printDays(x);
                    break;
                }

                case 11: {
                    System.out.print("Введите число: ");
                    int x = n.check(scanner);

                    if (x < 0) {
                        System.out.println("Число должно быть неотрицательным.");
                    } else {
                        System.out.println(n.reverseListNums(x));
                    }
                    break;
                }

                case 12: {
                    System.out.print("Введите число: ");
                    int x = n.check(scanner);

                    System.out.print("Введите степень: ");
                    int y = n.check(scanner);

                    if (y < 0) {
                        System.out.println("Степень должна быть неотрицательной.");
                    } else {
                        System.out.println("Результат: " + n.pow(x, y));
                    }
                    break;
                }

                case 13: {
                    System.out.print("Введите число: ");
                    int x = n.check(scanner);

                    System.out.println("Результат: " + n.equalNum(x));
                    break;
                }

                case 14: {
                    System.out.print("Введите размер треугольника: ");
                    int x = n.check(scanner);

                    if (x <= 0) {
                        System.out.println("Размер должен быть больше нуля.");
                    } else {
                        n.rightTriangle(x);
                    }
                    break;
                }

                case 15: {
                    n.guessGame();
                    break;
                }

                case 16: {
                    System.out.print("Введите размер массива: ");
                    int size = n.check(scanner);

                    if (size <= 0) {
                        System.out.println("Размер массива должен быть больше нуля.");
                        break;
                    }
                    int[] arr = new int[size];

                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = n.check(scanner);
                    }
                    System.out.print("Введите число для поиска: ");
                    int x = n.check(scanner);

                    System.out.println("Индекс первого вхождения: " + n.findFirst(arr, x));
                    break;
                }

                case 17: {
                    System.out.print("Введите размер массива: ");
                    int size = n.check(scanner);

                    if (size <= 0) {
                        System.out.println("Размер массива должен быть больше нуля.");
                        break;
                    }
                    int[] arr = new int[size];

                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = n.check(scanner);
                    }

                    System.out.println("Максимальный по модулю элемент: " + n.maxAbs(arr));

                    break;
                }

                case 18: {
                    System.out.print("Введите размер массива: ");
                    int size = n.check(scanner);

                    if (size <= 0) {
                        System.out.println("Размер массива должен быть больше нуля.");
                        break;
                    }
                    int[] arr = new int[size];

                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = n.check(scanner);
                    }
                    n.reverse(arr);

                    System.out.println("Перевернутый массив:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                }

                case 19: {
                    System.out.print("Введите размер массива: ");
                    int size = n.check(scanner);

                    if (size <= 0) {
                        System.out.println("Размер массива должен быть больше нуля.");
                        break;
                    }
                    int[] arr = new int[size];

                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = n.check(scanner);
                    }
                    int[] newArr = n.reverseBack(arr);

                    System.out.println("Новый перевернутый массив:");
                    for (int i = 0; i < newArr.length; i++) {
                        System.out.print(newArr[i] + " ");
                    }
                    System.out.println();
                    break;
                }

                case 20: {
                    System.out.print("Введите размер первого массива: ");
                    int size1 = n.check(scanner);

                    if (size1 <= 0) {
                        System.out.println("Размер массива должен быть больше нуля.");
                        break;
                    }

                    int[] arr1 = new int[size1];
                    System.out.println("Введите элементы первого массива:");

                    for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = n.check(scanner);
                    }

                    System.out.print("Введите размер второго массива: ");
                    int size2 = n.check(scanner);

                    if (size2 <= 0) {
                        System.out.print("Размер массива должен быть больше нуля.");
                        break;
                    }
                    int[] arr2 = new int[size2];

                    System.out.println("Введите элементы второго массива:");
                    for (int i = 0; i < arr2.length; i++) {
                        arr2[i] = n.check(scanner);
                    }
                    int[] newArr = n.concat(arr1, arr2);

                    System.out.println("Объединённый массив:");
                    for (int i = 0; i < newArr.length; i++) {
                        System.out.print(newArr[i] + " ");
                    }
                    System.out.println();
                    break;
                }

                default: {
                    System.out.println("Ошибка! Выберите пункт от 1 до 20.");
                }
            }
        }
        scanner.close();
    }
}
