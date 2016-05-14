package main.com.merlan.training;

/**
 * Created by Administrator on 2016/5/14.
 */
public class CallByValue {

    public static void increment(int a) {
        System.out.println("Value of a before incrementing is " + a);
        a = a + 1;
        System.out.println("Value of a after incrementing is " + a);
    }


}
