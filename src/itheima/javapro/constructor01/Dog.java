package itheima.javapro.constructor01;

//定义子类的构造器
public class Dog extends Animal{
    public Dog(){
        System.out.println("这是子类无参构造器");
    }
    public Dog(String name){
        System.out.println("这是子类有参构造器");
    }


}
