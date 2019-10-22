package demo.责任链;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 14:23
 */
public class Concrete2Handle extends AbstractHandle {

    Concrete2Handle(){
        this.condition = 2;
    }

    @Override
    public void doSomeThing(int condition) {
        if (condition == this.condition) {
            System.out.println("this is contrete2Handle handle do something");
        } else if (getSuccess() != null) {
            AbstractHandle success = getSuccess();
            success.doSomeThing(condition);
        }
    }
}
