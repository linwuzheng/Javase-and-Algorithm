package jichuxuexi.java;

public class PersonTest {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setAge(1);
        System.out.println(p1.getAge());
    }
}
/*
this关键字的使用：
1.this可以用来修饰：属性、方法、构造器
2.this修饰属性和方法：
this理解为：当前对象
在类的方法中，我们可以使用”this.属性”或”this.方法”的方式，调用当前对象属性或方法。
但是，通常情况下，我们都选择省略"this."特殊情况下，如果方法（或者是构造器）的形参和类的属性同名时，
我们必须显式的使用“this.变量”的方式，表明此变量是属性，而非形参。(如下)

 */
class Person1 {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge () {
            return age;
        }
}
