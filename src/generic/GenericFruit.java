package generic;

public class GenericFruit {

    //内部类 重写toString方法
   static class Fruit{
        @Override
        public String toString() {
            return "Fruit";
        }
    }

    static class Apple extends Fruit{
        @Override
        public String toString() {
            return "apple";
        }
    }

    static class Person {
        @Override
        public String toString() {
            return "person";
        }
    }

    //泛型类
    static class GenerateTest<T>{

        //普通方法
        public void show1(T t){
            System.out.println(t.toString());
        }

        //泛型类中声明了一个泛型方法，使用泛型E，
        //由于泛型方法在声明的时候会声明泛型 E，因此即使在泛型类中并没有声明泛型，但编译器也能正常识别。
        public <E> void show3(E e){
            System.out.println(e.toString());
        }

        //在泛型类中声明了一个泛型方法，使用泛型T
        //注意这个 T 是一个全新的类型。可以与泛型类中声明的 T 不是同一个类型
        public <T> void show2(T t){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {

        Apple apple = new Apple();
        Person person = new Person();

        GenerateTest<Fruit> generateTest = new GenerateTest<Fruit>();

        //因为 apple 是 fruit 的子类，所以这里可以
        generateTest.show1(apple);
        //编译报错，因为泛型类型置顶的是 Fruit,而传入的类型是 Person
//        generateTest.show1(person);


        generateTest.show2(apple);
        generateTest.show2(person);

        generateTest.show3(apple);
        generateTest.show3(person);

    }

}
