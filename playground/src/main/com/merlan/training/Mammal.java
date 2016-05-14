package main.com.merlan.training;

/**
 * Created by Administrator on 2016/5/14.
 */
public class Mammal {
    public String name;
    public int fre = 4;

    public Mammal(String name) {
        this.name = name;
    }

    public Mammal() {
       System.out.println("This is Mammal");
    }

    public void sing(String song) {
        for(int i = 0; i < fre;i ++) {
            System.out.println("Mammal is singing : " + song);
        }
    }
}
