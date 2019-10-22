package demo.策略者模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 21:32
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("can not quack");
    }
}
