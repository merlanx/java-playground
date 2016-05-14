package main.com.merlan.training;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Administrator on 2016/5/14.
 */
public class TestMutiThread {
    private static Vector<Object> data = new Vector<Object>();

    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }

    public static class Consumer extends Thread {
        Consumer() {
            super("Consumer");
        }

        @Override
        public void run() {
            for (;;) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized(data){
                    for (Object o : data) {
                        System.out.println("----Consumming : " + o);
                    }
                }
            }
        }
    }

    public static class Producer extends Thread {
        Producer() {
            super("Producer");
        }

        @Override
        public void run() {
            for (int i=0;i< 15; i++) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                data.add(System.currentTimeMillis());
                System.out.println("Producing : " + data.get(data.size()-1));
                if (data.size() > 10)
                    data.remove(data.size() - 1);
            }
        }
    }
}
