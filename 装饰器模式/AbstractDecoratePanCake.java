package demo.装饰器模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 10:12
 */
public abstract class AbstractDecoratePanCake implements IPanCake {
    private IPanCake iPanCake;

    AbstractDecoratePanCake(IPanCake iPanCake) {
        this.iPanCake = iPanCake;
    }

    @Override
    public void cook() {
        if (this.iPanCake != null) {
            this.iPanCake.cook();
        }
    }
}
