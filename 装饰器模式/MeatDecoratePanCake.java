package demo.装饰器模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 10:18
 */
public class MeatDecoratePanCake extends AbstractDecoratePanCake {
    MeatDecoratePanCake(IPanCake iPanCake) {
        super(iPanCake);
    }

    @Override
    public void cook() {
        System.out.println("add meat,");
        super.cook();
    }

}
