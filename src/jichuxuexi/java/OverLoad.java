package jichuxuexi.java;

/*
方法的重载（overload）loading...
1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
“两同一不同”：同一个类、相同方法名
             参数列表不同：参数个数不同，参数类型不同
2.举例：
Arrays类中重载的sort（）/binarySearch（）
3.判断是否是重载：
   跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
4.在通过对象调用方法时，如何确定某一个指定的方法：
   方法名--->参数列表

1.jdk5.e新增的内容
2.具体使用：
2.1可变个数形参的格式：数据类型...变量名
2.2当调用可变个数形参的方法时，传入的参数个数可以是：个，1个，2个，。。。
2.3可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
2.4可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。换句话说，二者不能共存
2.5可变个数形参在方法的形参中，必须声明在未尾
2.6可变个数形参在方法的形参中，最多只能声明一个可变形参。
*/
public class OverLoad {
    public static void main(String[] args) {
        OverLoad test=new OverLoad();
        test.getSum(3,4);
    }
    //如下的4个方法构成了重载
    public void getSum(int i,int j) {
        System.out.println("1");
    }
    public void getSum(double d1,double d2){
        System.out.println("2");
        }
    public void getSum(String s,int i){
        System.out.println("3");
        }
    public void getSum(int i,String s){
        System.out.println("4");
                }
}
