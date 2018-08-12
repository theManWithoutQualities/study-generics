
class Fruit{}

class Apple extends Fruit{}

class RedApple extends Apple{}

class MyClass<T>{
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}

public class SimpleGeneric {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        MyClass<Apple> myObject = new MyClass<>();

        //myObject.setField(new Fruit());
        myObject.setField(new Apple());
        myObject.setField(new RedApple());

        Fruit field4 = myObject.getField();
        Apple field5 = myObject.getField();
        RedApple field6 = (RedApple) myObject.getField();
    }
}
