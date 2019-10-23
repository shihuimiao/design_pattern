package demo.guanchazhe;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-08-08 15:26
 */
public class Test {

    /**
    * 这里Observer和Observable类都用了jdk中自带的类
    * 研究代码可以查看源码
    */
    public static void main(String[] args) {

        Observer1Impl observer1 = new Observer1Impl();
        Observer2Impl observer2 = new Observer2Impl();

        ObservableImpl observable = new ObservableImpl();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.setChange("hha");
    }
}


class Observer1Impl implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        ObservableImpl o1 = (ObservableImpl) o;
        String data = o1.getData();
        System.out.println("1===" + data);
    }
}

class Observer2Impl implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        ObservableImpl o1 = (ObservableImpl) o;
        String data = o1.getData();
        System.out.println("2===" + data);
    }
}


class ObservableImpl extends Observable {

    private String data;

    public String getData() {
        return data;
    }

    public void setChange(String data) {

        this.data = data;

        setChanged();
        notifyObservers();
    }

}







