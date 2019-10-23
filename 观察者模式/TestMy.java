package demo.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huimiao.shi  <huimiao.shi@beibei.com>
 * @Date: 2019-08-08 16:29
 */
public class TestMy {
    public static void main(String[] args) {
        Book book1 = new Book("book1", "name1");
        MyObserver1 myObserver1 = new MyObserver1();
        MyObserver2 myObserver2 = new MyObserver2();
        Library library = new Library();
        library.addObserver(myObserver1);
        library.addObserver(myObserver2);
        library.addBook(book1);
    }
}

class Book{
    private String name;
    private String auther;

    public Book(String name ,String auther){
        this.name = name;
        this.auther = auther;
    }

    public String getName(){
        return name;
    }
    public String getAuther(){
        return auther;
    }
}


class Library extends MyObservable{
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        this.sendMsg(book);
    }

}

class MyObserver1 implements MyObserver{
    @Override
    public void update(Book o){
        System.out.println("我是A 书名："+o.getName()+" 作者："+o.getAuther());
    }
}

class MyObserver2 implements MyObserver{
    @Override
    public void update(Book o){
        System.out.println("我是B 书名："+o.getName()+" 作者："+o.getAuther());
    }
}