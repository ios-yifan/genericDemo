package generic;

public class StaticGenerator<T> {

    /*
    * 如果在类中定义使用泛型的静态方法，需要添加额外的泛型声明（将这个方法定义成泛型方法）
    * 即使静态方法要使用泛型类中已经声明过的泛型也不可以
    * */
    public static <T> void show(T t){

    }

    /*
    public static void show(T t){}
    报错：
    'generic.StaticGenerator.this' cannot be referenced from a static context
     */
}
