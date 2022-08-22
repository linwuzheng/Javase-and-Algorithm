package itheima.javapro.extends01;

//定义一个类然后继承
public class People {
    private String name;
    private int age;

    public void queryCourse(){
        System.out.println(name+"正在查看课程!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
