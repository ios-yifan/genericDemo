package generic;

//定义了一个泛型接口,T为泛型参数
public interface GenericInterface<T> {
    public void fun(T t);
}

//class FruitGenerator<T> implements GenericInterface<T>{
//
//    @Override
//    public void fun(T t) {
//        System.out.println(t.toString());
//    }
//}

class FruitGenerator<K> implements GenericInterface<String>{

    private K k;

    @Override
    public void fun(String s) {
        System.out.println(s);
    }
}


class TestDemo {

    public static void main(String[] args) {

    }
}