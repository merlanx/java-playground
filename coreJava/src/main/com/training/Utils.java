package com.training;

import java.util.*;

/**
 * Created by Administrator on 2016/5/7 0007.
 */
public class Utils {
    public Utils() {
    }
    public String reverseString(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--){
            //output = output + str.charAt(i);
            output += str.charAt(i);
        }
        return output;
    }
    public double ArithOperation(int a,double b){
        return a + b;
    }
    public void testPlus(){
        int x = 1;
        System.out.println("++ is behind: " + x++);
        x=1;
        System.out.println("++ is behind plusing 2: " + (x++ + 2));
        x=1;
        System.out.println("++ is aheard:" +  ++x);
        x=1;
        System.out.println("++ is aheard plusing 2:" + ( ++x + 2));
    }

    public int testLoop(){
        int sum = 0;
        for(int i = 0 ; i<= 100; i++) {
            sum += i;
        }
        return sum;
    }
    public void guessingGame(Scanner scanner) {
        int point = 15;
        boolean res = false;
        while (!res) {
            int input = scanner.nextInt();
            if(input > point) {
                System.out.print("Please input a small integer: ");
            } else if(input < point) {
                System.out.print("Please input a larger integer: ");
            } else {
                System.out.print("You Got it : " + point);
                res = true;
            }
        }
    }

    public void checkPrimeNumber(Scanner scanner){
        int target = 2;
        int input = scanner.nextInt();
        boolean isPrime = true;
        while( target < input ) {
            if(input % target == 0) {
                isPrime = false;
                break;
            }
            target ++;
        }
        if(isPrime) {
            System.out.println(input + " is a prime number!");
        } else {
            System.out.println(input + " is not a prime number!");
        }
    }

    public void doArray() {
        int[] arr = {1, 2, 3,47};
        int sum = 0;
        int min = arr[0] ;
        int max = arr[0];
        for (int i : arr) {
            sum += i;
            if (i < min) {
                min = i;
            } else if(i > max) {
                max = i;
            }
        }
        double aver = (double)sum/arr.length;
        System.out.println("Average of array is " + aver);
        System.out.println("The smallest and largest number of array are " + min + " and " + max);
    }

    public void printMatrix() {
        int[][] arr = new int[10][10];
        for(int i = 0, row =1; row< arr.length * arr[0].length; i++) {
            for(int j = 0; j< arr[0].length; j++) {
                arr[i][j] = row + j;
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
            row += 10;
        }
    }

    public void reverseArray(int[] arr){
        int len = arr.length;
        int[] output = new int[len];
        System.out.print("Original Array is | ");
        for(int i = 0; i < arr.length; i++) {
            output[len - 1 - i ] = arr[i];
            System.out.print(arr[i] + " | ");
        }
        System.out.println("");
        System.out.print("New Array is      | ");
        for(int i = 0; i < output.length; i++){
            System.out.print(output[i] + " | ");
        }
    }

    public void guessingGameWithRandom() {
        int point = 15;
        boolean res = false;
        while (!res) {
            int input = (int) ((Math.random() ) * 20);
            if(input > point) {
                System.out.println("." + input);
            } else if(input < point) {
                System.out.println("." + input);
            } else {
                System.out.print("You Got it : " + point);
                res = true;
            }
        }
    }

    public void sortArray() {
        int[] arr = new int[10];
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        //descending
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        //Arrays.sort(arr); // ascending
        System.out.println("");
        this.reverseArray(arr);
    }

    public void useDiffLang(String language) {

        Locale locale = null;
        if(language.equals("ZH") || language.equals("TW")){
            locale = Locale.TRADITIONAL_CHINESE;
        } else if(language.equals("CN")) {
            locale = Locale.SIMPLIFIED_CHINESE;
        } else if(language.equals("EN")) {
            locale = Locale.ENGLISH;
        } else {
            locale = Locale.getDefault();
            //locale = Locale.;
        }

        ResourceBundle rb = ResourceBundle.getBundle("bundle", locale);
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = rb.getString(key);
            System.out.println(key + " : " + value);
        }
    }
}
