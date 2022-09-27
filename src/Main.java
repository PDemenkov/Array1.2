import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = generateRandomArray();
//        System.out.println(Arrays.toString(arr)); //Вывод метода случайного заполнения массива
        int a = 100000; // Начальное значение диапазона - "от"
        int b = 200000; // Конечное значение диапазона - "до"
        int range = (b - a) + 1;
        int total = 0;
        double average;
        int[] array = new int[30];
        int min = array[0];
        int max = array[0];
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(array)); //проверка
        for (int ii = 0; ii < array.length; ii++) {
            array[ii] = (int) (Math.random() * range) + a;  //заполнение массива
            System.out.print(array[ii] + " ");
            total += array[ii]; // Задание 1 - сумма всех выплат за месяц
            if (array[ii] > max) { //Задание 2 нахождение максимального числа
                max = array[ii];
            }
            if (array[ii] < min) { //Задание 2 нахождение минимального числа, не считает ?
                min = array[ii];
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);

        average = (double) total / array.length; //Задание 3
        System.out.println("Сумма трат за месяц составила " + average + " рублей");

        System.out.println(Arrays.toString(reverseFullName));
        for (int j=0;j<reverseFullName.length / 2; j++){  //Задание 4
            int t = reverseFullName[j];
            reverseFullName[j] = reverseFullName[reverseFullName.length - j - 1];
            reverseFullName[reverseFullName.length-j-1] = (char) t;

        }System.out.println(Arrays.toString(reverseFullName));

    }


//    public static int[] generateRandomArray() {
//        java.util.Random random = new java.util.Random();
//        int[] arr = new int[30];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100_000) + 100_000;
//        }
//        return arr;
//    }
}