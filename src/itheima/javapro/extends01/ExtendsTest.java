package itheima.javapro.extends01;

public class ExtendsTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("如花");
        s.setAge(19);
        s.setClassName("矿加202009");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getClassName());
        s.queryCourse();
        s.writeInfo();
    }

}
