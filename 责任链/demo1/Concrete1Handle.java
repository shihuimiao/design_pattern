package demo.责任链;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 14:20
 */
public class Concrete1Handle extends AbstractHandle {

    Concrete1Handle(){
        this.condition = 1;
    }

    @Override
    public void doSomeThing(int condition) {
        if (condition == this.condition) {
            System.out.println("this is concrete1Handle handle do something");
        } else if (getSuccess() != null) {
            AbstractHandle success = getSuccess();
            success.doSomeThing(condition);
        }
    }
}
