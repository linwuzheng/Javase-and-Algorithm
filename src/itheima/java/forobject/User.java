package itheima.java.forobject;

//JavaBean——java实体类的创建及使用
/*1.成员变量使用private修饰
2.为成员变量提供get和set方法
3.提供无参构造器，可以没有有参构造器*/
public class User {
    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public User(){}

    private String name;
    private double height;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
