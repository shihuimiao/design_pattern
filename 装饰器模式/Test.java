package demo.装饰器模式;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 10:06
 */
public class Test {
    /**
     * 一个煎饼摊，
     * 人们去买煎饼（Pancake）
     * 有些人要加鸡蛋（Egg）的，有些人要加肉（Meat）的，
     * 上述的装饰器模式来进行编码。
     *
     * @param args
     */
    public static void main(String[] args) {
        //这是煎饼
        IPanCake iPanCake = new PanCake();

        //增加装饰   加辅料
        //加鸡蛋
        AgeDecoratePanCake ageDecoratePanCake = new AgeDecoratePanCake(iPanCake);
        //加肉
        MeatDecoratePanCake meatDecoratePanCake = new MeatDecoratePanCake(ageDecoratePanCake);
        meatDecoratePanCake.cook();
    }

}
