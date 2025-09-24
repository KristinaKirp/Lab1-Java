import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задание 1.1");
        System.out.println("Введите дробное число: ");
        Scanner scaner = new Scanner(System.in);
        double x = scaner.nextDouble();
        test ex1 = new test();
        double fraction1 = ex1.fraction(x);
        System.out.println("Дробная часть: " + fraction1);

        System.out.println("Задание 1.3");
        System.out.println("Введите символ от 0 до 9: ");
        char c = scaner.next().charAt(0);
        int toChar = ex1.charToNum(c);
        System.out.println("Символ преобразованный в число: "+ toChar);

        System.out.println("Задание 1.5");
        System.out.println("Проверк на двухзначность");
        System.out.println("Введите число: ");
        int num = scaner.nextInt();
        boolean Test = ex1.is2Digits(num);
        System.out.println(Test);

        System.out.println("Задание 1.7");
        System.out.println("Проверка входимости в диапазон");
        System.out.println("Введите число  края диапозона: ");
        int a = scaner.nextInt();
        System.out.println("Введите число второго края диапозона: ");
        int b = scaner.nextInt();
        System.out.println("Введите число для проверки входимости в диапозон: ");
        int num1 = scaner.nextInt();;
        boolean range = ex1.isInRange(a,b,num1);
        System.out.println(range);

        System.out.println("Задание 1.9");
        System.out.println("Проверка равности чисел ");
        System.out.println("Введите первое число: ");
        int a1 = scaner.nextInt();
        System.out.println("Введите второе число: ");
        int b1 = scaner.nextInt();
        System.out.println("Введите третье число: ");
        int c1 = scaner.nextInt();;
        boolean equal = ex1.isEqual(a1,b1,c1);
        System.out.println(range);

        System.out.println("Задание 2.1");
        System.out.println("Возвращение модуля");
        System.out.println("Введите число");
        int x1 = scaner.nextInt();
        int ab = ex1.abs(x1);
        System.out.println("Модуль введеного числа: " + ab);

        System.out.println("Задание 2.3");
        System.out.println("Проверка на делимость на 3 и 5");
        System.out.println("Введите число: ");
        int number = scaner.nextInt();
        boolean is35 = ex1.is35(number);
        System.out.println(is35);

        System.out.println("Задание 2.5");
        System.out.println("Нахождение максимального чсила");
        System.out.println("Введите первое число: ");
        int number1 = scaner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scaner.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scaner.nextInt();
        int max3 = ex1.max3(number1, number2, number3);
        System.out.println("Максимально число из введеных: " + max3);

        System.out.println("Задание 2.7");
        System.out.println("Программа считает сумму чисел, если она поподает в диапазон от 10 до 19, автоматически округляет до 20 ");
        System.out.println("Введите первое число: ");
        int numb1 = scaner.nextInt();
        System.out.println("Введите второе число: ");
        int numb2 = scaner.nextInt();
        int S = ex1.sum2(numb1, numb2);
        System.out.println(S);

        System.out.println("Задание 2.9");
        System.out.println("Введите число для обозначения дня недели: ");
        int num2 = scaner.nextInt();
        String day = ex1.day(num2);
        System.out.println(day);

        System.out.println("Задание 3.1");
        System.out.println("Введите число для вывода всех чисел от 0 до вашего числа: ");
        int y = scaner.nextInt();
        String list = ex1.listNums(y);
        System.out.println(list);

        System.out.println("Задание 3.3");
        System.out.println("Введите число для вывода всех четных чисел от 0 до него: ");
        int z = scaner.nextInt();
        String chet = ex1.chet(z);
        System.out.println(chet);

        System.out.println("Задание 3.5");
        System.out.println("Введите число для подсчета количества цифр: ");
        long lenth = scaner.nextInt();
        int numLen = ex1.numLen(lenth);
        System.out.println(numLen);

        System.out.println("Задание 3.7");
        System.out.println("Введите число для вывода квадрата: ");
        int l = scaner.nextInt();
        ex1.square(l);
        System.out.println();

        System.out.println("Задание 3.9");
        System.out.println("Введите число для вывода правого треугольника: ");
        int l1 = scaner.nextInt();
        ex1.rightTriangle(l1);
        System.out.println();

        System.out.println("Задание 4.1");
        System.out.println("Возвращает первое вхождение числа в массив ");
        System.out.println("Введите размер массива: ");
        int size = scaner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите числа в массив: ");
        for(int i = 0; i < size; i++){
            System.out.print("№" + (i+1) + " ");
            int x41 = scaner.nextInt();
            arr[i] = x41;
        }
        System.out.println("Введите число индекс которого нужно вывести: ");
        int findNum = scaner.nextInt();
        int findFirst = ex1.findFirst(arr, findNum);
        System.out.println("Индекс вашего числа: " + findFirst);

        System.out.println("Задание 4.3");
        System.out.println("Вывод масимального по модуля числа в массиве");
        System.out.println("Введите размер массива: ");
        int size1 = scaner.nextInt();
        int[] arrAbs = new int[size1];
        System.out.println("Введите числа в массив: ");
        for(int i = 0; i < size1; i++) {
            System.out.print("№" + (i+1) + " ");
            int x43 = scaner.nextInt();
            arrAbs[i] = x43;
        }
        int maxNum = ex1.maxAbs(arrAbs);
        System.out.println("Наибольшее значение по модулю в массиве: " + maxNum);

        System.out.println("Задание 4.5");
        System.out.println("Возвращение нового массива состоящего из 2 ваших ");
        System.out.println("Введите размер первого массива: ");
        int sizeArr1 = scaner.nextInt();
        int[] arr1 = new int[sizeArr1];
        System.out.println("Введите числа в массив: ");
        for(int i = 0; i < sizeArr1; i++) {
            System.out.print("№" + (i+1) + " ");
            int a45 = scaner.nextInt();
            arr1[i] = a45;
        }
        System.out.println("Введите размер второго массива: ");
        int sizeArr2 = scaner.nextInt();
        int[] arr2 = new int[sizeArr2];
        System.out.println("Введите числа в массив: ");
        for(int i = 0; i < sizeArr2; i++) {
            System.out.print("№" + (i+1) + " ");
            int b45 = scaner.nextInt();
            arr2[i] = b45;
        }
        System.out.println("Введите число, после какой позиции вставлять значение второго массива в первый");
        int pos = scaner.nextInt();
        int[] newArr = ex1.add(arr1,arr2,pos);
        for(int i = 0; i < newArr.length; i ++){
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        System.out.println("Задание 4.7");
        System.out.println("Возврат массив в обратном порядке");
        System.out.println("Введите размер массива: ");
        int sizeOrig = scaner.nextInt();
        int[] arrOrig = new int[sizeOrig];
        System.out.println("Введите числа в массив: ");
        for(int i = 0; i < sizeOrig; i++) {
            System.out.print("№" + (i+1) + " ");
            int x47 = scaner.nextInt();
            arrOrig[i] = x47;
        }
        int[] reversArr = ex1.reverseBack(arrOrig);
        for(int i = 0; i < arrOrig.length; i++){
            System.out.print(reversArr[i] + " ");
        }
        System.out.println();
        System.out.println("Задание 4.9");
        System.out.println("Возвращение массива, содержащего индексы найденных чисел");
        System.out.println("Введите размер массива: ");
        int sizeArr = scaner.nextInt();
        int[] arrFind = new int[sizeArr];
        System.out.println("Введите числа в массив: ");
        for(int i = 0; i < sizeArr; i++) {
            System.out.print("№" + (i+1) + " ");
            int x49 = scaner.nextInt();
            arrFind[i] = x49;
        }
        System.out.println("Введите число для нахождения индексов в массиве: ");
        int index = scaner.nextInt();
        int[] finalArr = ex1.findAll(arrFind, index);
        for(int i = 0; i < finalArr.length; i ++){
            System.out.print(finalArr[i] + " ");
        }







    }
}