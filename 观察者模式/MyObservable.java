package demo.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-08-08 16:22
 */
public class MyObservable {

    List<MyObserver> observers = new ArrayList();

    /**
     * 加入订阅
     * @return
     */
    public boolean addObserver(MyObserver o){

        if(o == null){
            return false;
        }

        if(observers.contains(o)){
            return false;
        }

        return observers.add(o);
    }

    /**
     * 移除订阅
     * @return
     */
    public boolean removeObserver(MyObserver o){
        if(o == null){
            return false;
        }

        if(!observers.contains(o)){
            return true;
        }

        return observers.remove(o);
    }

    /**
     * 发布事件
     */
    public void sendMsg(Book book){
        observers.forEach(v->{
            v.update(book);
        });
    }



}
