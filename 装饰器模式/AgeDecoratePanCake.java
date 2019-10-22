package demo.装饰器模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 10:15
 */
public class AgeDecoratePanCake extends AbstractDecoratePanCake {
    public AgeDecoratePanCake(IPanCake iPanCake) {
        super(iPanCake);
    }

    @Override
    public void cook() {
        System.out.println("add ages,");
        super.cook();
    }


}
