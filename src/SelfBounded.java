import java.util.Arrays;
import java.util.List;

class BaseClass<T extends BaseClass<T>>{
    private T field;

    public T getField() {
        return null;
    }

    public void setField(T field) {
        this.field = field;
    }

}

class DerivedClass extends BaseClass<DerivedClass> {}

class BaseClassOrdinary{
    BaseClassOrdinary field;
    public void setField(BaseClassOrdinary field) {
        this.field = field;
        System.out.println("base");
    }
}

class DerivedClassOrdinary extends BaseClassOrdinary {

    //@Override
    public void setField(DerivedClassOrdinary field) {
        this.field = field;
        System.out.println("derived");
    }
}
public class SelfBounded {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        DerivedClass der1 = new DerivedClass();
        DerivedClass der2 = new DerivedClass();
        der1.setField(der2);
        DerivedClass field = der1.getField();
        BaseClass<DerivedClass> bas1 = new BaseClass<>();
        //der1.setField(bas1);

        DerivedClassOrdinary derivedClassOrdinary = new DerivedClassOrdinary();
        derivedClassOrdinary.setField(new DerivedClassOrdinary());
        derivedClassOrdinary.setField(new BaseClassOrdinary());
     }
}
