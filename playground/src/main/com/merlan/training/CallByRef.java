package main.com.merlan.training;

/**
 * Created by Administrator on 2016/5/14.
 */
public class CallByRef {

    public static void increment(Number n) {
        System.out.println("Value of a before incrementing is " + n.a);
        n.a = n.a + 1;
        System.out.println("Value of a after incrementing is " + n.a);
    }
}
