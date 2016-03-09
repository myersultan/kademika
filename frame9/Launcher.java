package one.day2;

/**
 * Created by yersultan on 3/9/16.
 */
public class Launcher {
    public static void main(String[] args) {
        Tank t1;
        t1 = new Tank("dark", 5, 60);
        System.out.println("tank color: " + t1.color + ", crew: " + t1.crew + ", maxSpeed: " + t1.maxSpeed);
    }


}
