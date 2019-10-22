package demo.策略者模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 21:29
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("can not fly");
    }
}
