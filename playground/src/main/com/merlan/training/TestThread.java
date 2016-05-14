package main.com.merlan.training;

import com.sun.org.apache.xml.internal.security.signature.reference.ReferenceNodeSetData;

/**
 * Created by Administrator on 2016/5/14.
 */
//public class TestThread extends Thread {
public class TestThread implements Runnable {
    private final int i;
    public static int num = 0;

    public TestThread(int i) {
        this.i = i;
    }


    @Override
    public void run() {
        this.setNum();
        this.print1(this.i);
    }

    public synchronized void setNum() {
        num = num + 1;
    }
    public void print1(int i) { System.out.println("printing thread : " + i + " with number as " + this.num);}
}
