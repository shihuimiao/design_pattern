package demo.策略者模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 21:25
 */
public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private String color;

    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, String color) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.color = color;
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public void display() {
        System.out.println("this is a " + this.color + " duck");
    }
}
