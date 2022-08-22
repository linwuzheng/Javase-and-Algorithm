package itheima.java.method;

//方法的运行机制，栈
public class MethodTest04 {
    public static void main(String[] args) {
        study();
    }
    public static void eat(){
        System.out.println("吃饭");
    }
    public static void sleep(){
        System.out.println("睡觉");
    }
    public static void study(){
        eat();
        System.out.println("学习");
        sleep();
    }

}
