package itheima.javapro.extends01;

//继承people父类
public class Student extends People {
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private String className;

    public void writeInfo(){
        System.out.println(getName()+"今天棒棒哒~~~");
    }
}
