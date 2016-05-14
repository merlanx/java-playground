package main.com.merlan;

import main.com.merlan.tools.CountFrequence;
import main.com.merlan.training.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

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
            System.out.println("---------- 12.Sort Array ----------");
            //Person p = new Person();
            //System.out.println("The person's name is " + p.getName());
            //System.out.println("The person's age is " + p.getAge());

            // 13. Use different language
        System.out.println("---------- 13.Use Different Language ----------");
        /*System.out.println("    *****Displaying in Simply Chinese*****");
        utils.useDiffLang("CN");
        System.out.println("    *****Displaying in HK Traditional Chinese*****");
        utils.useDiffLang("ZH");
        System.out.println("    *****Displaying in TW Traditional Chinese*****");
        utils.useDiffLang("TW");
        System.out.println("    *****Displaying in English*****");
        utils.useDiffLang("EN");
        System.out.println("    *****Displaying by system default*****");
        utils.useDiffLang("");*/

        // 14. Test Inheritance
        System.out.println("---------- 14.Test Inheritance ----------");
       /* Cat c = new Cat();
        Mammal mammalCat = new Cat("kitty");
        Cat cat = new Cat("kitty");
        cat.sing("miao");
        Bike obj = new Honda3();
        Honda3 honda = new Honda3();
        obj.run();
        obj.paint();
        honda.paint();
        System.out.println(obj.speedLimit);
        System.out.println(honda.speedLimit);*/

        // 15. Test Call by value and reference
        System.out.println("---------- 15.Test Call by value and reference ----------");
        /*CallByValue callByValue = new CallByValue();
        int a = 3;
        callByValue.increment(3);
        System.out.println("a is " + a);
        CallByRef callByRef = new CallByRef();
        Number n = new Number();
        n.a = 0;
        callByRef.increment(n);
        System.out.println("number.a is " + n.a);*/
        // 16. Test IO
        System.out.println("---------- 16.Test IO ----------");
        //IOUtils ioUtils = new IOUtils();
        //ioUtils.testIO();
        //ioUtils.testRandomAccess();

        // 17. Test Collection and Map
        System.out.println("---------- 17.Test Collection and Map ----------");
       /* CountFrequence cf = new CountFrequence("F:\\dev\\git\\java-playground\\playground\\src\\main\\resource\\training\\ProfessionalEmail.doc");
        cf.count();
        cf.printResult();*/

        // 18. Test Thread
        System.out.println("---------- 18. Test Thread ----------");
        /*for(int i = 0; i< 10; i++) {
            Thread thread = new Thread(new TestThread(i));
            //TestThread thread = new TestThread(i);
            thread.start();
            //thread.sleep(1);
        }*/
    }
}
