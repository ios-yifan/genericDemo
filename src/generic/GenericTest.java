package generic;

public class GenericTest {

    //这个类是泛型类，类名后面加了<T>，T 标识任意类型
    public class Generic<T>{

        //T 类型的成员
        private T key;

        //构造方法
        public Generic(T key) {
            this.key = key;
        }

        //此方法虽然使用了泛型，但并不是一个泛型方法，T只是此方法的返回值
        //这只是一个普通的成员方法，因为 T 已经被泛型类声明，所以可以继续使用
        public T getKey() {
            return key;
        }

        /*
        这个方法是有问题的，编译器是会编译不过的
        因为在类的声明中并未声明泛型 E，所以在使用 E 做形参和返回值的时候，编译器会无法识别。
        public E setKey(E key) {
            this.key = key;
        }
         */
    }

    /*
    * 这才是一个真正的泛型方法
    * 首先，在public 和返回值之间 <T>，必不可少，这表明这是一个泛型方法，并且声明了一个泛型<T>
    * 这个 T 可以出现在这个泛型方法的任意位置
    * 泛型的数量也可以是任意的多个
    *
    *  eg: public <T,K> K showKeyName(Generic<T> container){
    *           ...
    *        }
    * */
    public <T> T showKeyName(Generic<T> container){
        System.out.println("container key:" + container.getKey());
        T test = container.getKey();
        return test;
    }

    // 这不是一个泛型方法，只是使用了 Generic<Number> 这个泛型类做形参而已
    public void showKeyValue1(Generic<Number> obj){
        System.out.println("key value is" + obj.getKey());
    }

    /*
    这个方法是有问题的，编译器会告诉我们找不到 E
    虽然我们声明了 T ，也表明了这是一个可以处理泛型的类型/的泛型方法
    但只声明了泛型类型 T，并未声明泛型类型 E ,因此编译器并不知道如何处理这个 E 类型
    public <T> T showKeyName(Generic<E> container){
        ...
    }
     */

    /*
    这个方法同样是有问题的，编译器会告诉我们找不到 T
    因为这个 T 类型，并未声明过，所以这也不是一个正确的泛型方法声明
    public void showKey(T genericObj){

    }
     */

}
