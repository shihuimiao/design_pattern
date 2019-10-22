package demo.策略者模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 21:24
 */
public class Test {

    public static void main(String[] args) {
        Duck greenDuck = new Duck(new FlyWithWing(), new Quack(), "green");
        Duck redDuck = new Duck(new FlyNoWay(), new MuteQuack(), "red");


        greenDuck.display();
        greenDuck.fly();
        greenDuck.quack();

        System.out.println("==========");

        redDuck.display();
        redDuck.fly();
        redDuck.quack();
    }
}
