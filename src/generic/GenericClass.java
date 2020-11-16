package generic;


/*
* T：泛型标识,可以为任意标识，但为通俗易懂，尽量使用T/E/K/V标识泛型
* class 类名称 <T> {
*   private T var;
*
* }
* */

import java.util.ArrayList;
import java.util.List;

//实例化泛型时，必须置顶T为具体类型
public class GenericClass<T> {
    private T t; //这个成员变量的类型为 T，具体是什么类型，创建这个对象的时候必须指定，指定的 T 就是这个参数的类型

    public GenericClass() {
    }

    //构造参数 T 同上
    public GenericClass(T t) {
        this.t = t;
    }

    // set get 方法 T 同上
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    /*
    *
    * @param tClass 出入的泛型实参
    * @return T 返回值为 T 类型
    *
    * 注意：
    * 1.public 和 返回值中间的 <T> 非常重要，可以理解为声明此方法为泛型方法。
    * 2.只有声明了 <T> 的方法才是泛型方法，泛型类中的/使用了泛型的成员方法/并不是泛型方法。
    * 3.<T> 表明该方法将使用泛型类型 T,此时才可以在方法中使用泛型类型 T.
    * 4.与泛型的定义一样，此处 T 可以随便写为任意标识，常见的如 T、E、K、V等
    * */
    public <T> T genericMethod(Class<T> tClass)throws InstantiationException,IllegalAccessException{

        T instance = tClass.newInstance();
        return instance;
    }
}

class Test {
    public static void main(String[] args) {

//        GenericClass generic = new GenericClass<>();
//        generic.setT("1");
//        generic.setT(2.13f);
//        System.out.println(generic.getT());


        GenericClass<Double> generic = new GenericClass<>();
        generic.setT(2.14);

        List<?>[] ls = new ArrayList<?>[10];
    }
}
