package itheima.java.forobject;
//为了更好的封装使用private修饰
//私有（private）成员变量，只能在当前类中访问，可以为其提供访问的方法
public class Student {
    private int age;

    public void setAge(int age){
        if(age > 0 && age <=120){
            this.age = age;
        }else {
            System.out.println("你输入的年龄有误");
        }
    }
    public int getAge(){
        return age;
    }
}
