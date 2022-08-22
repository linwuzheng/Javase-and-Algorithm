package jichuxuexi.java;

public class PersonLeiTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1. name="Tom";
        p1. isMale=true;
        System. out. println("名字叫"+p1. name);
        p1. eat(); 
        p1. sleep();
        p1. talk("Chinese");
    }
}
class Person {
    //属性
    String name;
    int age = 1;
    boolean isMale;
    //方法
    public void eat() {
        System.out.println("人可以吃饭");
    }
    public void sleep() {
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是："+language);
    }
}
