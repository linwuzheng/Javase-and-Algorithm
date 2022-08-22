package itheima.java.forobject;

//实体类的使用
public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        u.setName("黑马武大郎");
        u.setSalary(3000);
        u.setHeight(175);
        System.out.println(u.getHeight());
        System.out.println(u.getName());
        System.out.println(u.getSalary());

        User u1 = new User("黑马西门庆",177,8000);
        System.out.println(u1.getHeight());
        System.out.println(u1.getName());
        System.out.println(u1.getSalary());
    }
}
