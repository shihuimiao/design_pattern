package demo.策略者模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 21:28
 */
public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("use wing fly");
    }
}
