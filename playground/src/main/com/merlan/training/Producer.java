package main.com.merlan.training;

import java.util.Vector;

/**
 * Created by Administrator on 2016/5/14.
 */
public class Producer extends Thread {
    private static Vector<Object> data = new Vector<Object>();
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            data.add(new Object());
            if (data.size() > 1000)
                data.remove(data.size() - 1);
        }
    }
}
