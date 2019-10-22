package demo.责任链;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 14:15
 */
public abstract class AbstractHandle {

    protected AbstractHandle success;

    protected int condition;

    public abstract void doSomeThing(int condition);

    public void setSuccess(AbstractHandle success) {
        this.success = success;
    }

    public AbstractHandle getSuccess() {
        return success;
    }
}
