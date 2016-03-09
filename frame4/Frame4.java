package one.day2;

/**
 * Created by yersultan on 3/9/16.
 */
public class Frame4 {
    public static void main(String[] args) {
        printTankInfo();
    }

    private static void printTankInfo() {
        Tank t1 = new Tank();
        System.out.println("tank color: " + t1.color + ", crew: " + t1.crew + ", maxSpeed: " + t1.maxSpeed);
    }
}
