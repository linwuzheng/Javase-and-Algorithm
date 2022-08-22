package itheima.java.forobject;

//使用方法访问私有成员变量
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(23);
        System.out.println(s1.getAge());

        s1.setAge(-1);
    }
}
