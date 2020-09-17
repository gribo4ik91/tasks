package Magic_square;

import java.util.Arrays;
import java.util.Scanner;


//8
//"Write a program that will check if a two-dimensional arrays is magical square or not
//https://en.wikipedia.org/wiki/Magic_square"

public class Magic_square {
    public static void main(String[] args) {

        int sumLine = 0;
        int s = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a height");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        System.out.println("Insert array elements:");
        //Random random = new Random();

        int sumd = 0;                                         // сумма по диагонале
        int[] arraySum = new int[size];                       // сумма по вертикали
        int magr =  (size * (size * size + 1)) / 2;           // сумма для магического квадрата
        
        
        for (int i = 0; i < array.length; i++) {
            sumLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                sumLine = sumLine + array[i][j];
                // вычисление суммы по горизонтали
                if (i==j){
                    sumd = sumd +array[i][j];
                }
                // проверка на принадлежность к магическому квадрату горизонтали и диагонали
                if (j == array[j].length-1 && i ==array[i].length-1) {
                    if (sumLine != magr || sumd != magr)  {
                        System.out.println("Is not a magic square"+"\n");
                        System.out.println("Initial array is:");
                        System.out.println(Arrays.deepToString(array));
                        System.exit(0);
                    }
                }
                arraySum[i] = arraySum[i] + array[i][j];
            }
        }
        // проверка на принадлежность к магическому квадрату вертикале
        for ( int i =0; i <arraySum.length; i++)
            if (arraySum[i]!=magr) {
                System.out.println("Is not a magic square"+"\n");
                System.out.println("Initial array is:");
                System.out.println(Arrays.deepToString(array));
                System.exit(0);
            }

        System.out.println("Yes, is a magic square "+"\n");

        System.out.println("Initial array is:");

        System.out.println("\n" + Arrays.deepToString(array)+"\n" );
    }

}
