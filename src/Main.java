import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //#1
        //////////////////////////////////////
        float avg = 0;
        int[] arr = {1,3,4,1,5,5};
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg / arr.length;
        System.out.println(avg);
        System.out.println();

        //#2
        //////////////////////////////////////
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println("Duplicate is:" + arr[i]);
            }
        }
        System.out.println();

        //#3
        //////////////////////////////////////
        int[] arr2 = {1, 3, -6, 23, 14, 2};
        int x = 23;
        boolean hasInIt = false;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == x)
                hasInIt = true;
        }
        System.out.println(hasInIt);
        System.out.println();

        //#4
        //////////////////////////////////////
        int index = -1;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == x)
                index = i;
        }
        if(index != -1)
            System.out.println(index);
        else
            System.out.println("Не найдено");
        System.out.println();

        //#5
        //////////////////////////////////////
        int[] arr3 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        int[] resArr = new int[m-n+1];
        int j = 0;
        for (int i = n; i <= m; i++) {
            resArr[j] = arr3[i];
            j++;
        }
        System.out.println(Arrays.toString(resArr));
        System.out.println();

        //#6
        //////////////////////////////////////
        int[] arr4 = {1, 3, -6, 23, 14, 2};
        Arrays.sort(arr4);
        System.out.println("Минимальный элемент = " + arr4[0]);
        System.out.println("Максимальный элемент = " + arr4[arr4.length-1]);
        System.out.println();

        //#7
        //////////////////////////////////////
        System.out.println("Минимальный элемент = " + arr4[0]);
        System.out.println("Максимальный элемент = " + arr4[1]);
        System.out.println();

        //#8
        //////////////////////////////////////
        int[] arr5 = {1, 2, 3, 0, 4, 6};
        Arrays.sort(arr5);
        int maxNum = 0;
        for (int i = arr5.length-1; i >= 0; i--) {
            maxNum = maxNum * 10 + arr5[i];
        }
        System.out.println(maxNum);
        System.out.println();

        //#9
        //////////////////////////////////////
        int[][] mass = {{10,20},{40,50}};
        int[][] mass2 = new int[mass[0].length][mass.length];
        for (int i = 0; i < mass.length; i++) {
            for (int k = 0; k < mass[0].length; k++) {
                mass2[k][i] = mass[i][k] ;
            }
        }
        for (int i = 0; i < mass2.length; i++) {
            for (int k = 0; k < mass2[0].length; k++) {
                System.out.print(mass2[i][k] + " ");
            }
            System.out.println("");
        }
        System.out.println();

        //#10
        //////////////////////////////////////
        int sumOfAll = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int k = 0; k < mass[0].length; k++) {
                sumOfAll += mass[i][k];
            }
        }
        System.out.println("Сумма = " + sumOfAll);
        System.out.println();

        //11
        //////////////////////////////////////
        int[][] massive = {{1,2},{2,1}};
        boolean isSqare = true;
        for (int i = 0; i < mass.length; i++) {
            for (int k = 0; k < mass[i].length; k++) {
            }
            if(mass[i].length != mass.length)
                isSqare = false;
        }
        System.out.println(isSqare);
        System.out.println();

        //#12
        //////////////////////////////////////
        n = 5;
        int[][] table = new int[n][n];
        for (int i = 0; i < table.length; i++) {
            int start = 0;
            for (int k = 0; k < table.length; k++) {
                table[i][k] = start+i+1;
                start = start + i + 1;
                System.out.print(table[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //#13
        //////////////////////////////////////
        int[][] doubleArray = {{10,20,30},{40,50,60}};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int k = 0; k < doubleArray[i].length; k++) {
                if( doubleArray[i][k] < min)
                    min = doubleArray[i][k];
                if( doubleArray[i][k] > max)
                    max = doubleArray[i][k];
            }
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}
/*
13. Напишите программу, которая возвращает максимальное и минимальное значение, найденные в двумерном массиве.
Примеры:
Дано:
10 20 30
40 50 60

Вывод:
Максимальный элемент = 60
Минимальный элемент = 10
*/