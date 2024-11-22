import java.util.*;

public class AllTasks {

    // Завдання 1
    public static void task1() {
        int n = 10;
        int[] numbers = new int[n];
        Random randomizer = new Random();

        for (int i = 0; i < n; i++) {
            numbers[i] = randomizer.nextInt(50) + 1;
        }

        int evens = 0, odds = 0;
        for (int value : numbers) {
            if (value % 2 == 0) evens++;
            else odds++;
        }

        // Вивід
        System.out.println("Масив чисел: " + Arrays.toString(numbers));
        System.out.println("Парних чисел: " + evens + ", Непарних чисел: " + odds);
    }

    // Завдання 2
    public static void task2() {
        Scanner sc = new Scanner(System.in);

        // Введення даних
        System.out.print("Введіть кількість кутів: ");
        int sides = sc.nextInt();

        if (sides < 3) {
            System.out.println("Такого багатокутника не існує.");
            return;
        }

        int[] angles = new int[sides];
        int total = 0;

        System.out.println("Введіть кути:");
        for (int i = 0; i < sides; i++) {
            angles[i] = sc.nextInt();
            total += angles[i];
        }

        int expectedSum = (sides - 2) * 180;
        if (total == expectedSum) {
            System.out.println("Багатокутник можливий.");
        } else {
            System.out.println("Багатокутник неможливий.");
        }
    }

    // Завдання 3
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Введення розміру
        System.out.print("Розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Згенерований масив:");
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }

        // Змінити значення
        System.out.print("\nЯке значення замінити? ");
        int target = scanner.nextInt();
        System.out.print("На яке замінити? ");
        int newValue = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                array[i] = newValue;
            }
        }

        // Вивід
        System.out.println("Оновлений масив: " + Arrays.toString(array));
    }

    // Завдання 4
    public static void task4() {
        System.out.println(" Значень синуса:");

        for (int i = 0; i <= 90; i++) {
            System.out.printf("%.4f ", Math.sin(Math.toRadians(i)));
            if (i % 10 == 9) System.out.println();
        }
    }

    // Завдання 5
    public static void task5() {
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        // Введення даних
        System.out.print("Розмір масиву: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = randomizer.nextInt(100);
        }

        System.out.print("Зростання (1) Спадання (2): ");
        int mode = sc.nextInt();

        boolean sorted = true;
        for (int i = 1; i < size; i++) {
            if (mode == 1 && numbers[i] < numbers[i - 1]) {
                sorted = false;
                break;
            }
            if (mode == 2 && numbers[i] > numbers[i - 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println("Масив: " + Arrays.toString(numbers));
        if (sorted) {
            System.out.println("Масив впорядкований.");
        } else {
            System.out.println("Масив не впорядкований.");
        }
    }

    // Основна програма
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nВиберіть завдання (1-5):");
            int choice = input.nextInt();

            switch (choice) {
                case 1: task1(); break;
                case 2: task2(); break;
                case 3: task3(); break;
                case 4: task4(); break;
                case 5: task5(); break;
                default: System.out.println("Невірний вибір.");
            }
        }
    }
}
