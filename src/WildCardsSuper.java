import java.util.Arrays;
import java.util.List;

class MyClass3<T>{
    private T field;
    private List<? super T> list;

    public T getField() {
        return null;
    }

    public void setField(T field) {
        this.field = field;
    }

    public List<? super T> getList() {
        return list;
    }

    public void setList(List<? super T> list) {
        this.list = list;
    }
}

public class WildCardsSuper {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        MyClass3<Apple> myObject = new MyClass3<>();

        List<Fruit> list1 = Arrays.asList(new Fruit());
        List<Apple> list2 = Arrays.asList(new Apple());
        List<RedApple> list3 = Arrays.asList(new RedApple());

        myObject.setList(list1);
        myObject.setList(list2);
        //myObject.setList(list3);

        List<Fruit> resultList1 = (List<Fruit>) myObject.getList();
        Fruit fruit = resultList1.get(0);
        List<Apple> resultList2 = (List<Apple>) myObject.getList();
        Apple apple = resultList2.get(0);
//        List<RedApple> resultList3 = (List<RedApple>) myObject.getList();
//        RedApple redApple = resultList1.get(0);
    }
}
