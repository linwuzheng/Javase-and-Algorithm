package itheima.javapro.static01;

//访问User的成员变量，直接使用类
public class UserDemo01 {
    public static void main(String[] args) {
        System.out.println(User.userNumber);

        User u1 = new User();
        u1.name = "小名";
        u1.age = 19;
        System.out.println(u1.age);
        System.out.println(u1.name);



    }
}
