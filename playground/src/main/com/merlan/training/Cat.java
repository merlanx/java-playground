package main.com.merlan.training;

/**
 * Created by Administrator on 2016/5/14.
 */
public class Cat extends  Mammal {
    public String name;
    public int fre = 2;
    public int leg;

    public Cat(String name) {
        super(name);
        System.out.println("This is Cat " + name);
        this.name = name;
    }

    public Cat() {
        super();
        System.out.println("This is Cat");
    }

    public void sing(String song) {
        for(int i = 0; i < fre;i ++) {
            System.out.println("Cat is singing : " + song);
        }
    }

    public void move() {
        for (int i = 0; i < leg; i++) {
            System.out.println("Cat is moving : " + i);
        }
    }
}
