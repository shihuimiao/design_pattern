package demo.责任链;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-10-22 14:26
 */
public class Test {

    public static void main(String[] args) {
        //有两个handle
        Concrete1Handle c1 = new Concrete1Handle();
        Concrete2Handle c2 = new Concrete2Handle();

        //组成链
        c1.setSuccess(c2);

        Integer[] arr = {2,1};
        List<Integer> integers = Arrays.asList(arr);
        integers.forEach(c1::doSomeThing);
    }
}
