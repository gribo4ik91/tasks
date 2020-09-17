package LeapYears;

import java.util.Arrays;
import java.util.Scanner;

//11
//"Write a program that outputs the next k leap years
//        https://en.wikipedia.org/wiki/Leap_year"


public class leapYears {

    public static void main(String[] args) {

        int year = 2016;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere a number of year");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
             year = year + 4;
             array[i] =  year;



        }
        System.out.println("Leap years are: ");
        System.out.println(Arrays.toString(array));
    }
}