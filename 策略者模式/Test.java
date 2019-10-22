package demo.策略者模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 21:24
 */
public class Test {

    /**
    * “有一个”关系比“是一个”更好
    * 当你将两个类结合起来使用，如同本例一样，这就是组合
    * 这种做法和“继承”不同的地方在于，鸭子的行为不是继承来的，而是和适当的行为对象“组合”来的
    * 设计原则：多用组合，少用继承
    */
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
