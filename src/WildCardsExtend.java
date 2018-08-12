import java.util.Arrays;
import java.util.List;

class MyClass2<T>{
    private T field;
    private List<? extends T> list;

    public T getField() {
        return null;
    }

    public void setField(T field) {
        this.field = field;
    }

    public List<? extends T> getList() {
        return list;
    }

    public void setList(List<? extends T> list) {
        this.list = list;
    }
}

public class WildCardsExtend {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        MyClass2<Apple> myObject = new MyClass2<>();

        List<Fruit> list1 = Arrays.asList(new Fruit());
        List<Apple> list2 = Arrays.asList(new Apple());
        List<RedApple> list3 = Arrays.asList(new RedApple());

        //myObject.setList(list1);
        myObject.setList(list2);
        myObject.setList(list3);

//        List<Fruit> resultList1 = (List<Fruit>)myObject.getList();
//        Fruit fruit = resultList1.get(0);
        List<Apple> resultList2 = (List<Apple>) myObject.getList();
        Apple apple = resultList2.get(0);
        List<RedApple> resultList3 = (List<RedApple>) myObject.getList();
        RedApple redApple = resultList3.get(0);

    }
}
