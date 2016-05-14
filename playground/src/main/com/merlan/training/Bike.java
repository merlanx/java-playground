package main.com.merlan.training;

/**
 * Created by Administrator on 2016/5/14.
 */
 public class Bike extends Paint{
    public int speedLimit = 90;

    public void run() {
        System.out.println("running by a Bike");
    }

    @Override
    public void paint() {
        System.out.println("Painting Bike");
    }
}

