package keywordslearning;

/*3.使用static修饰属性：静态变量（或类变量）
        3.1属性，按是否使用static修饰，又分为：静态属性Vs非静态属性（实例变量）
        实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。
                 当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改。
        静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，
                 会导致其他对象调用此静态变量时，是修改过了的。
        3.2static修饰属性的其他说明：
        ④静态变量随着类的加载而加载。可以通过”类.静态变量”的方式进行调用
        ②静态变量的加载要早于对象的创建。
        由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中。
        ④         类变量       实例变量
            类      yes          no
            对象    yes          yes
         3.3静态属性举例：System.out；Math.PI；
 4.使用static修饰方法：静态方法
@随着类的加载而加载，可以通过“类。静态方法”的方式进行调用
②     静态方法      非静态方法
   类   yes           no
   对象  yes          yes
*/
public class StaticKeyWord {
    public static void main(String[] args) {
        Chinese.nation="中国";
        Chinese c1=new Chinese();
        c1.name="姚明";
        c1.age=40;
        c1.nation="CHN";
        Chinese c2=new Chinese();
        c2.name="马龙";
         c2.age=30;
         c2.nation="CHINA";
        System.out.println(c1.nation);
        //Chinese.name ="张继科";     编译不通过
        c1. eat();
        Chinese. show();
    }
}

    //中国人
    class Chinese {
        String name;
        int age;
        static String nation;

        public void eat() {
            System.out.println("中国人吃中餐");
        }
        public static void walk() {
            System.out.println("中国人在散步ing");
        }
        public static void show() {
            System.out.println("我是一个中国人！");
            //不能调用非静态的结构
           // eat();
           // name="Tom"；
            // 可以调用静态的结构
            System.out.println(Chinese.nation);
            walk();
        }
    }

