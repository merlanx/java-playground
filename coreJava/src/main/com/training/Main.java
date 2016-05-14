package com.training;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils utils = new Utils();

        // 1. reverse string
        System.out.println("---------- 1.Reverse string ----------");
        //System.out.println(utils.reverseString("abcdef"));

        // 2. do operator based on user input
        System.out.println("---------- 2.Do operations with two user inputs ----------");
        /*
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        //System.out.println(utils.ArithOperation(new Integer(args[0]).intValue(),new Double(args[1]).doubleValue()));
        System.out.println(utils.ArithOperation(x,y));
        */

        // 3. operator ++
        System.out.println("---------- 3.Testing operation ++ ----------");
        //utils.testPlus();

        // 4. for loop
        System.out.println("---------- 4.Testing for loop ----------");
        //System.out.println("Sum of 0 - 100 : " + utils.testLoop());

        // 5. Guessing Game
        System.out.println("---------- 5.Guessing Game  ----------");
        //Scanner scanner = new Scanner(System.in);
        //utils.guessingGame(scanner);

        // 6. Check Prime Number
        System.out.println("---------- 6.Check Prime Number  ----------");
        //Scanner scanner = new Scanner(System.in);
        //utils.checkPrimeNumber(scanner);

        // 7. do array
        System.out.println("---------- 7.Do Array  ----------");
        // utils.doArray();

        // 8. print matrix
        System.out.println("---------- 8.Print Matrix  ----------");
        //utils.printMatrix();

        // 9. Reverse Array
        System.out.println("---------- 9.Reverse Array  ----------");
        //int[] arr = {2,14,19,1,31};
        //utils.reverseArray(arr);

        // 10. Guessing Game with Math.random()
        System.out.println("---------- 10.Guessing Game with Math.random() ----------");
        //utils.guessingGameWithRandom();

        // 11. Sort Array
        System.out.println("---------- 11.Sort Array ----------");
        //utils.sortArray();


        // 12. Java Object
        System.out.println("---------- 11.Sort Array ----------");
        Person p = new Person();
        System.out.println("The person's name is " + p.getName());
        System.out.println("The person's age is " + p.getAge());

        // 13. Use different language
        System.out.println("---------- 13.Use Different Language ----------");
        System.out.println("    *****Displaying in Simply Chinese*****");
        utils.useDiffLang("CN");
        System.out.println("    *****Displaying in HK Traditional Chinese*****");
        utils.useDiffLang("ZH");
        System.out.println("    *****Displaying in TW Traditional Chinese*****");
        utils.useDiffLang("TW");
        System.out.println("    *****Displaying in English*****");
        utils.useDiffLang("EN");
        System.out.println("    *****Displaying by system default*****");
        utils.useDiffLang("");
    }
}
